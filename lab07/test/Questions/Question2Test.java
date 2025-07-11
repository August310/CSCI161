/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author araderma
 */
public class Question2Test {
    

    public static int[] results; 
    
    @BeforeClass
    public static void setUpClass() {
        results = Question2.question2();
    }
    
    @Test
    public void part2_Count_isCorrect() {
        assertEquals("This test fails if count1 is incorrect.", 5, results[0]);
    }
    
    @Test
    public void part3_Count_isCorrect() {
        assertEquals("This test fails if count2 is incorrect.", 7, results[1]);
    }
    
    @Test
    public void part4_Count_isCorrect() {
        assertEquals("This test fails if count4 is incorrect.", 5, results[2]);
    }
    
    @Test
    public void part2_LoopControlVariable_isCorrect() {
        assertEquals("This test fails if loop control variable a is incorrect.", 15, results[3]);
    }
    
    @Test
    public void part3_LoopControlVariable_isCorrect() {
        assertEquals("This test fails if loop control variable b is incorrect.", -3, results[4]);
    }
}
