/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TestClasses;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author araderma
 */
public class MockInputStream extends InputStream
{
    private Queue<String> data; 
    private OutputStream echo; 
    
    @Override
    public int read() throws IOException
    {
        // Don't allow individual byte reads
        return 0; 
    }
    
    @Override
    public int read(byte[] buffer) throws IOException
    {
        return this.read(buffer, 0, 0);
    }
    
    @Override
    public int read(byte[] buffer, int offset, int length) throws IOException
    {
       if(data.isEmpty())
       {
           return -1; 
       }
       
       byte[] byteData = data.remove().getBytes();
       
       int pos = 0; 
       
       for(byte b : byteData)
       {
           buffer[pos++] = b; 
       }
       
       // Echo the simulated input to some output stream 
       if(echo != null)
       {
           echo.write(byteData);
       }
       
       return pos; 
    }
    
    public MockInputStream(String[] args)
    {
        data = new LinkedList<>(Arrays.asList(args));
    }
    
    public MockInputStream(String[] args, OutputStream out)
    {
        this(args);
        echo = out; 
    }
    
}
