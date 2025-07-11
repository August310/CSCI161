/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Questions;

/**
 *
 * @author (August Preuss)
 */
public class Question3
{
    /* For this portion of the assignment you will be working with the String class
     *  and using several different methods of the String class to manipulate String
     *  variables.
     *
     * You may need to refer to table 3.4 in chapter 3.7 to determine which methods you
     *  should use. Additionally, you may want to look at the API for the String class:
     *  https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html
     *
     * When you are finished, you can run the unit tests located in the Question3Test.java
     *  file to verify the correctness of your solution.
     */

    /* 1) In one line, declare a String variable with the identifier movieName and assign it the value:
     *      It's a Mad, Mad, Mad, Mad World
     *
     *      Note: Capitalization, spacing and punctuation are important
     */
String movieName = "It's a Mad, Mad, Mad, Mad World";


    /* 2) In one line, declare a String variable with the identifier upperCase and assign it the result of a method call
     *      on the movieName object reference that returns a String with all uppercase letters.
     */
String upperCase = movieName.toUpperCase();


    /* 3) In one line, declare a String variable with the identifier lowerCase and assign it the result of a method call
     *      on the movieName object reference that returns a String with all lowercase letters.
     */
String lowerCase = movieName.toLowerCase();


    /* 4) In one line, declare a String variable with the identifier noCommas and assign it the result of a method call
     *      on the movieName object reference that replaces all of the commas in the String with nothing (i.e. removes them)
     */
String noCommas = movieName.replaceAll("," , "");


    /* 5) In one line, declare a char variable with the identifier firstCharacter and assign it the result of a method call
     *      on the movieName object reference that returns the char (letter) at the start of the String
     */
char firstCharacter = movieName.charAt(0);


    /* 6) Declare an int variable with the identifier lengthOfString and assign it the result of a method call
     *      on the movieName object reference that returns the length of the String.
     */
int lengthOfString = movieName.length();


    /* 7) Declare an int variable with the identifier indexOfFirstLowerCaseA and assign it the result
     *      of a method call on the movieName object reference that returns the index position (location)
     *      of the first occurrence of the letter a within that String.
     */
int indexOfFirstLowerCaseA = movieName.indexOf('a');


    /* 8) Declare an int variable with the identifer indexOfLastLowerCaseA and assign it the result
     *      of a method call on the movieName object reference that returns the index position (location)
     *      of the last occurrence of the letter a within that String.
     */
int indexOfLastLowerCaseA = movieName.lastIndexOf('a');


    /* 9) Declare a String variable with the identifier substring and assign it the result
     *      of a method call on the movieName object reference that returns the part of that String
     *      between index positions 7 and 10.
     */
String substring = movieName.substring(7,10);


    /* 10) Declare a boolean variable with the identifier containsWordMad and assign it the result
     *      of a method call on the movieName object reference that returns whether or not that
     *      String contains the character sequence (String) "Mad".
     */
boolean containsWordMad = movieName.contains("Mad");


    /* 11) Declare a boolean variable with the identifier endsWith_world and assign it the result
     *      of a method call on the movieName object reference that returns whether or not that
     *      String ends with the String "world".
     */
boolean endsWith_world = movieName.endsWith("world");








}
