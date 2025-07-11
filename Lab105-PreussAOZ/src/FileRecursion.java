import java.io.File;
import java.util.Scanner;
/**
 *
 * @author August Preuss
 * @version 3/4/2025
 * Partially Transcribed from Lab104 Solutions for FileRecursion, plenty was changed and adapted for this assignment
 * 
 */

public class FileRecursion {
    
    private static int filesProcessed = 0;
    private static int rowsProcessed = 0;
    private static int errorsDetected = 0;
    
    
    /**
     * This calls the find method, it checks for a valid directory and gives the output of files, row, and errors processed
     */
    public static void callFind() {
        System.out.println("Finding files");

        
        File start;         // File of directory to start searching in.
              
        start = FileRecursion.getValidDirectory();
            
        if(start != null){
        find(start);
            System.out.println("Number of files processed: " + filesProcessed);
            System.out.println("Number of rows processed: " + rowsProcessed);
            System.out.println("Number of errors detected: " + errorsDetected);
        }
        else{
            System.out.println("Invalid directory");
        }
    }
    
    
    
    /**
     * Creates an array of files and picks through to process each file in directory
     * @param startDirectory, start input from user
     */
    private static void find(File startDirectory) {

        File[] fileTable = startDirectory.listFiles();

        if (fileTable != null) {  // Don't process directories that have null file tables (i.e. empty directories).
            for (File file : fileTable) {
                // base case, file table entry is a file
                if (file.isFile()){
                    filesProcessed++;
                    processFileLocation(file);
                } else if (file.isDirectory()){
                    // general case, file table entry is a directory
                    find(file);
                }
            }
        }
    }
    
    /**
     * Makes sure file is a directory
     * @return file if its a valid directory
     */
    private static File getValidDirectory() {

        Scanner scan = new Scanner(System.in);

        boolean validDirectory = false;

        File directory = null;

        while (!validDirectory) {

            System.out.print("Enter the absolute path for the directory:  ");

            String absolutePath = scan.nextLine();

            directory = new File(absolutePath);

            
            if (!directory.exists() || !directory.isDirectory()) {

                System.out.printf("ERROR: Directory %s does not exits.  \nType QUIT to exit  OR  ", absolutePath);

                // Allow user to give up, exit the method and return null.
                if (absolutePath.equalsIgnoreCase("QUIT")) {
                    return null;
                }

            } else {
                validDirectory = true;
            }
        }

        return directory;

    }    
    
    /**
     * Checks for which file type to process, makes sure file corresponds with how it will be processed
     * @param file 
     */
    public static void processFileLocation(File file){
        String fileName = file.getName().toLowerCase();
        
        if(fileName.contains("bills")){
            Bills.processFile(file);
        }
        else if(fileName.contains("bonds")){
            Bonds.processFile(file);
        }
        else if(fileName.contains("notes")){
            Notes.processFile(file);
        }
        else{
            System.out.println("File couldn't be found");
        }
    }
    /**
     * increments rows as we process files
     */
    public static void incrementRowsProcessed(){
        rowsProcessed++;
    }
    /**
     * increments errors as we process errors
     */
    public static void incrementErrorsDetected(){
        errorsDetected++;
    }
   
}


