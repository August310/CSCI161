/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Questions;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;
import static org.junit.Assert.*;

public class Question2Test {


    public Question2Test()
    {

    }

    @Test
    public void testQuestion2_Output() {
        System.out.println("\nQuestion 2 Output:");
        double money = 20.00;
        double wager = 10.00;
        Boolean outcome = true;
        PrintStream out = System.out;

        System.out.println("With input money: " + money + ", wager: " + wager + ", outcome: " + outcome);

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        Object[] result = Question2.question2(money, wager, outcome);
        System.setOut(out);
        System.out.print(output.toString());

        money = (double)result[0];
        wager = 50.00;
        outcome = false;

        System.out.println("With input money: " + money + ", wager: " + wager + ", outcome: " + outcome);
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        result = Question2.question2(money, wager, outcome);
        System.setOut(out);
        System.out.print(output);
    }

    @Test
    public void testQuestion2_money_CorrectForWin()
    {
        double money = 20.00;
        double wager = 10.00;
        Boolean outcome = true;
        PrintStream out = System.out;
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        Object[] result = Question2.question2(money, wager, outcome);
        System.setOut(out);

        assertEquals(30.0, (double)result[0], 0.001);
    }

    @Test
    public void testQuestion2_money_CorrectForLoss()
    {
        double money = 20.00;
        double wager = 10.00;
        Boolean outcome = false;
        PrintStream out = System.out;
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        Object[] result = Question2.question2(money, wager, outcome);
        System.setOut(out);

        assertEquals(10.0, (double)result[0], 0.001);
    }

    @Test
    public void testQuestion2_println_CorrectForWin()
    {
        double money = 20.00;
        double wager = 10.00;
        Boolean outcome = true;
        PrintStream out = System.out;
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        Object[] result = Question2.question2(money, wager, outcome);
        System.setOut(out);

        assertEquals("I've won a $10.00 wager and now have $30.00!", output.toString().trim());
    }

    @Test
    public void testQuestion2_println_CorrectForLoss()
    {
        double money = 20.00;
        double wager = 10.00;
        Boolean outcome = false;
        PrintStream out = System.out;
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        Object[] result = Question2.question2(money, wager, outcome);
        System.setOut(out);

        assertEquals("I've lost a $10.00 wager and now have $10.00!", output.toString().trim());
    }

    @Test
    public void testQuestion2_println_CorrectForBust()
    {
        double money = 20.00;
        double wager = 30.00;
        Boolean outcome = false;
        PrintStream out = System.out;
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        Object[] result = Question2.question2(money, wager, outcome);
        System.setOut(out);

        assertEquals("I've lost a $30.00 wager and now have -$10.00!\nDrats! I've gone bust.", output.toString().trim().replaceAll("\r", ""));
    }

    @Test
    public void testQuestion2_println_CorrectForExactBust()
    {
        double money = 20.00;
        double wager = 20.00;
        Boolean outcome = false;
        PrintStream out = System.out;
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        Object[] result = Question2.question2(money, wager, outcome);
        System.setOut(out);

        assertEquals("I've lost a $20.00 wager and now have $0.00!\nDrats! I've gone bust.", output.toString().trim().replaceAll("\r", ""));
    }

    @Test
    public void testQuestion2_outcome_IsNull_NoCrashes()
    {
        try
        {
            PrintStream out = System.out;
            ByteArrayOutputStream output = new ByteArrayOutputStream();
            System.setOut(new PrintStream(output));
            Question2.question2(10.0, 5.0, null);
            System.setOut(out);
        }
        catch (NullPointerException e)
        {
            fail("NullPointerException caught: " + e.toString());
        }
    }

}