package Questions.Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author araderma
 */
public class Question5Test {
    
    public Question5Test() {
    }
    
    @BeforeClass
    public static void setUpClass() throws FileNotFoundException
    {
        String file1 = "files/question5/file1.txt";
        String file2 = "files/question5/song.txt";
        
        File f1 = new File(file1);
        FileOutputStream fos = new FileOutputStream(f1, false);
        PrintWriter pw = new PrintWriter(fos);
        pw.println("This is the only line in this entire file.");
        pw.close();             
        
        File f2 = new File(file2);
        fos = new FileOutputStream(f2, false);
        pw = new PrintWriter(fos);
        pw.println("Oh, I'd love to be an Oscar Mayer wiener.\n" +
                 "That is what I'd truly like to be.\n" +
                 "'Cause if I were an Oscar Mayer wiener,\n" +
                 "Everyone would be in love with me.\n");
        pw.close();  
        
        
        System.out.println("Before Tests: ");
        System.out.println(file1 + ":");
        
        Scanner file = new Scanner(f1);
        
        while(file.hasNext())
        {
            System.out.println(file.nextLine());
        }
        
        System.out.println("\n"+ file2 + ":");
        file = new Scanner(f2);
        
        while(file.hasNext())
        {
            System.out.println(file.nextLine());
        } 
        
    }
    
    public static void resetFile1() throws FileNotFoundException
    {
        String file1 = "files/question5/file1.txt";
        
        File f1 = new File(file1);
        FileOutputStream fos = new FileOutputStream(f1, false);
        PrintWriter pw = new PrintWriter(fos);
        pw.println("This is the only line in this entire file.");
        pw.close(); 
    }
    
    public static void resetSong() throws FileNotFoundException
    {
        String file2 = "files/question5/song.txt";
        
        File f2 = new File(file2);
        FileOutputStream fos = new FileOutputStream(f2, false);
        PrintWriter pw = new PrintWriter(fos);
        pw.println("Oh, I'd love to be an Oscar Mayer wiener.\n" +
                 "That is what I'd truly like to be.\n" +
                 "'Cause if I were an Oscar Mayer wiener,\n" +
                 "Everyone would be in love with me.\n");
        pw.close(); 
    }
    
    @AfterClass
    public static void tearDownClass() throws FileNotFoundException
    {
        String file1 = "files/question5/file1.txt";
        String file2 = "files/question5/song.txt";
        
        File f1 = new File(file1);
        File f2 = new File(file2);
        
        System.out.println("\nAfter Tests: ");
        System.out.println(file1 + ":");
        
        Scanner file = new Scanner(f1);
        
        while(file.hasNext())
        {
            System.out.println(file.nextLine());
        }
        
        System.out.println("\n"+ file2 + ":");
        file = new Scanner(f2);
        
        while(file.hasNext())
        {
            System.out.println(file.nextLine());
        } 
    }
    
    @Test
    public void testQuestion5_Part1_TestForExceptions() 
    {
        try 
        {
            Question5.Part1("files/question5/testFilePleaseIgnore.txt", "Ignore Me!");
        } 
        catch (Exception e) 
        {
            fail("Caught Exception: " + e.toString());
        }
    }
    
    @Test
    public void testQuestion5_Part1_DoesNotOverwriteFile() throws FileNotFoundException
    {
        resetFile1();
        Question5.Part1("files/question5/file1.txt", "Not anymore!");
        
        Scanner file = new Scanner(new File("files/question5/file1.txt"));
        
        String actual = "";
        
        while(file.hasNext())
        {
            actual += file.nextLine() + "\n";
        }
        
        file.close();
        
        assertTrue("Fails if file is overwritten.", actual.contains("This is the only line in this entire file."));
    }
    @Test
    public void testQuesiton5_Part1_AppendsMessageToFile() throws FileNotFoundException
    {
        resetFile1();
        Question5.Part1("files/question5/file1.txt", "Not anymore!");
        
        Scanner file = new Scanner(new File("files/question5/file1.txt"));
        
        String actual = "";
        
        while(file.hasNext())
        {
            actual += file.nextLine() + "\n";
        }
        
        file.close();
        
        assertTrue("Fails if changes are not saved to file.", actual.contains("Not anymore!"));
    }
    @Test
    public void testQuestion5_Part2_DoesNotOverwriteFile() throws FileNotFoundException
    {
        resetSong();
        Question5.Part2();
        
        Scanner file = new Scanner(new File("files/question5/song.txt"));
        
        String actual = "";
        
        while(file.hasNext())
        {
            actual += file.nextLine() + "\n";
        }
        
        file.close();
        
        assertTrue("Fails if changes are not saved to file.", actual.contains("Oh, I'd love to be an Oscar Mayer wiener."));
    }
    @Test
    public void testQuestion5_Part2_AppendsCorrectTextToFile() throws FileNotFoundException
    {
        resetSong();
        Question5.Part2();
        
        Scanner file = new Scanner(new File("files/question5/song.txt"));
        
        String actual = "";
        
        while(file.hasNext())
        {
            actual += file.nextLine() + "\n";
        }
        
        file.close();
        
        assertTrue("Fails if changes are not saved to file.", 
                actual.contains("Oh, I'm glad I'm not an Oscar Mayer wiener.\n" +
                                "That is what I'd never want to be.\n" +
                                "Cause if I were an Oscar Mayer wiener.\n" +
                                "There would soon be nothing left of me!\n"));
    }
    
}
