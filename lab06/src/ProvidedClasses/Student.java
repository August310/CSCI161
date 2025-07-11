/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ProvidedClasses;

/**
 *
 * @author Alex Radermacher
 */
public class Student 
{
    private String studentName; 
    private int studentID; 
    private int[] examScores; 

    
    /**
     * Construct a Student object with the following default values:
     *   studentName = "John Doe"
     *   studentID = 1111111; 
     *   
     */
    public Student()
    {
        studentName = "John Doe";
        studentID   = 1234;
        examScores = new int[] {0, 0, 0}; 
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
        setExamScores(0, 0, 0);
    }

    /**
     * 
     * @param name A String representing the student's name.
     * @param ID An int representing the student's ID number.
     * @param score1 An int representing the first exam score.
     * @param score2 An int representing the second exam score.
     * @param score3 An int representing the third exam score. 
     */
    public Student(String name, int ID, int score1, int score2, int score3) {
        setName(name);
        setID(ID);
        setExamScores(score1, score2, score3);
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
        studentID = newID;
    }
    
    /**
     * 
     * @param score1 An int representing the student's first exam score.
     * @param score2 An int representing the student's second exam score.
     * @param score3 An int representing the student's third exam score.
     */
    public void setExamScores(int score1, int score2, int score3)
    {
        examScores = new int[] {score1, score2, score3}; 
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
     * @return The score for the first Exam
     */
    public int getExamScore1()
    {
        return examScores[0];
    }
    
    /**
     * 
     * @return The score for the first Exam
     */
    public int getExamScore2()
    {
        return examScores[1];
    }
    
    /**
     * 
     * @return The score for the first Exam
     */
    public int getExamScore3()
    {
        return examScores[2];
    }
    
    @Override 
    public String toString()
    {
        return "(" + studentName + ", " + studentID + ", [" + examScores[0] + ", " + examScores[1] + ", " + examScores[2] + "])";
    } 
    
    @Override
    public boolean equals(Object o)
    {
        if(o instanceof Student)
        {
            Student s = (Student)o;
            
            return studentName.equals(s.getName()) && studentID == s.getID(); 
        }
        
        return false; 
    } 
}
