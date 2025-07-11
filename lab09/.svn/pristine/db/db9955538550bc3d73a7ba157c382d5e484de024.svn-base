/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Questions;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author araderma
 */
public class BallTest {

    
    static Field[]          fields;
    static Method[]         methods;
    static Constructor[]    constructors;
    static ArrayList<Field> superFields; 
    
    @BeforeClass
    public static void setUpClass() 
    {
        fields          = Ball.class.getDeclaredFields();
        methods         = Ball.class.getDeclaredMethods();
        constructors    = Ball.class.getDeclaredConstructors();
        superFields     = new ArrayList(); 
        
        superFields.addAll(Arrays.asList(Ball.class.getSuperclass().getDeclaredFields()));
        
        for(Field f : fields)
        {
            f.setAccessible(true);
        }
        
        for(Field f : superFields)
        {
            f.setAccessible(true);
        }
    }
    
    @Test
    public void testBall_InstanceVariables_CorrectModifiers()
    {
        assertEquals("Unexpected number of instance variables.", 3, fields.length);
        
        for(Field f : fields)
        {
            int mod = f.getModifiers(); 
            
            assertEquals("Improper modifier for " + f.getName(), "private", Modifier.toString(mod));
            
        }  
    }
    
    @Test
    public void testBall_InstanceVariables_MeaningfulIdentifiers()
    {
        assertEquals("Unexpected number of instance variables.", 3, fields.length);
        
        boolean xVelocity = false;
        boolean yVelocity = false; 
        boolean diameter  = false; 
        
        for(Field f : fields)
        {
            String name = f.getName().toLowerCase(); 
            
            if((name.contains("x") && (name.contains("vel") || name.contains("d") || name.contains("change"))) && !xVelocity)
            {
                xVelocity = true; 
            }
            else if((name.contains("y") && (name.contains("vel") || name.contains("d") || name.contains("change"))) && !yVelocity)
            {
                yVelocity = true; 
            }
            else if (name.contains("diameter"))
            {
                diameter = true; 
            }
        }  
        
        if(!xVelocity)
        {
            fail("Could not find meaningful identifier for x dimension velocity instance variable.");
        }
        if(!yVelocity)
        {
            fail("Could not find meaningful identifier for y dimension velocity instance variable.");
        }
        if(!diameter)
        {
            fail("Could not find meaningful identifer for diameter instance variable.");
        }
    }
    
    @Test
    public void testBall_move_WorksCorrectly() throws Exception
    {
        Ball testBall = new Ball(10, 10, 10, Color.BLACK);
        
        boolean xVelocity = false;
        boolean yVelocity = false; 
        
        Field xPos = null;
        Field yPos = null; 
        
        for(Field f : fields)
        {
            String name = f.getName().toLowerCase(); 
            
            if((name.contains("x") && (name.contains("vel") || name.contains("d") || name.contains("change"))) && !xVelocity)
            {
                xVelocity = true; 
                f.setInt(testBall, 10);
                 
            }
            else if((name.contains("y") && (name.contains("vel") || name.contains("d") || name.contains("change"))) && !yVelocity)
            {
                yVelocity = true;
                f.setInt(testBall, -10);
                 
            }
            
        } 
        
        for(Field f : superFields)
        {
            String name = f.getName().toLowerCase(); 
            if((name.contains("x")))
            {
                xPos = f; 
            }
            else if((name.contains("y")))
            {
                yPos = f; 
            }
        }
        
        if(!xVelocity)
        {
            fail("Could not find instance variable for x velocity.");
        }
        
        if(!yVelocity)
        {
            fail("Could not find instance variable for y velocity.");
        }
        
        if(xPos == null)
        {
            fail("Could not find inheritated instance variable for x position.");
        }
        
        if(yPos == null)
        {
            fail("Could not find inheritated instance variable for y position.");
        }
        
        testBall.move();
        
        assertEquals("Incorrect xPosition for Ball object after move called.", 20, xPos.get(testBall));
        
        assertEquals("Incorrect yPosition for Ball object after move called.", 0, yPos.get(testBall));
    }
    
    @Test
    public void testBall_getBounds_WorksCorrectly()
    {
        Ball testBall = new Ball(10, 10, 10, Color.BLACK);
        
        Rectangle expected = new Rectangle(10, 10, 10, 10);
        
        Rectangle actual = testBall.getBounds(); 
        
        assertEquals("getBounds returned an unexpected result.", expected.toString(), actual.toString());
    }
    
    
}
