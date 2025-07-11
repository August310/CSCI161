package Questions.Files;

import ProvidedClasses.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author (August Preuss)
 */
public class Question7 {

    /*  For this part of the assignment you will write some code that allows you to write an object to a file (Chapter 11.7).
        Before you go any further, you will need to finish implementing the Course.java file. 
        
        Note: You may also need to modify the Student.java class in the ProvidedClasses package to implement the Serializable interface
    
        Your code should perform the following actions: 
    
        1) Open a file for writing that will overwrite any existing contents of the file (i.e. NOT using append mode)
            * You should use the following file "files/question7/objects
        2) Write the Course parameter passed to this method to the file.
        3) Make sure to close the file so that any changes you make will be saved. 
    
        *Note: Your code should not throw any checked exceptions.
     */
    public static void writeCourse(Course course) {
        try {
            FileOutputStream fos = new FileOutputStream("files/question7/objects", false);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            //writes the course object onto a file
            oos.writeObject(course);

            oos.close();
        } catch (FileNotFoundException fnf) {

        } catch (IOException ie) {

        }
    }

    /*  For this part of the assignment you will write some code that allows you to read an object from a file.
        Before you go any further, you will need to finish implementing the Course.java file. 
        
        Note: You may also need to modify the Student.java class in the ProvidedClasses package to implement the Serializable interface
    
        Your code should perform the following actions: 
    
        1) Open a file for reading
        2) Read in an object from the file and type-caste it to the appropriate type. 
            * Make sure to close the file when you're finished reading it. 
        3) Return the Course object that you have read from the file. 
    
        *Note: Your code should not throw any checked exceptions.
     */
    public static Course readCourse(String fileName) {
        Course course = null;
        try {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            //reads object and typecasts the Course class
            course = (Course) ois.readObject();

            ois.close();

        } catch (FileNotFoundException fnf) {

        } catch (IOException ie) {

        } catch (ClassNotFoundException cnf) {

        }
        return course;
    }

    public static void main(String[] args) {
        Course testCourse = new Course("Computer Science 160", 12345);

        testCourse.addStudent(new Student("Ponder Stibbons", 4928451, 3.75, new String[]{"Computer Science 160"}));
        testCourse.addStudent(new Student("Victor Tugelbend", 2649231, 3.0, new String[]{"Computer Science 160"}));

        System.out.println("Course to be written to file: ");
        System.out.println(testCourse);

        writeCourse(testCourse);
        Course fromFile = readCourse("files/question7/objects");

        System.out.println("\nCourse read from file: ");
        System.out.println(fromFile);
    }

}
