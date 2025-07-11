/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Questions.Chapter9;

import ProvidedClasses.Person;


import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author araderma
 */
public class Question3Test 
{
    

    @Test
    public void testQuestion3_MultiplicationTable_OutputForArgumentValue_5()
    {
        int[][] result = Question3.multiplicationTable(5);
        
        System.out.println("Question3, Part2 Output: ");

        for(int j = 0; j < result[0].length; j++)
        {
           
            System.out.print("\t" + j + ":");
        }
        
        
        for(int i = 0; i < result.length; i++)
        {
            System.out.print("\n" + i + ":");
            for(int j = 0; j < result[i].length; j++)
            {
                System.out.print("\t" + result[i][j]);
            }
        }
        
        System.out.println("");
    }

    @Test
    public void testQuestion3_MultiplicationTable_CorrectNumberOfRows() 
    {
        int[][] result = Question3.multiplicationTable(10); 
        
        int expected = 11; 
        int actual = result.length; 
        
        String message = "This test fails if there are an incorrect number of rows with an argument value of 10.";
        
        assertEquals(message, expected, actual);
    }
    
    @Test
    public void testQuestion3_MultiplicationTable_CorrectNumberOfColumns() 
    {
        int[][] result = Question3.multiplicationTable(10); 
        
        int expected = 11; 
        
        if (result.length != 11)
        {
            fail("Incorrect number of rows. Cannot process columns.");
        }
        
        for(int i = 0; i < result.length; i++)
        {
            int actual = result[i].length; 
        
            String message = "This test fails if there are an incorrect number of columns in row " + i + " for an argument value of 10.";
        
            assertEquals(message, expected, actual);
        }
    }
    
    @Test
    public void testQuestion3_MultiplicationTable_ElementsAreCorrect() 
    {
        int[][] result = Question3.multiplicationTable(10); 
                
        if (result.length != 11)
        {
            fail("Incorrect number of rows. Cannot process columns.");
        }
        
        for(int i = 0; i < result.length; i++)
        {
            int colLength = result[i].length; 
            
            if (colLength != 11)
            {
                fail("Incorrect number of columns.");
            }
            for(int j = 0; j < result[i].length; j++)
            {
                int actual = result[i][j];
                int expected = i * j;
                String message = "This test fails if the value at row " + i + " and column " + j + " is incorrect.";
                assertEquals(message, expected, actual);
            }
        }
    }

    /**
     * Test of Part3 method, of class Question3.
     */
    @Test
    public void testQuestion3_PartyList_ArrayListIsCorrectSize() 
    {
        ArrayList result = Question3.partyList(); 
       
        int expected = 28; 
        int actual   = result.size();
        
        String message = "This test fails if there are an incorrect number of Persons stored in the ArrayList";
        
        assertEquals(message, expected, actual);
    }

    /**
     * Test of Part4 method, of class Question3.
     */
    @Test
    public void testQuestion3_CombinedList_ContainsYourList()
    {
        ArrayList<Person> yourList = Question3.partyList();
        
        ArrayList<Person> otherList = new ArrayList<>();
        
        ArrayList<Person> noShow = new ArrayList<>();
        
        for(int i = 0; i < 17; i++)
        {
            otherList.add(new Person());
        }
        
        ArrayList<Person> result = Question3.combinedList(yourList, otherList, noShow);
        
        boolean expected = true; 
        boolean actual = result.containsAll(yourList);
        
        String message = "This test fails if the returned ArrayList does not contain your list.";
        assertTrue(message, actual == expected);
    }
    
    @Test
    public void testQuestion3_CombinedList_ContainsFriendsList()
    {
        ArrayList<Person> yourList = Question3.partyList();
        
        ArrayList<Person> otherList = new ArrayList<>();
        
        ArrayList<Person> noShow = new ArrayList<>();
        
        for(int i = 0; i < 17; i++)
        {
            otherList.add(new Person());
        }
        
        ArrayList<Person> result = Question3.combinedList(yourList, otherList, noShow);
        
        boolean expected = true; 
        boolean actual = result.containsAll(otherList);
        
        String message = "This test fails if the returned ArrayList does not contain your friend's list.";
        assertTrue(message, actual == expected);
    }
    
    @Test
    public void testQuestion3_CombinedList_RemovedNoShows()
    {
        ArrayList<Person> yourList = Question3.partyList();
        
        ArrayList<Person> otherList = new ArrayList<>();
        
        ArrayList<Person> noShow = new ArrayList<>();
        
        for(int i = 0; i < 17; i++)
        {
            Person p = new Person(); 
            otherList.add(p);
            if(i % 5 == 0)
            {
                noShow.add(p);
            }
        }
        
        ArrayList<Person> result = Question3.combinedList(yourList, otherList, noShow);

        for(Person p : noShow)
        {
            boolean expected = false; 
            boolean actual = result.contains(p);

            String message = "This test fails if the returned ArrayList contains a person not showing up.";
            assertTrue(message, actual == expected);
        }
    }
    
}
