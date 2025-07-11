package ProvidedClasses;

import java.util.Objects;

/**
 *
 * @author Alex Radermacher
 */
public class Student 
{
    private String studentName; // The name of the student
    private int    studentID;   // The ID of the student
    private int[]  examScores;  // The exam scores of the student
    
    /**
     * Construct a Student object with the following default values:
     *   studentName: John Doe
     *   studentID: 12345 
     *   examScores: {57, 82, 73}
     */
    public Student()
    {
        studentName = "John Doe";
        studentID   = 12345;
        setExamScores(57, 82, 73);
    }
    
    /**
     * Construct a Student object with the specified name and the following default values:
     *  studentID = 9988779
     *  examScores = {0, 1, 0}
     * @param name A String representing the student's name
     */
    public Student(String name)
    {
        setName(name);
        setID(9988779);
        setExamScores(0, 1, 0);
    }
    
    /**
     * Construct a Student object with the specified name and ID and the following default values:
     *  examScores: {0, 2, 0}
     * @param name A String representing the student's name. 
     * @param ID An int representing the student's ID number. 
     */
    public Student(String name, int ID)
    {
        setName(name);
        setID(ID);
        setExamScores(0, 2, 0);
    }
    
    
    /**
     * Construct a Student object with the specified name, ID, and exam scores.
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
     * A method to modify (mutate) the name of the student.
     * @param newName A String representing the new value to set the student's name to. 
     */
    public final void setName(String newName)
    {
        studentName = newName; 
    }
    
    /**
     * A method to modify (mutate) the name of the student. Note that the method will
     *  convert negative values to positive numbers and will only accept the 7 least 
     *  significant digits when setting the ID. 
     *  
     * For example, the argument -987654321 would result in the student's ID being set
     *  to 7654321. 
     *  
     * @param newID An int representing the new value to set the student's ID to. 
     */
    private void setID(int newID)
    {       
        studentID = Math.abs(newID % 10000000); 
    }
    
    /**
     * A method to modify (mutate) the three exam scores for the student. 
     * @param score1 An int representing the student's first exam score (0 - 100).
     * @param score2 An int representing the student's second exam score (0 - 100).
     * @param score3 An int representing the student's third exam score (0 - 100).
     */
    public final void setExamScores(int score1, int score2, int score3)
    {
        examScores = new int[] {Math.min(100, Math.max(0, score1)), Math.min(100, Math.max(0, score2)), Math.min(100, Math.max(0, score3))}; 
    }
    /**
     * A method to access the name of the student. 
     * @return The name of the student.
     */
    public String getName()
    {
        return studentName;
    }
    
    /**
     * A method to access the ID of the student. 
     * @return The ID number of the student. 
     */
    public int getID()
    {
        return studentID;
    } 
    
    /**
     * A method to get the first exam score for the student. 
     * @return The score for the First Exam
     */
    public int getFirstExamScore()
    {
        return examScores[0];
    }
    
    /**
     * A method to get the second exam score for the student.
     * @return The score for the second Exam
     */
     public int getSecondExamScore()
    {
        return examScores[1];
    }   
     
    /**
     * A method to get the third exam score for the student. 
     * @return The score for the third Exam
     */
    public int getThirdExamScore()
    {
        return examScores[2];
    }
    
    /**
     * A method to determine if the student is the same as some other object. 
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
     * A method to generate a unique hash code value for a particular student. The 
     *  resulting hash code is based on the name and ID of the student. 
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
     * Overridden implementation of the toString method for the Student class. 
     * @return A String representing a Student object, displaying their name, ID, and grades. 
     */
    @Override 
    public String toString()
    {
        return "Student: (Name: " + studentName + ", ID:" + studentID + ", Grades: ["+ examScores[0] +", " + examScores[1] + ", " +examScores[2] +"])";
    } 
}