
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author August Preuss
 * @version 3/4/2025
 * A class that processes the T-Bills files
 * 
 */
public class Bills {

    private static boolean isFirstFile = true;
    
    private static int lineNumber = 0;
    
    /**
     * Goes through the entire file and checks for proper input along with adding a header to the top if applicable
     * @param file, file in the given directory
     */
    public static void processFile(File file){
        
        
        
        try(Scanner parseFile = new Scanner(file)){
            
            
            //writes to the T-Bills.csv file
            FileOutputStream output = new FileOutputStream("T-bills.csv", false);
            
            PrintWriter write = new PrintWriter(output);
            
            
            //if this is first file then we add the header
            if(isFirstFile){
            write.println("SecurityTerm,CUSIP,IssueDate,MaturityDate,HighRate,InvestmentRate");
                isFirstFile = false;
                
            }
            
            boolean headerFound = false;
            //goes line by line to check for empty space or for final signs of the header AKA (InvestmentRate)
            while(parseFile.hasNextLine()){
                lineNumber++;
                String line = parseFile.nextLine().trim();
                if(line.isEmpty()){
                        continue;
                }
                //if we find end of header then we can continue into processing the file data
                if(line.contains("Investment Rate") || line.contains("InvestmentRate") || line.contains("Rate")){
                    headerFound = true;  
                        continue;
                }
                //we check through each set of data in the file per line and check that there is the correct amount/values
                if(headerFound){
                    Scanner lineScanner = new Scanner(line);
                
                    if(!lineScanner.hasNext()){
                        Errors.logError(file, lineNumber, line);
                        FileRecursion.incrementErrorsDetected();
                        continue;
                    }
                
                
        
                
            
                String securityTerm = lineScanner.next();
          
                if(!lineScanner.hasNext()){
                    Errors.logError(file, lineNumber, line);
                    FileRecursion.incrementErrorsDetected();
                    continue;
                }
                
                String cusip = lineScanner.next();
                
                if(!lineScanner.hasNext()){
                    Errors.logError(file, lineNumber, line);
                    FileRecursion.incrementErrorsDetected();
                    continue;
                }
                
                String issueDate = lineScanner.next();
                
                if(!lineScanner.hasNext()){
                    Errors.logError(file, lineNumber, line);
                    FileRecursion.incrementErrorsDetected();
                    continue;
                }
                
                String maturityDate = lineScanner.next();
               
                if(!lineScanner.hasNext()){
                    Errors.logError(file, lineNumber, line);
                    FileRecursion.incrementErrorsDetected();
                    continue;
                }
 
                String highRateStr = lineScanner.next();
                
                if(!lineScanner.hasNext()){
                    Errors.logError(file, lineNumber, line);
                    FileRecursion.incrementErrorsDetected();
                    continue;
                }
            
                String investmentRateStr = lineScanner.next();
                
                
                
                  
                //checks if out highRate and investmentRate end with a percentage 
                if(!highRateStr.endsWith("%") || !investmentRateStr.endsWith("%")){
                    Errors.logError(file, lineNumber, line);
                    FileRecursion.incrementErrorsDetected();
                    continue;
                }
                
                
                //formats the data into the way we want our output file to put it
                SimpleDateFormat inputDate = new SimpleDateFormat("MM/dd/yyyy");
                SimpleDateFormat outputDate = new SimpleDateFormat("yyyyMMdd");
                
                //reformats the decimal of the percentages in the file
                DecimalFormat reformat = new DecimalFormat("0.00000");
                
                String correctedIssueDate = outputDate.format(inputDate.parse(issueDate));
                
                String correctedMaturityDate = outputDate.format(inputDate.parse(maturityDate));
                
                double highRate = Double.parseDouble(highRateStr.replace("%", "")) / 100 ;
                
                double investmentRate = Double.parseDouble(investmentRateStr.replace("%", "")) / 100 ;
                
                //all data is written into the T-Bills.csv file here
                write.print(securityTerm + ", ");
                write.print(cusip + ", ");
                write.print(correctedIssueDate + ", ");
                write.print(correctedMaturityDate + ", ");
                write.print(reformat.format(highRate) + ", ");
                write.print(reformat.format(investmentRate) + "\n");
            
                //Each time we go through this a row is added to the incrementor
                FileRecursion.incrementRowsProcessed();
            
                }
            }
            write.close();
            //prints T-Bills data and errors data
            printFileContents("T-Bills.csv");
            
            printFileContents("errors.csv");
        }
        
        
        catch(FileNotFoundException fnef){
            System.out.println("File could not be found");
        }
        catch(ParseException pe){
            System.out.println("Date couldn't be parsed properly");
        }
    }
    
    /**
     * This method prints out everything inside of the T-Bills.csv and errors.csv files
     * @param fileName, takes in String of specific file we want to print 
     */
    public static void printFileContents(String fileName){
        File file = new File(fileName);
        
        //goes line by line printing out the code for the user to view
        try(Scanner scan = new Scanner(file)){
            while(scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
        }
        catch(FileNotFoundException fnef){
            System.out.println("File couldn't be found");
        }
    }
}
