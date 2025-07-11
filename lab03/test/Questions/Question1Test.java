package Questions;

import ProvidedClasses.Student;
import ProvidedClasses.Teacher;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class Question1Test
{

    static Object[] results;

    @BeforeClass
    public static void setUpClass()
    {
        results = Question1.question1();
        Question1.main(null);
    }

    @Test
    public void testQuestion1_Part3_isCorrect()
    {
        
        assertEquals("This test fails if the incorrect Teacher object was assigned to student1", ((Student) results[2]).getAdvisor(), (results[0]));
    }

    @Test
    public void testQuestion1_Part4_isCorrect()
    {
        assertEquals("This test fails if the incorrect Teacher object was assigned to student2", ((Student) results[3]).getAdvisor(), (results[0]));
    }

    @Test
    public void testQuestion1_Part5_isCorrect()
    {
        assertEquals("This test fails if the incorrect Teacher object was assigned to student2", ((Student) results[4]).getAdvisor(), (results[1]));
    }

    @Test
    public void testQuestion1_Part6_isCorrect()
    {
        assertNotSame("This test fails if the name of the Teacher was not changed in part 6.", ((Teacher) results[0]).getName(), ((Teacher) results[1]).getName());
    }

    @Test
    public void testQuestion1_Part7_isCorrect()
    {
        assertNotSame("This test fails if the ID of the Teacher was not changed in part 7.", ((Teacher) results[0]).getID(), ((Teacher) results[1]).getID());
    }
}
