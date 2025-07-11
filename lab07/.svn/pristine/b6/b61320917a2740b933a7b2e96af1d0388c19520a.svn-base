/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ProvidedClasses;

import java.util.Objects;
import java.util.Random;


public class Student 
{
    private String studentName; 
    private int studentID; 
    private int[] examScores = new int[8]; 
    
    /**
     * Construct a Student object with the following default values:
     *   studentName = "John Doe"
     *   studentID = 1111111; 
     *   
     */
    public Student()
    {
        studentName = "Jane Doe";
        studentID   = 0012345;
        
        Random rand = new Random(); 
        
        for (int i = 0; i < 8; i++)
        {
            examScores[i] = rand.nextInt(26) + 75; 
        }
    }
    
    /**
     * 
     * @param name A String representing the student's name. 
     * @param ID An int representing the student's ID number. 
     */
    public Student(String name, int ID)
    {
               
        setName(name);
        setID(ID);
        for (int i = 1; i <= 8; i++)
        {
            this.setExamScore(i-1, 0);
        }
        
    }
    
    public static Student getAStudentInstance()
    {
        Student s = new Student("Suzy Q", 1010156);
        for (int i = 1; i <=8; i++)
        {
            s.setExamScore(i-1, 90 + i);
        }
        
        return s; 
    }
    
    public static Student getBStudentInstance()
    {
        Student s = new Student("Joey D", 2349817);
        for (int i = 1; i <=7; i++)
        {
            s.setExamScore(i-1, 76 + (i * 2));
        }
        
        s.setExamScore(7, 100);
        
        return s; 
    }
    
    /**
     * 
     * @param newName A String representing the new value to set the student's name to. 
     */
    public void setName(String newName)
    {
        studentName = newName; 
    }
    
    /**
     * 
     * @param newID An int representing the new value to set the student's ID to. 
     */
    private void setID(int newID)
    {
        studentID = Math.abs(newID % 10000000); 
    }
    
    
    /**
     * 
     * @param index The index of the exam to get (Should be 0 - 7 inclusive).
     * @param score The score for the exam. 
     */
    public void setExamScore(int index, int score)
    {
        examScores[index] = score; 
    }
    
    /**
     * 
     * @return The name of the student.
     */
    public String getName()
    {
        return studentName;
    }
    
    /**
     * 
     * @return The ID number of the student. 
     */
    public int getID()
    {
        return studentID;
    } 
        
    /**
     * 
     * @param index The index to get the score for. Should only be 0 - 7 inclusive.
     * @return The score for the specified exam. 
     */
    public int getExamScore(int index)
    {
        return examScores[index]; 
    }
    
   
    
    /**
     * 
     * @param o An Object to check against for equality
     * @return Whether or not the Student object is equal to the o 
     */
    @Override
    public boolean equals(Object o)
    {
        if (o instanceof Student)
        {
            Student s = (Student)o; 
            return (studentName.equals(s.getName()) && studentID == s.getID());
        }
        return false; 
    }

    /**
     * 
     * @return An int representing the hash of the object. 
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.studentName);
        hash = 59 * hash + this.studentID;
        return hash;
    }


    /**
     * 
     * @return A String representing the object. 
     */
    @Override 
    public String toString()
    {
        String toReturn = "(" + studentName + ", " + studentID + ", [";
        for (int grade : examScores)
        {
            toReturn += grade + ", ";
        }
        toReturn += "])";
        
        return toReturn; 
    }
}
