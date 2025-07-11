
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
 * A class that processes the Notes files
 * 
 */
public class Notes {
    
    
    private static boolean isFirstFile = true;
    
    private static int lineNumber = 0;
    
    /**
     * processes and checks for proper input in the notes files
     * @param file, a given note file entered from a valid directory
     */
    public static void processFile(File file){
        
        
        
        try(Scanner parseFile = new Scanner(file)){
            
            
            //prints out data into this new file we created
            FileOutputStream output = new FileOutputStream("notes.csv", false);
            
            PrintWriter write = new PrintWriter(output);
            
            
            //if first file then we print out the header
            if(isFirstFile){
            write.println("SecurityTerm,CUSIP,Reopening,IssueDate,MaturityDate,HighRate,InterestRate");
                isFirstFile = false;
                
            }
            
            boolean headerFound = false;
            //check for empty space and end of header
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
                //if end of header is found then we process file data
                if(headerFound){
                    Scanner lineScanner = new Scanner(line);
                    //makes sure proper amount of data and correct data is in the file
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
                
                
                //checks if the rates end with a percentage
                if(!highRateStr.endsWith("%") || !interestRateStr.endsWith("%")){
                    Errors.logError(file, lineNumber, line);
                    FileRecursion.incrementErrorsDetected();
                    continue;
                }
                //checks if reopening is a yes or no
                if(!reopening.contains("Yes") && !reopening.contains("No")){
                    Errors.logError(file, lineNumber, line);
                    FileRecursion.incrementErrorsDetected();
                    continue;
                }
                
                
                //reformats the date with this class
                SimpleDateFormat inputDate = new SimpleDateFormat("MM/dd/yyyy");
                SimpleDateFormat outputDate = new SimpleDateFormat("yyyyMMdd");
                //reformats percentage into a decimal
                DecimalFormat reformat = new DecimalFormat("0.00000");
                
                String correctedIssueDate = outputDate.format(inputDate.parse(issueDate));
                
                String correctedMaturityDate = outputDate.format(inputDate.parse(maturityDate));
                
                double highRate = Double.parseDouble(highRateStr.replace("%", "")) / 100 ;
                
                double interestRate = Double.parseDouble(interestRateStr.replace("%", "")) / 100 ;
                //prints out all of the output for this given line into our new file
                write.print(securityTerm + ", ");
                write.print(cusip + ", ");
                write.print(reopening + ", ");
                write.print(correctedIssueDate + ", ");
                write.print(correctedMaturityDate + ", ");
                write.print(reformat.format(highRate) + ", ");
                write.print(reformat.format(interestRate) + "\n");
            
                //rows goes up after each line is processed
                FileRecursion.incrementRowsProcessed();
            
                }
            }
            write.close();
            //prints out contents of notes and errors files
            printFileContents("notes.csv");
            
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
     * Goes through the file we made and prints out the contents
     * @param fileName, file we created
     */
    public static void printFileContents(String fileName){
        File file = new File(fileName);
        //goes through and prints out the data in the file
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
    

