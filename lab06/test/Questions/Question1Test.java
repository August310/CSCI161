/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Questions;

import ProvidedClasses.Student;
import static org.junit.Assert.*;
import org.junit.Test;


public class Question1Test {
    
    public Question1Test() 
    {
        
    }
    
   

    /**
     * Test of question1 method, of class Question1.
     */
    @Test
    public void testQuestion1Output() 
    {
        System.out.println("\nQuestion 1 Output:"); 
        int age = 21;
        String personName = "Adam West"; 
        Student aStudent = new Student("Andrea Bloomington", 234514); 
        aStudent.setExamScores(80, 85, 95);
        boolean a = true;
        boolean b = true; 
        
        boolean[] result = Question1.question1(age, personName, aStudent, a, b);
        
        System.out.println("condition1 is: " + result[0] + " for age = " + age);
        System.out.println("condition2 is: " + result[1] + " for personName = " + personName);
        System.out.println("condition3 is: " + result[2] + " for aStudent = " + aStudent);
        System.out.println("condition4 is: " + result[3] + " for personName = " + personName + " and aStudent = " + aStudent);
        System.out.println("condition5 is: " + result[4] + " for a = " + a + " and b = " + b);
    }
    
    @Test
    public void testQuestion1_condition1_BelowBoundary()
    {
        boolean[] results = Question1.question1(64, "Dave", new Student(), true, true);
        
        String message = "Your conditional expression should evaluate to true when age is 64";
        assertFalse(message, results[0]);
    }
    
    @Test
    public void testQuestion1_condition1_AboveBoundary()
    {
        boolean[] results = Question1.question1(66, "Dave", new Student(), true, true);
        
        String message = "Your conditional expression should evaluate to true when age is 66";
        assertTrue(message, results[0]);
    }
    
    @Test
    public void testQuestion1_condition1_OnBoundary()
    {
        boolean[] results = Question1.question1(65, "Dave", new Student(), true, true);
        
        String message = "Your conditional expression should evaluate to true when age is 65";
        assertTrue(message, results[0]);
    }
    
    @Test
    public void testQuestion1_condition2_BeforeBoundary()
    {
        boolean[] results = Question1.question1(24, "Mark", new Student(), true, true);
        
        String message = "Your conditional expression should evaluate to true when personName is Mark";
        assertTrue(message, results[1]);
    }
    
    @Test
    public void testQuestion1_condition2_OnBoundary()
    {
        boolean[] results = Question1.question1(24, "Nancy", new Student(), true, true);
        
        String message = "Your conditional expression should evaluate to false when personName is Nancy";
        assertFalse(message, results[1]);
    }
    
    @Test
    public void testQuestion1_condition2_AfterBoundary()
    {
        boolean[] results = Question1.question1(24, "Stephanie", new Student(), true, true);
        
        String message = "Your conditional expression should evaluate to false when personName is Stephanie";
        assertFalse(message, results[1]);
    }
    
    @Test
    public void testQuestion1_condition3_BelowBoundary()
    {
        boolean[] results = Question1.question1(24, "Stephanie", new Student("Joe", 1234), true, true);
        
        String message = "Your conditional expression should evaluate to true for a student with ID 1234";
        assertTrue(message, results[2]);
    }
    
    @Test
    public void testQuestion1_condition3_OnBoundary()
    {
        boolean[] results = Question1.question1(24, "Stephanie", new Student("Joe", 1234567), true, true);
        
        String message = "Your conditional expression should evaluate to true for a student with ID 1234567";
        assertTrue(message, results[2]);
    }
    
    @Test
    public void testQuestion1_condition3_AboveBoundary()
    {
        boolean[] results = Question1.question1(24, "Stephanie", new Student("Joe", 12345678), true, true);
        
        String message = "Your conditional expression should evaluate to false for a student with ID 12345678";
        assertFalse(message, results[2]);
    }
    
    @Test
    public void testQuestion1_condition4_InRange()
    {
        boolean[] results = Question1.question1(21, "Dave", new Student(), true, true);
        
        String message = "Your conditional expression should evaluate to true when age is 21";
        assertTrue(message, results[3]);
    }
    
    @Test
    public void testQuestion1_condition4_OutRangeLow()
    {
        boolean[] results = Question1.question1(17, "Dave", new Student(), true, true);
        
        String message = "Your conditional expression should evaluate to false when age is 17";
        assertFalse(message, results[3]);
    }
    
    @Test
    public void testQuestion1_condition4_OutRangeHigh()
    {
        boolean[] results = Question1.question1(25, "Dave", new Student(), true, true);
        
        String message = "Your conditional expression should evaluate to false when age is 25";
        assertFalse(message, results[3]);
    }
    
    @Test
    public void testQuestion1_condition4_BoundaryLow()
    {
        boolean[] results = Question1.question1(18, "Dave", new Student(), true, true);
        
        String message = "Your conditional expression should evaluate to true when age is 18";
        assertTrue(message, results[3]);
    }
    
    @Test
    public void testQuestion1_condition4_BoundaryHigh()
    {
        boolean[] results = Question1.question1(24, "Dave", new Student(), true, true);
        
        String message = "Your conditional expression should evaluate to true when age is 24";
        assertTrue(message, results[3]);
    }
    
  
    
    @Test
    public void testQuestion1_condition5_FirstLetterA()
    {
        boolean[] results = Question1.question1(18, "Anne", new Student(), true, true);
        
        String message = "Your conditional expression should evaluate to true when personName is Anne";
        assertTrue(message, results[4]);
    }
    
