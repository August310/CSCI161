/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyUnitTests;

import static Questions.ScrabbleScore.calculateScore;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author August Preuss
 */
public class ScrabbleScoreTest {

    public ScrabbleScoreTest() {
    }

    @Test
    public void blankTest() {
        // setup test values
        String blank = " ";
        // set expected result
        int expected = 0;
        // get actual result
        int actual = calculateScore(blank);
        // compare expected and actual results
        assertEquals(expected, actual);
    }

    @Test
    public void isNullTest() {
        // setup test values
        String nonexistant = null;
        // set expected result
        int expected = -1;
        // get actual result
        int actual = calculateScore(nonexistant);
        // compare expected and actual results
        assertEquals(expected, actual);
    }

    @Test
    public void CapitalTest() {
        // setup test values
        String word = "EON";
        // set expected result
        int expected = 3;
        // get actual result
        int actual = calculateScore(word);
        // compare expected and actual results
        assertEquals(expected, actual);
    }

    @Test
    public void onePointLettersTest() {
        // setup test values
        String word = "eaionrtlsu";
        // set expected result
        int expected = 10;
        // get actual result
        int actual = calculateScore(word);
        // compare expected and actual results
        assertEquals(expected, actual);
    }

    @Test
    public void twoPointLettersTest() {
        // setup test values
        String word = "dg";
        // set expected result
        int expected = 4;
        // get actual result
        int actual = calculateScore(word);
        // compare expected and actual results
        assertEquals(expected, actual);
    }

    @Test
    public void threePointLettersTest() {
        // setup test values
        String word = "bcmp";
        // set expected result
        int expected = 12;
        // get actual result
        int actual = calculateScore(word);
        // compare expected and actual results
        assertEquals(expected, actual);
    }

    @Test
    public void fourPointLettersTest() {
        // setup test values
        String word = "fhvwy";
        // set expected result
        int expected = 20;
        // get actual result
        int actual = calculateScore(word);
        // compare expected and actual results
        assertEquals(expected, actual);
    }

    @Test
    public void fivePointLettersTest() {
        // setup test values
        String word = "k";
        // set expected result
        int expected = 5;
        // get actual result
        int actual = calculateScore(word);
        // compare expected and actual results
        assertEquals(expected, actual);
    }

    @Test
    public void eightPointLettersTest() {
        // setup test values
        String word = "jx";
        // set expected result
        int expected = 16;
        // get actual result
        int actual = calculateScore(word);
        // compare expected and actual results
        assertEquals(expected, actual);
    }

    @Test
    public void tenPointLettersTest() {
        // setup test values
        String word = "qz";
        // set expected result
        int expected = 20;
        // get actual result
        int actual = calculateScore(word);
        // compare expected and actual results
        assertEquals(expected, actual);
    }

    @Test
    public void improperCharacterTest() {
        // setup test values
        String word = "/;'';";
        // set expected result
        int expected = -1;
        // get actual result
        int actual = calculateScore(word);
        // compare expected and actual results
        assertEquals(expected, actual);
    }

    @Test
    public void letterFromEachCategorieTest() {
        // setup test values
        String word = "edbfkjq";
        // set expected result
        int expected = 33;
        // get actual result
        int actual = calculateScore(word);
        // compare expected and actual results
        assertEquals(expected, actual);
    }

    @Test
    public void improperCharacterWithProperCharacterTest() {
        // setup test values
        String word = ",a";
        // set expected result
        int expected = -1;
        // get actual result
        int actual = calculateScore(word);
        // compare expected and actual results
        assertEquals(expected, actual);
    }

    @Test
    public void normalWordWithCapitalTest() {
        // setup test values
        String word = "August";
        // set expected result
        int expected = 7;
        // get actual result
        int actual = calculateScore(word);
        // compare expected and actual results
        assertEquals(expected, actual);
    }

    @Test
    public void normalWordWithNoCapitalTest() {
        // setup test values
        String word = "august";
        // set expected result
        int expected = 7;
        // get actual result
        int actual = calculateScore(word);
        // compare expected and actual results
        assertEquals(expected, actual);
    }

}
