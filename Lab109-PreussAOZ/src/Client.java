
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author August Preuss
 * @version 4/25/2025
 * Takes in a .csv file with bond info and puts it into an html page
 * 
 */
public class Client {

    
    public static void main(String[] args) {
        System.out.println("Please enter the absolute path of the file you wish to convert");
        
        
        //scan user input
        Scanner scan = new Scanner(System.in);
        File file;
        
        //arraybag declaring
        ArrayBag issueDate;
        ArrayBag denomination;
        ArrayBag serialNumber;
        
        
        System.out.println("Enter in the absolute path of the .csv file");
        //scans user input to get a file
        String fileName = scan.nextLine();
        
        file = new File(fileName);
        
        try{
            //we make a new scanner, and instantiation of arraybag
            Scanner fileScan = new Scanner(file);
            
            issueDate = new ArrayBag();
            
            denomination = new ArrayBag();
            
            serialNumber = new ArrayBag();
            
            //allows us to write to the html file for the bond info
            FileOutputStream fos = new FileOutputStream("C:\\Users\\xxdab\\OneDrive\\Desktop\\TrueTestPage.html", false);
            //printwriter object to write to the file
            PrintWriter pw = new PrintWriter(fos);
            
            //goes through entire .csv file
            while(fileScan.hasNextLine()){
                
                //goes line by line in the file
                String line = fileScan.nextLine();
                
                //makes a String array to assign the corresponding values to the given arraybag objects
                //this will be used in the future to write the new html code
                String[] items = line.split(",");
                if(items.length >= 4){
                    issueDate.add(items[0]);
                    denomination.add(items[1]);
                    serialNumber.add(items[2]);
                }
            }
            
            //start of the html file code prior to the hidden variables we want to change
            pw.print(Header.getHeader());
            
            //most of the rest of the code will follow this output, first we get the start of the input type for hidden variables
            String serialNumberLine = "<input type=\"hidden\" name=\"SerialNumList\" value=\"";
            
            //then we rely on the size of one of the arraybags to know how many bonds we have
            for(int i = 0; i < serialNumber.size(); i++){
                //we add the serialnumber to the end of the line and add a semi colon
                serialNumberLine += serialNumber.get(i) + ";";
                
            }
            
            //adds the end of the input line to close it off making it valid html code
            serialNumberLine += "\" />";
            //writes this new line to the html file
            pw.println(serialNumberLine);
            
            
            
            String issueDateLine = "<input type=\"hidden\" name=\"IssueDateList\" value=\"";
            
            for(int i = 0; i < issueDate.size(); i++){
               //we use an issuedateconverter method to turn the date into a number that the html file can understand
                issueDateLine += issueDateConverter((String) issueDate.get(i)) + ";";
              
            }
            
            issueDateLine += "\" />";
            pw.println(issueDateLine);
            
            
            String seriesLine = "<input type=\"hidden\" name=\"SeriesList\" value=\"";
            
            for(int i = 0; i < serialNumber.size(); i++){
                //we use the getSeries method to get the serialnumber letter which is either an I, EE, or E
                seriesLine += getSeries((String) serialNumber.get(i)) + ";";
                
            }
            
            seriesLine += "\" />";
            pw.println(seriesLine);
            
            
            String denominationLine = "<input type=\"hidden\" name=\"DenominationList\" value=\"";
            
            for(int i = 0; i < denomination.size(); i++){
                denominationLine += denomination.get(i) + ";";
            }
            
            denominationLine += "\" />";
            pw.println(denominationLine);
            
            
            
            String issuePriceLine = "<input type=\"hidden\" name=\"IssuePriceList\" value=\"";
            
            for(int i = 0; i < denomination.size(); i++){
                issuePriceLine += "0" + ";";
            }
            
            issuePriceLine += "\" />";
            pw.println(issuePriceLine);
            
            
            
            String interestLine = "<input type=\"hidden\" name=\"InterestList\" value=\"";
            
            //simple placeholder values are added to the html file
            for(int i = 0; i < serialNumber.size(); i++){
               interestLine += "0.00" + ";";
            }
            
            interestLine += "\" />";
            pw.println(interestLine);
            

            
            String yearTDInterestLine = "<input type=\"hidden\" name=\"YTDInterestList\" value=\"";
            
            
            for(int i = 0; i < serialNumber.size(); i++){
                yearTDInterestLine += "0.00;";
            }

            yearTDInterestLine += "\" />";
            pw.println(yearTDInterestLine);
            
            
            
            String valueLine = "<input type=\"hidden\" name=\"ValueList\" value=\"";
            
            for(int i = 0; i < serialNumber.size(); i++){
                valueLine += "0;";
            }

            valueLine += "\" />";
            pw.println(valueLine);



            String interestRateLine = "<input type=\"hidden\" name=\"InterestRateList\" value=\"";

            for(int i = 0; i < serialNumber.size(); i++){
                interestRateLine += "0.00;";
            }
            
            interestRateLine += "\" />";
            pw.println(interestRateLine);
            
            
            
            
            String nextAccuralDateLine = "<input type=\"hidden\" name=\"NextAccrualDateList\" value=\"";
            //this date is the same for every bond
            for(int i = 0; i < serialNumber.size(); i++){
                nextAccuralDateLine += "1009;";
            }
            
            nextAccuralDateLine += "\" />";
            pw.println(nextAccuralDateLine);
            
            
            String maturityDateLine = "<input type=\"hidden\" name=\"MaturityDateList\" value=\"";
            //we use the issueDateConverter and then add 360 to make the maturity date, 30 years in the future if the initial bond
            for(int i = 0; i < serialNumber.size(); i++){
                maturityDateLine += (issueDateConverter((String) issueDate.get(i)) + 360) + ";";
            }
            
            maturityDateLine += "\" />";
            pw.println(maturityDateLine);
            
            
            
            String noteLine = "<input type=\"hidden\" name=\"NoteList\" value=\"";
            
            for(int i = 0; i < serialNumber.size(); i++){
                noteLine += " ;";
            }
            
            noteLine += "\" />";
            pw.println(noteLine);
            
            
            String oldRedemptionDateLine = "<input type=\"hidden\" name=\"OldRedemptionDate\" value=\"";
            
            //static value
            oldRedemptionDateLine += "782";
            oldRedemptionDateLine += "\" />";
            pw.println(oldRedemptionDateLine);
            
            
            
            String viewPosLine = "<input type=\"hidden\" name=\"ViewPos\" value=\"";
            
            //number changes depending on amount of bonds
            viewPosLine += serialNumber.size();
            viewPosLine += "\" />";
            pw.println(viewPosLine);
            
            
            String viewTypeLine = "<input type=\"hidden\" name=\"ViewType\" value=\"";
            
            //static value
            viewTypeLine += "Partial";
            viewTypeLine += "\" />";
            pw.println(viewTypeLine);
            
            
            String versionLine = "<input type=\"hidden\" name=\"Version\" value=\"";
            
            //static value
            versionLine += "6";
            versionLine += "\" />";
            pw.println(versionLine);
            
            pw.println("</fieldset>");
            
            
            
            //we print the end of the html file that comes after the hidden variables section
            pw.print(Footer.getFooter());
            
            pw.close();
            
        }
        
        
        //makes sure file is found that we enter in
        catch(FileNotFoundException fnef){
            System.out.println("File couldn't be found");
        }
    }
    
    /**
     * converts the date in the .csv file into an int value that the html file can read
     * @param date, the date that is in the .csv in MM/DD/YYYY format
     * @return an int value that the html file can read
     */
    public static int issueDateConverter(String date){
        String[] dateParts = date.split("/");
        
        int month = Integer.parseInt(dateParts[0]);
        int year  = Integer.parseInt(dateParts[2]);
        
        return ((year - 1941) * 12) - (4 - month);
    }
    
    /**
     * checks for the starting and ending letters to find out what series the bond is
     * @param serialNumber, the serial number that tells you what kind of bond it is
     * @return a string of the letter that is found in the given type of bond
     */
    public static String getSeries(String serialNumber){
        if(serialNumber.startsWith("I") || serialNumber.endsWith("I")){
            return "I";
        }
        else if(serialNumber.endsWith("EE")){
            return "EE";
        }
        else if(serialNumber.endsWith("E")){
            return "E";
        }
        else{
            return "EE";
        }
            
    }
    
    
    
}

