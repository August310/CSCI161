package Questions;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;
import static org.junit.Assert.*;

public class Question3Test {
    
    public Question3Test() 
    {
        
    }

    @Test
    public void testQuestion3Output() {
        System.out.println("\nQuestion 4 Output: ");
        Employee testEmployee = new Employee();
        
        System.out.println("Output for testStudent = " + testEmployee);
        
        PrintStream out = System.out; 
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        
        Question3.question3(testEmployee);
        System.setOut(out);
        
        System.out.println(output.toString());
        
        testEmployee =  new Employee("Keanu Reeves", 10010, 78000.00); 
        System.out.println("Output for testEmployee = " + testEmployee);
        
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        
        Question3.question3(testEmployee);
        System.setOut(out);
        
        System.out.println(output.toString());
        
    }
    
    @Test
    public void testQuestion3_defaultStudent_IsEqual()
    {
        Employee testStudent = new Employee();

        PrintStream out = System.out; 
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        
        Question3.question3(testStudent);
        System.setOut(out);
        
        String[] lines = output.toString().split(System.getProperty("line.separator"));
        
        assertEquals("The testEmployee is the same as the default employee.", lines[0].trim());
    }
    
    @Test
    public void testQuestion3_keanuEmployee_IsEqual()
    {
        Employee testStudent = new Employee("Keanu Reeves", 10010, 78000.00);
        
        PrintStream out = System.out; 
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        
        Question3.question3(testStudent);
        System.setOut(out);
        
        String[] lines = output.toString().split(System.getProperty("line.separator"));
        
        assertEquals("The testEmployee is the same as keanuEmployee. Excellent!", lines[0].trim());
    }
    
    @Test
    public void testQuestion3_testEmployee_IsNotEqual()
    {
        Employee testStudent = new Employee("Bill Gates", 1, 3450000.00);
        
        PrintStream out = System.out; 
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        
        Question3.question3(testStudent);
        System.setOut(out);
        
        String[] lines = output.toString().split(System.getProperty("line.separator"));
        
        assertEquals("The test employee was not the same as either of the employees I constructed.", lines[0].trim());
    }
    
    @Test
    public void testQuestion3_testEmployee_MemoryLocationNotEqual()
    {
        Employee testStudent = new Employee("Keanu Reeves", 10010, 78000.00);
        
        PrintStream out = System.out; 
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        
        Question3.question3(testStudent);
        System.setOut(out);
        
        String[] lines = output.toString().split(System.getProperty("line.separator"));
        
        assertEquals("The testEmployee and keanuEmployee object references don't refer to the same memory location.", lines[1].trim());
    }
    
    @Test
    public void testQuestion3_excellentEmployee_MemoryLocationIsEqual()
    {
        Employee testStudent = new Employee("Bill Gates", 1, 3450000.00);
        
        PrintStream out = System.out; 
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        
        Question3.question3(testStudent);
        System.setOut(out);
        
        String[] lines = output.toString().split(System.getProperty("line.separator"));
        
        assertEquals("The excellentEmployee and keanuEmployee object references refer to the same memory location.", lines[2].trim());
    }
    
}