    @Test
    public void testQuestion1_condition5_LastLettera()
    {
        boolean[] results = Question1.question1(18, "Roberta", new Student(), true, true);
        
        String message = "Your conditional expression should evaluate to true when personName is Roberta";
        assertTrue(message, results[4]);
    }
    
    @Test
    public void testQuestion1_condition5_FirstLastLettersA()
    {
        boolean[] results = Question1.question1(18, "Angela", new Student(), true, true);
        
        String message = "Your conditional expression should evaluate to true when personName is Angela";
        assertTrue(message, results[4]);
    }
    
    @Test
    public void testQuestion1_condition5_NeitherFirstOrLastA()
    {
        boolean[] results = Question1.question1(18, "Paul", new Student(), true, true);
        
        String message = "Your conditional expression should evaluate to false when personName is Paul";
        assertFalse(message, results[4]);
    }
    
    @Test
    public void testQuestion1_condition6_PassingStudent()
    {
        Student testStudent = new Student("Sasha Greenwood", 12345); 
        testStudent.setExamScores(70, 75, 80);
        boolean[] results = Question1.question1(18, "Angela", testStudent, true, true);
        
        String message = "Your conditional expression should evaluate to true for the student: " + testStudent;
        assertTrue(message, results[5]);
    }
    
    @Test
    public void testQuestion1_condition6_FailingStudent()
    {
        Student testStudent = new Student("Jason Blackstone", 8675309); 
        testStudent.setExamScores(50, 55, 60);
        boolean[] results = Question1.question1(18, "Angela", testStudent, true, true);
        
        String message = "Your conditional expression should evaluate to false for the student: " + testStudent;
        assertFalse(message, results[5]);
    }
    
    @Test
    public void testQuestion1_condition6_BarelyPassingStudent()
    {
        Student testStudent = new Student("Nathan Pinkerton", 75423); 
        testStudent.setExamScores(60, 60, 62);
        boolean[] results = Question1.question1(18, "Angela", testStudent, true, true);
        
        String message = "Your conditional expression should evaluate to true for the student: " + testStudent;
        assertTrue(message, results[5]);
    }
    
    @Test
    public void testQuestion1_condition6_BorderlineStudent()
    {
        Student testStudent = new Student("Michelle Cunningham", 90210); 
        testStudent.setExamScores(50, 55, 60);
        boolean[] results = Question1.question1(18, "Angela", testStudent, true, true);
        
        String message = "Your conditional expression should evaluate to false for the student: " + testStudent;
        assertFalse(message, results[5]);
    }
    
    @Test
    public void testQuestion1_condition7_CombinedLength_OnBoundaryHigh()
    {
        Student testStudent = new Student("Joe Schmoe", 75423); 
        String personName = "Jenna Fields";
        testStudent.setExamScores(60, 60, 62);
        boolean[] results = Question1.question1(18, personName, testStudent, true, true);
        
        String message = "Your conditional expression should evaluate to false for the student: " + testStudent.getName() + " and personName: " + personName;
        assertFalse(message, results[6]);
    }
    
    @Test
    public void testQuestion1_condition7_CombinedLength_OnBoundaryLow()
    {
        Student testStudent = new Student("AJ Woo", 75423); 
        String personName = "Simon";
        testStudent.setExamScores(60, 60, 62);
        boolean[] results = Question1.question1(18, personName, testStudent, true, true);
        
        String message = "Your conditional expression should evaluate to false for the student: " + testStudent.getName() + " and personName: " + personName;
        assertFalse(message, results[6]);
    }
    
    @Test
    public void testQuestion1_condition7_CombinedLength_BelowBoundaryLow()
    {
        Student testStudent = new Student("Jake", 75423); 
        String personName = "Jamie";
        testStudent.setExamScores(60, 60, 62);
        boolean[] results = Question1.question1(18, personName, testStudent, true, true);
        
        String message = "Your conditional expression should evaluate to true for the student: " + testStudent.getName() + " and personName: " + personName;
        assertTrue(message, results[6]);
    }
    
    @Test
    public void testQuestion1_condition7_CombinedLength_AboveBoundaryHigh()
    {
        Student testStudent = new Student("Charles Babage", 75423); 
        String personName = "Ada Lovelace";
        testStudent.setExamScores(60, 60, 62);
        boolean[] results = Question1.question1(18, personName, testStudent, true, true);
        
        String message = "Your conditional expression should evaluate to true for the student: " + testStudent.getName() + " and personName: " + personName;
        assertTrue(message, results[6]);
    }
    
    @Test  
    public void testQuestion1_condition8_a_True_b_True()
    {
        String message = "Your conditional expression should evaluate to true for a = true and b = true"; 
        assertTrue(message, Question1.question1(18, "Bob", new Student(), true, true)[7]);
    }
    
    @Test  
    public void testQuestion1_condition8_a_True_b_False()
    {
        String message = "Your conditional expression should evaluate to false for a = true and b = false"; 
        assertFalse(message, Question1.question1(18, "Bob", new Student(), true, false)[7]);
    }
    
    @Test  
    public void testQuestion1_condition8_a_False_b_True()
    {
        String message = "Your conditional expression should evaluate to true for a = false and b = true"; 
        assertTrue(message, Question1.question1(18, "Bob", new Student(), false, true)[7]);
    }
    
    @Test  
    public void testQuestion1_condition8_a_False_b_False()
    {
        String message = "Your conditional expression should evaluate to true for a = false and b = false"; 
        assertTrue(message, Question1.question1(18, "Bob", new Student(), false, false)[7]);
    }
 
}
