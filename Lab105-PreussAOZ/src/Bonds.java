
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
 * @version 3/04/2025
 * A class that processes the Bonds files
 * 
 */
public class Bonds {
    
    
    private static boolean isFirstFile = true;
    
    private static int lineNumber = 0;
    
    /**
     * Processes the bonds files by checking for valid input and eventually outputting it to the user
     * @param file, file in the given directory
     */
    public static void processFile(File file){
        
        
        
        try(Scanner parseFile = new Scanner(file)){
            
            
            //writes to the bonds.csv file
            FileOutputStream output = new FileOutputStream("bonds.csv", false);
            
            PrintWriter write = new PrintWriter(output);
            
            
            //checks if file is first, if it is then add the header
            if(isFirstFile){
            write.println("SecurityTerm,CUSIP,Reopening,IssueDate,MaturityDate,HighRate,InterestRate");
                isFirstFile = false;
                
            }
            
            boolean headerFound = false;
            //checks for empty space and once final header word is found
            while(parseFile.hasNextLine()){
                lineNumber++;
                String line = parseFile.nextLine().trim();
                if(line.isEmpty()){
                        continue;
                }
                if(line.contains("Interest Rate") || line.contains("InterestRate") || line.contains("Rate")){
                    headerFound = true;  
                        continue;
                }
                //if we found end of header then we can process file data
                if(headerFound){
                    Scanner lineScanner = new Scanner(line);
                //we check for valid amount of data and proper data
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
                
                
                String reopening = lineScanner.next();
                
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
            
                String interestRateStr = lineScanner.next();
                
                
                //checks that the rates are percentages
                if(!highRateStr.endsWith("%") || !interestRateStr.endsWith("%")){
                    Errors.logError(file, lineNumber, line);
                    FileRecursion.incrementErrorsDetected();
                    continue;
                }
                //makes sure reopening is only yes or no
                if(!reopening.contains("Yes") && !reopening.contains("No")){
                    Errors.logError(file, lineNumber, line);
                    FileRecursion.incrementErrorsDetected();
                    continue;
                }
                //makes sure security term is only 20 or 30 years
                if(!securityTerm.contains("20-Year") && !securityTerm.contains("30-Year")){
                    Errors.logError(file, lineNumber, line);
                    FileRecursion.incrementErrorsDetected();
                    continue;
                }
                
                //we reformat the data with this class
                SimpleDateFormat inputDate = new SimpleDateFormat("MM/dd/yyyy");
                SimpleDateFormat outputDate = new SimpleDateFormat("yyyyMMdd");
                //reformats the percentage into a decimal
                DecimalFormat reformat = new DecimalFormat("0.00000");
                
                String correctedIssueDate = outputDate.format(inputDate.parse(issueDate));
                
                String correctedMaturityDate = outputDate.format(inputDate.parse(maturityDate));
                
                double highRate = Double.parseDouble(highRateStr.replace("%", "")) / 100 ;
                
                double interestRate = Double.parseDouble(interestRateStr.replace("%", "")) / 100 ;
                //all finalized data is printed out and put into the bonds.csv file
                write.print(securityTerm + ", ");
                write.print(cusip + ", ");
                write.print(reopening + ", ");
                write.print(correctedIssueDate + ", ");
                write.print(correctedMaturityDate + ", ");
                write.print(reformat.format(highRate) + ", ");
                write.print(reformat.format(interestRate) + "\n");
            
                //increment a row processed and then repeat the process until no more rows left
                FileRecursion.incrementRowsProcessed();
            
                }
            }
            write.close();
            //prints out end result of both bonds and errors files
            printFileContents("bonds.csv");
            
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
     * prints out the file contents of the files we created prior
     * @param fileName, file that we created 
     */
    public static void printFileContents(String fileName){
        File file = new File(fileName);
        //goes through each line of the file and prints out the output
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
    
    
    
    
    

