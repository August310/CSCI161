/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Questions;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author araderma
 */
public class Question3Test {

    static Object[] results;

    @BeforeClass
    public static void setUpClass()
    {
        results = Question3.question3(74000, 83000, 150000);
    }



    @Test
    public void testQuestion3Output()
    {
       System.out.println("\nQuestion 3 Output:");
       System.out.println("USOutput: " + (String)results[4]);
       System.out.println("FrenchOutput: " + (String)results[5]);
    }

    @Test
    public void testQuestion3_Part1_IsCorrect()
    {
        NumberFormat US = (NumberFormat)results[0];
        assertEquals(Currency.getInstance(Locale.US), US.getCurrency());
    }

    @Test
    public void testQuestion3_Part2_IsCorrect()
    {
        NumberFormat FR = (NumberFormat)results[1];
        assertEquals(Currency.getInstance(Locale.FRANCE), FR.getCurrency());
    }

    @Test
    public void testQuestion3_Part3_IsCorrect()
    {
        NumberFormat US = (NumberFormat)results[2];
        assertEquals(Currency.getInstance(Locale.US), US.getCurrency());
    }

    @Test
    public void testQuestion3_Part4_IsCorrect()
    {
        NumberFormat FR = (NumberFormat)results[3];
        assertEquals(Currency.getInstance(Locale.FRANCE), FR.getCurrency());
    }

    @Test
    public void testQuestion3_Part5_IsCorrect()
    {
        assertEquals("The cost of the first project is $74,000.00 which is 49% of the budget.", ((String)results[4]).replaceAll("\u00a0", " ").replaceAll("\u202f", " "));
    }

    @Test
    public void testQuestion3_Part6_IsCorrect()
    {
        assertEquals("The cost of the second project is 83 000,00 € which is 55 % of the budget.", ((String)results[5]).replaceAll("\u00a0", " ").replaceAll("\u202f", " "));
    }

}
