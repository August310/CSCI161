package Questions.Files;

import ProvidedClasses.Student;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author (August Preuss)
 */
/*  For this part of the assignment you will need to implement the Course class.
    The Student class can be imported from the ProvidedClasses package

    Your class should contain the following instance variables:

     courseName - A String representing the name of the course
     callNumber - An int representing the call number for the course
     roster     - An ArrayList<Student> that contains all students enrolled in this course. 

    Your should also implement the following methods:

     Course     - A constructor method that accepts two parameters (String, int) which represent the course name and call number.
     addStudent - A method that accepts a single Student as a parameter and adds that Student to the course roster.
     toString   - A method that returns a String representation of a Course object with the following format:
                    callNumber courseName [StudentList]
     
     *Note: You can call the toString method on your ArrayList<Student> instance variable to convert it to a String. 

    Your class should also implement the Serializable interface so that objects can be written to a file. 
 */
public class Course implements Serializable {

    private String courseName;
    private int callNumber;
    private ArrayList<Student> roster;

    public Course(String courseName, int callNumber) {
        this.courseName = courseName;
        this.callNumber = callNumber;
        this.roster = new ArrayList<>();
    }

    public void addStudent(Student student) {
        roster.add(student);
    }

    @Override
    public String toString() {
        return callNumber + " " + courseName + " " + roster.toString();
    }

}
