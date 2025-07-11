package Questions;

import ProvidedClasses.Student;
import java.text.DecimalFormat;


/**
 *
 * @author (August Preuss)
 */
public class Question5
{
    public static String method()
    {
        /* For this portion of the assignment you will be working with the DecimalFormat class
         *  to format numeric values so that they are more presentable. You will also be using
         *  the Student class as a source of data to format.
         *
         * For Parts 1 - 7 you will choose your own identifiers for any variables or object references.
         *  Make sure to choose meaningful identifiers that represent the data that you're working with.
         *
         * Note: At the bottom of the code block is a line of code that is necessary for the unit test to function.
         *  Ensure that you do not accidentally remove or modify it.
         *
         * When you are finished, you can run the unit tests located in the Question5Test.java
         *  file to verify the correctness of your solution.
         *
         * Note: This class also contains a main method that will allow you to test your solution manually.
         */

        /* 1) Declare a Student variable (with identifier of your own choosing) and assign it an object
         *      created by the default constructor of the Student class.
         */
        Student student1 = new Student();
        


        /* 2) Declare an int variable and assign it the result of the student you created
         *      in the previous step's first exam score.
         */
        int exam1 = student1.getFirstExamScore();


        /* 3) Declare an int variable and assign it the result of the student you created
         *      in the first step's second exam score.
         */
        int exam2 = student1.getSecondExamScore();


        /* 4) Declare an int variable and assign it the result of the student you created
         *      in the first step's third exam score.
         */
        int exam3 = student1.getThirdExamScore();


        /* 5) Declare a variable of type double and assign it the average of the student's three exam scores.
         */
        double averageGrade = ((double)(exam1 + exam2 + exam3) / 3);


        /* 6) Declare a DecimalFormat variable that will be used to format a student's ID
         *      and assign it a reference to a DecimalFormat object with the following pattern:
         *          There are 7 required digits, and no decimal point.
         *      Note: You may need to import the DecimalFormat class!
         */
        DecimalFormat studentIdFormat = new DecimalFormat( "0000000" );
        

        /* 7) Declare a DecimalFormat variable that will be used to format a student's grade
         *      and assign it a reference to a DecimalFormat object with the following pattern:
         *          The output will have a decimal point and exactly two places (digits) following the decimal point
         *          The output will always have at least one digit (leading zero) before the decimal point
         *          The output will not contain leading zeros other than the one's digit
         */
        DecimalFormat studentGrade = new DecimalFormat("#0.00");
        

        /* 8) Declare a String variable with the identifier formattedOutput and assign a value as follows:
         *      Name: $name ID: $formattedID Average Score: $formattedScore
         *          $name should be the name of the student not the literal "$name"
         *          $formattedID should be the ID of the student formatted by the DecimalFormat object from Part 6
         *          $formattedScore should be the average exam score formatted by the DecimalFormat object from Part 7
         */
        String formattedOutput = "Name: " + student1.getName() + " ID: " + studentIdFormat.format(12345)+ " Average Score: " + studentGrade.format(averageGrade);

        
        // Necessary for Unit Test. Do not remove or modify!
        // If there is a compiler error with the following line, it is likely because you have mispelled an identifier.
        return formattedOutput;
    }
}
