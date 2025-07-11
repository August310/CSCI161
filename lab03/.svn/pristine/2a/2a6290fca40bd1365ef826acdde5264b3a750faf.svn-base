/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ProvidedClasses;

/**
 *
 * @author araderma
 */
public class Student 
{
    private String studentName; // The name of the student
    private int    studentID;   // The ID of the student
    private int[]  examScores;  // The exam scores of the student
    private Teacher advisor;   // The current Teacher for the student
    
    /**
     * Construct a Student object with the following default values:
     *   studentName = "John Doe"
     *   studentID = 12345; 
     *   examScores = {57, 82, 73}; 
     */
    public Student()
    {
        studentName = "John Doe";
        studentID   = 12345;
        setExamScores(57, 82, 73);
    }
    
    public Student(String name)
    {
        setName(name);
        setID(9988779);
        setExamScores(0, 1, 0);
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
        setExamScores(0, 2, 0);
    }
    
    public Student(String name, int ID, Teacher advisor)
    {
        setName(name);
        setID(ID);
        setAdvisor(advisor);
        setExamScores(60, 70, 80);
    }
    
    
    /**
     * 
     * @param name A String representing the student's name
     * @param ID An int representing the student's ID number.
     * @param exam1score An int representing the student's first exam score
     * @param exam2score An int representing the student's second exam score
     * @param exam3score An int representing the student's third exam score
     */
    public Student(String name, int ID, int exam1score, int exam2score, int exam3score)
    {
        setName(name);
        setID(ID);
        setExamScores(exam1score, exam2score, exam3score);
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
    
    public Teacher getAdvisor()
    {
        return advisor;
    }
    
    public void setAdvisor(Teacher advisor)
    {
        this.advisor = advisor; 
    }
    
    /**
     * 
     * @param score1 An int representing the student's first exam score (0 - 100).
     * @param score2 An int representing the student's second exam score (0 - 100).
     * @param score3 An int representing the student's third exam score (0 - 100).
     */
    public void setExamScores(int score1, int score2, int score3)
    {
        examScores = new int[] {Math.min(100, Math.abs(score1)), Math.min(100, Math.abs(score2)), Math.min(100, Math.abs(score3))}; 
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
     * @return The score for the First Exam
     */
    public int getFirstExamScore()
    {
        return examScores[0];
    }
    
    /**
     * 
     * @return The score for the second Exam
     */
     public int getSecondExamScore()
    {
        return examScores[1];
    }   
     
    /**
     * 
     * @return The score for the third Exam
     */
    public int getThirdExamScore()
    {
        return examScores[2];
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

    @Override 
    public String toString()
    {
        return "Student: (Name: " + studentName + ", ID: " + studentID + ", Advisor: " + advisor + ", Grades: ["+ examScores[0] +", " + examScores[1] + ", " +examScores[2] +"])";
    } 
    
}
