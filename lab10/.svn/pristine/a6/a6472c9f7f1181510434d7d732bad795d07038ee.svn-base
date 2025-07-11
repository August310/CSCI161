package Questions.Files;

import ProvidedClasses.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import static org.junit.Assert.*;
import org.junit.Test;

public class Question7Test {
    
    @Test
    public void testWriteCourse() throws FileNotFoundException, IOException, ClassNotFoundException, IllegalAccessException, NoSuchFieldException 
    {
        Course testCourse = new Course("Computer Science I", 12344);
        
        testCourse.addStudent(new Student("Jane Doe", 1234, 4.0, new String[] {"Computer Science 160", "Biology 127"}));
        testCourse.addStudent(new Student("John Doe", 2345, 3.5, new String[] {"Computer Science 160", "Geology 214"}));
        testCourse.addStudent(new Student("Joe Schmoe", 5432, 2.5, new String[] {"Computer Science 160", "English 101", "Math 103"}));
        
        Question7.writeCourse(testCourse);
        
        FileInputStream fis = new FileInputStream("files/question7/objects");
        ObjectInputStream ois = new ObjectInputStream(fis);  
        Course resultCourse = (Course) ois.readObject(); 
        ois.close();
        
        Field f = Course.class.getDeclaredField("courseName"); 
        f.setAccessible(true);   
        String result = (String)f.get(resultCourse);
        
        assertEquals("Course written to file improperly.", "Computer Science I", result);
    }

    @Test
    public void testReadCourse() throws FileNotFoundException, IOException, IllegalArgumentException, NoSuchFieldException, IllegalAccessException 
    {
        Course testCourse = new Course("Computer Science I", 12344);
        
        testCourse.addStudent(new Student("Jane Doe", 1234, 4.0, new String[] {"Computer Science 160", "Biology 127"}));
        testCourse.addStudent(new Student("John Doe", 2345, 3.5, new String[] {"Computer Science 160", "Geology 214"}));
        testCourse.addStudent(new Student("Joe Schmoe", 5432, 2.5, new String[] {"Computer Science 160", "English 101", "Math 103"}));
        
        FileOutputStream fos = new FileOutputStream("files/question7/objects", false);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
            
        oos.writeObject(testCourse);
        oos.close();
        
        Course readCourse = Question7.readCourse("files/question7/objects");
        
        Field f = Course.class.getDeclaredField("courseName"); 
        f.setAccessible(true);   
        String result = (String)f.get(readCourse);
        
        assertEquals("Course read from file improperly.", "Computer Science I", result);
    }
    
    @Test
    public void Question7_TestOutput()
    {
        Question7.main(null);
    }


    
}
