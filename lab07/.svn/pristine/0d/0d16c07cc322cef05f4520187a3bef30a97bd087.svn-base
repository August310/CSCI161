
package TestClasses;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import org.junit.After;
import static org.junit.Assert.fail;

/**
 *
 * @author araderma
 */
public class TestInputHelper
{
    protected final static InputStream in = System.in; 
    protected final static PrintStream out = System.out; 
    
    protected static ByteArrayOutputStream setupMockStreams(String[] input, boolean echo)
    {
        // Setup a new stream to capture the output instead of sending it to System.out
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream outputPS = new PrintStream(output);
        System.setOut(outputPS);
        
        // Setup a MockInputStream to simulate input from System.in
        MockInputStream mis = (echo) ? new MockInputStream(input, outputPS) : new MockInputStream(input);
        System.setIn(mis);
        
        return output;
    }
    
    protected static void outputException(String message, Exception e, ByteArrayOutputStream output) throws IOException
    {
        // Write any program output and simulated input to the console
        if(output != null)
        {
            output.writeTo(out);
            e.printStackTrace(out);
        }
        fail(message); 
    }
    
    protected static void outputError(String message, Error e, ByteArrayOutputStream output) throws IOException
    {
        // Write any program output and simulated input to the console
        if(output != null)
        {
            output.writeTo(out);
            e.printStackTrace(out);
        }
        fail(message);
    }
    
    protected static String getTestName()
    {
        StackTraceElement[] callStack = Thread.currentThread().getStackTrace();
        // Use 1 because we want to get the name of the method that called this method
        return callStack[2].getMethodName(); 
    }
    
    protected static String getTestName(int level)
    {
        StackTraceElement[] callStack = Thread.currentThread().getStackTrace();
        
        return callStack[level].getMethodName(); 
    }

    @After
    public void afterTest()
    {
        System.setIn(in);
        System.setOut(out);
    }
}
