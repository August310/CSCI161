package Questions;

import Questions.Question2;
import ProvidedClasses.Student;
import Questions.Question2;
import java.io.File;
import java.util.Scanner;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author araderma
 */
public class Question2Test {
    
    private static Student student0, student1, student2, student3; 
    private static String oldName, newName; 
    private static int oldScore, newScore; 
    
    @BeforeClass
    public static void setupClass() 
    {
        Object[] results = Question2.method(); 
        
        student0 = (Student) results[0];
        student1 = (Student) results[1];
        student2 = (Student) results[2];
        student3 = (Student) results[3];
        oldName  = (String)  results[4];
        oldScore = (int)     results[5];
        newName  = (String)  results[6];
        newScore = (int)     results[7];
        
        outputValues(results);
        
    }
    
    public static void outputValues(Object[] results)
    {
        
        System.out.println("Question 2 Values: ");
        System.out.println("student0: " + results[0]);
        System.out.println("student1: " + results[1]);
        System.out.println("student2: " + results[2]);
        System.out.println("student3: " + results[3]);
        System.out.println("oldName: " + results[4]);
        System.out.println("oldExamScore: " + results[5]);
        System.out.println("newName: " + results[6]);
        System.out.println("newExamScore: " + results[7]);
    }
    
    public static void hardCodeCheck(String checkFor, int part) {
        try {
            boolean flag;
            try (Scanner file = new Scanner(new File("src/Questions/Question2.java"))) {
                flag = false;
                while (file.hasNext()) {
                    String line = file.nextLine();
                    line = line.replaceAll("\\s", "");
                    line = line.replaceAll("\\(", "");
                    line = line.replaceAll("\\)", "");

                    if(line.contains(checkFor))
                    {
                        flag = true;
                        break;
                    }
                }
            }
            
            if(flag)
            {
                fail("It appears as though you have hard-coded part " + part + ". You will need to use the appropriate accessor method.");
            }
        }
        catch(Exception e)
        {
            fail("Something has gone horribly wrong: " + e.getMessage());
        }
    }

    
    public static String getConstructorMethodUsed(Student student)
    {
        if (student.getID() == 9988779)
        {
            return "Student(String name)";
        }
        else if (student.getID() == 12345 && student.getFirstExamScore() == 57 && student.getSecondExamScore() == 82 && student.getThirdExamScore() == 73)
        {
            return "Student()";
        }
        else if (student.getFirstExamScore() == 0 && student.getSecondExamScore() == 2 && student.getThirdExamScore() == 0)
        {
            return "Student(String name, int ID)";
        }
        else
        {
            return "Student(String name, int ID, int exam1score, int exam2score, int exam3score)"; 
        }
    }
    
    
    @Test
    public void testQuestion2_Part1_CorrectResult()
    {
        hardCodeCheck("oldName=\"JohnDoe\"", 1);
        assertEquals("This test fails if the variable oldName has the incorrect result", "John Doe", oldName);
    }
    
    
    @Test
    public void testQuestion2_Part2_CorrectResult()
    {
        hardCodeCheck("oldExamScore=0", 2);
        assertEquals("This test fails if the variable OldExamScore has the incorrect result", 0, oldScore);
    }
    
    @Test
    public void testQuestion2_Part3_4_CorrectResult()
    {
        assertNotSame("This test fails if the name of student1 was not properly changed", oldName, student1.getName());
    }

    @Test
    public void testQuestion2_Part5_IsNotHardCoded()
    {
        String newNameStripped = newName.replaceAll("\\s", "");
        hardCodeCheck("newName=\""+newNameStripped+"\"", 5);
    }
    
    @Test
    public void testQuestion2_Part6_7_CorrectResult()
    {
        assertNotSame("This test fails if the exam scores for student2 were not properly changed", oldScore, student2.getFirstExamScore());
    }
    
    @Test
    public void testQuestion2_Part8_IsNotHardCoded()
    {
        hardCodeCheck("newExamScore="+student2.getFirstExamScore(), 8);
    }
    
    @Test
    public void testQuestion2_Part9_CorrectResult()
    {
        assertNotSame("This test fails if the name the student refernced by student3 was not changed from Farris Bueller.", "Farris Bueller", student3.getName());
    }
}
