/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Questions;

import ProvidedClasses.Student;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author araderma
 */
public class Question4Test {
    
    @Test
    public void testQuestion3_Student1HighestGrade_IsCorrect() 
    {
        Student student1 = Student.getAStudentInstance();
        Student student2 = Student.getBStudentInstance(); 
        
        Object[] results = Question4.question4(student1, student2);
        
        String message = "This test fails if the highest grade for student1 is incorrect";
        assertEquals(message, 98, (int)results[0]);
    }
    
    @Test
    public void testQuestion3_Student2HighestGrade_IsCorrect() 
    {
        Student student1 = Student.getAStudentInstance();
        Student student2 = Student.getBStudentInstance(); 
        
        Object[] results = Question4.question4(student1, student2);
        
        String message = "This test fails if the highest grade for student1 is incorrect";
        assertEquals(message, 100, (int)results[1]);
    }
    
    @Test
    public void testQuestion3_Student1AverageGrade_IsCorrect() 
    {
        Student student1 = Student.getAStudentInstance();
        Student student2 = Student.getBStudentInstance(); 
        
        Object[] results = Question4.question4(student1, student2);
        
        String message = "This test fails if the average grade for student1 is incorrect";
        assertEquals(message, 94.5, (double)results[2], 0.00);
    }
    
    @Test
    public void testQuestion3_Student2AverageGrade_IsCorrect() 
    {
        Student student1 = Student.getAStudentInstance();
        Student student2 = Student.getBStudentInstance(); 
        
        Object[] results = Question4.question4(student1, student2);
        
        String message = "This test fails if the average grade for student2 is incorrect";
        assertEquals(message, 86.0, (double)results[3], 0.00);
    }
    
    @Test
    public void testQuestion3_bestHighGradeStudent_IsCorrect() 
    {
        Student student1 = Student.getAStudentInstance();
        Student student2 = Student.getBStudentInstance(); 
        
        Object[] results = Question4.question4(student1, student2);
        
        String message = "This test fails incorrect student is given for the highest grade contest";
        assertEquals(message, student2, (Student)results[4]);
    }
    
    @Test
    public void testQuestion3_bestAverageGradeStudent_IsCorrect() 
    {
        Student student1 = Student.getAStudentInstance();
        Student student2 = Student.getBStudentInstance(); 
        
        Object[] results = Question4.question4(student1, student2);
        
        String message = "This test fails incorrect student is given for the average grade contest";
        assertEquals(message, student1, (Student)results[5]);
    }
    
}
