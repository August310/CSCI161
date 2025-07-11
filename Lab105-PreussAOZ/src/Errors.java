
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author August Preuss
 * @version 3/4/2025
 * Simple error class to have an error method that logs the errors found from processing files
 */
public class Errors {
    
    //checks if header is written
    private static boolean isHeaderWritten = false;
    
    /**
     * Writes to a file named errors.csv and writes a title at the top
     * @param filePath, whichever file we are processing is returned
     * @param lineNumber, line number where file error is spotted
     * @param data, the whole line of data from that given file
     */
    public static void logError(File filePath, int lineNumber, String data){
        
        try(PrintWriter errorWriter = new PrintWriter(new FileOutputStream("errors.csv", false))){
            //adds title if header hasn't been written for file yet
            if(!isHeaderWritten){
            errorWriter.println("File,Row,Data");
            isHeaderWritten = true;
            }
            //prints out the filepath, line number, and data for that file line
            errorWriter.printf("%s,%d,%s%n", filePath.getAbsoluteFile(), lineNumber, data);
            errorWriter.flush();
        }
        catch (IOException ioe){
            System.out.println("Error writing to errors.csv");
        }
    }
}
