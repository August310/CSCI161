/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questions;

import java.util.Random;
import java.util.Scanner;
import ProvidedClasses.Student;
/**
 *
 * @author August Preuss
 */
public class MyProgram 
{
    
    
    public static Student method()
    {
    Scanner scan = new Scanner(System.in);
    Random  rand = new Random();
    
    
    System.out.println("Please enter a name for a student.");
   
    String student1 = scan.nextLine();
    
    int num1 = rand.nextInt(99999-1+1)+1;
    
    int value1 = 32;
    int value2 = 85;
    int value3 = 16;
    
   Student myStudent = new Student(student1, num1, value1, value2, value3);
   
        
       
   
return myStudent;
    }
public static void main(String [] args) 
{
    Student createdStudent = method();

    System.out.println(createdStudent);
}     
} 

