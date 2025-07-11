/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Questions;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.ImageObserver;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.text.AttributedCharacterIterator;
import java.util.Random;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author araderma
 */
public class BrickTest
{

    static Brick testBrick;
    
    static Field[] instanceVars; 
    static Method[] methods;
    static int[] values; 
    static Color[] colors = new Color[]{Color.BLUE, Color.RED, Color.GREEN, Color.YELLOW}; 
    
    MockGraphics g = new MockGraphics(); 
    
    static FieldMatcher fieldMatcher; 
    
    @BeforeClass
    public static void setUpClass() 
    {
        Random rand = new Random();
        
        values = new int[]{rand.nextInt(51), rand.nextInt(51), rand.nextInt(81), rand.nextInt(81), rand.nextInt(4)};         
        
        testBrick = new Brick(values[0], values[1], values[2], values[3], colors[values[4]]);
        
        instanceVars = testBrick.getClass().getDeclaredFields();
        methods = testBrick.getClass().getDeclaredMethods();
        
        outputInformation();
        
        fieldMatcher = new FieldMatcher(5); 
        
        fieldMatcher.setValues(0, "X Position field", "int", new IdentifierPattern(new String[][] {{"x", "h"}, {"pos", "loc", "coord"}},1,1));
        fieldMatcher.setValues(1, "Y Position field", "int", new IdentifierPattern(new String[][] {{"y", "v"}, {"pos", "loc", "coord"}},1,1));
        fieldMatcher.setValues(2, "Width field", "int", new IdentifierPattern(new String[][] {{"width"}},1));
        fieldMatcher.setValues(3, "Height field", "int", new IdentifierPattern(new String[][] {{"height"}},1));
        fieldMatcher.setValues(4, "Color field", "Color", new IdentifierPattern(new String[][] {{"color"}},1));
        
        

        fieldMatcher.findMatches(instanceVars);
    }
    
    public static void outputInformation()
    {
        System.out.println("Instance Variables:");
        for(Field f : instanceVars)
        {
            System.out.print("  Identifier: " + f.getName() + "; ");
            System.out.print("Access Modifier: " + Modifier.toString(f.getModifiers()) + "; ");
            System.out.print("Type: " + f.getType().getCanonicalName().substring(f.getType().getCanonicalName().lastIndexOf(".") + 1) + "\n");
            
        }
        
        System.out.println("Methods:");
        for(Method m : methods)
        {
             System.out.print("  Identifier: " + m.getName() + "; ");
             System.out.print("Access Modifier: " + Modifier.toString(m.getModifiers()) + "; ");
             System.out.print("Return Type: " + m.getReturnType().getCanonicalName().substring(m.getReturnType().getCanonicalName().lastIndexOf(".") + 1) + "; ");
             System.out.print("Parameters:");
             
             Class[] params = m.getParameterTypes(); 
             
             for(int i = 0; i < params.length; i++)
             {
                 String name = params[i].getName().substring(params[i].getName().lastIndexOf(".") + 1);
                 
                 System.out.print(" " + name);
                 
                 if(i != params.length -1)
                 {
                     System.out.print(",");
                 }
             }
             System.out.println("");
        }   
    }
    
    @Test
    public void testConstructor() throws IllegalArgumentException, IllegalAccessException
    {
        Field xPosField = fieldMatcher.getFieldByDescription("X Position field");
        Field yPosField = fieldMatcher.getFieldByDescription("Y Position field");
        Field widthField = fieldMatcher.getFieldByDescription("Width field");
        Field heightField = fieldMatcher.getFieldByDescription("Height field");
        Field colorField = fieldMatcher.getFieldByDescription("Color field");
        
        if(xPosField == null)
        {
            fail("Couldn't find a field for the Brick's xPosition.");
        }
        if(colorField == null)
        {
            fail("Couldn't find a field for the Brick's color.");
        }
        if(yPosField == null)
        {
            fail("Couldn't find a field for the Brick's yPosition.");
        }
        if(widthField == null)
        {
            fail("Couldn't find a field for the Brick's width.");
        }
        if(heightField == null)
        {
            fail("Couldn't find a field for the Brick's height.");
        }
        
        xPosField.setAccessible(true);
        yPosField.setAccessible(true);
        widthField.setAccessible(true);
        heightField.setAccessible(true);
        colorField.setAccessible(true);
        
        int[] actual = new int[]{xPosField.getInt(testBrick), yPosField.getInt(testBrick), widthField.getInt(testBrick), heightField.getInt(testBrick)};
        Color actualColor = (Color)colorField.get(testBrick);
        
        assertEquals("Brick's xPosition differed from expected value.", values[0], actual[0]);
        assertEquals("Brick's yPosition differed from expected value.", values[1], actual[1]);
        assertEquals("Brick's width differed from expected value.", values[2], actual[2]);
        assertEquals("Brick's height differed from expected value.", values[3], actual[3]);
        assertEquals("Brick's color differed from expected value.", colors[values[4]], actualColor);
    }
    
    @Test
    public void testXPositionFieldPresent()
    {
        Field xPosField = fieldMatcher.getFieldByDescription("X Position field");
        
        if(xPosField == null)
        {
            fail("Couldn't find a field for the Brick's xPosition.");
        }
    }
    
    @Test
    public void testYPositionFieldPresent()
    {
        Field xPosField = fieldMatcher.getFieldByDescription("Y Position field");
        
        if(xPosField == null)
        {
            fail("Couldn't find a field for the Brick's yPosition.");
        }
    }
    
    @Test
    public void testWidthFieldPresent()
    {
        Field xPosField = fieldMatcher.getFieldByDescription("Width field");
        
        if(xPosField == null)
        {
            fail("Couldn't find a field for the Brick's width.");
        }
    }
    
    @Test
    public void testHeightFieldPresent()
    {
        Field xPosField = fieldMatcher.getFieldByDescription("Height field");
        
        if(xPosField == null)
        {
            fail("Couldn't find a field for the Brick's height.");
        }
    }
    
    @Test
    public void testColorFieldPresent()
    {
        Field xPosField = fieldMatcher.getFieldByDescription("Color field");
        
        if(xPosField == null)
        {
            fail("Couldn't find a field for the Brick's color.");
        }
    }
    
    @Test
    public void testDraw()
    {
        
        
        testBrick.draw(g);
        
        int[] actual = g.values; 
        Color actualColor = g.color; 
	boolean actualSolid = g.solid;
        
        assertEquals("Brick's drawn xPosition differed from expected value.", values[0], actual[0]);
        assertEquals("Brick's drawn yPosition differed from expected value.", values[1], actual[1]);
        assertEquals("Brick's drawn width differed from expected value.", values[2], actual[2]);
        assertEquals("Brick's drawn height differed from expected value.", values[3], actual[3]);
        assertEquals("Brick's drawn color differed from expected value.", colors[values[4]], actualColor);
	assertEquals("Brick is drawn as a solid (filled-in) rectangle.", true, actualSolid);
    }
    
    private static class MockGraphics extends Graphics
    {
        int values[] = new int[4]; 
        Color color = null; 
	boolean solid = false; 

        @Override
        public Graphics create()
        {
            return this; 
        }

        @Override
        public void translate(int x, int y)
        {
        }

        @Override
        public Color getColor()
        {
            return null; 
        }

        @Override
        public void setColor(Color c)
        {
            color = c; 
        }

        @Override
        public void setPaintMode()
        {
        }

        @Override
        public void setXORMode(Color c1)
        {
        }

        @Override
        public Font getFont()
        {
            return null; 
        }

        @Override
        public void setFont(Font font)
        {
        }

        @Override
        public FontMetrics getFontMetrics(Font f)
        {
            return null; 
        }

        @Override
        public Rectangle getClipBounds()
        {
            return null;
        }

        @Override
        public void clipRect(int x, int y, int width, int height)
        {
        }

        @Override
        public void setClip(int x, int y, int width, int height)
        {
        }

        @Override
        public Shape getClip()
        {
            return null; 
        }

        @Override
        public void setClip(Shape clip)
        {
        }

        @Override
        public void copyArea(int x, int y, int width, int height, int dx, int dy)
        {
        }

        @Override
        public void drawLine(int x1, int y1, int x2, int y2)
        {
        }

        @Override
        public void fillRect(int x, int y, int width, int height)
        {
            values = new int[]{x, y, width, height}; 
	    solid = true;
        }

        @Override
        public void drawRect(int x, int y, int width, int height)
        {
            values = new int[]{x, y, width, height}; 
        }

        @Override
        public void clearRect(int x, int y, int width, int height)
        {
        }

        @Override
        public void drawRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight)
        {
        }

        @Override
        public void fillRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight)
        {
        }

        @Override
        public void drawOval(int x, int y, int width, int height)
        {
        }

        @Override
        public void fillOval(int x, int y, int width, int height)
        {
        }

        @Override
        public void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle)
        {
        }

        @Override
        public void fillArc(int x, int y, int width, int height, int startAngle, int arcAngle)
        {
        }

        @Override
        public void drawPolyline(int[] xPoints, int[] yPoints, int nPoints)
        {
        }

        @Override
        public void drawPolygon(int[] xPoints, int[] yPoints, int nPoints)
        {
        }

        @Override
        public void fillPolygon(int[] xPoints, int[] yPoints, int nPoints)
        {
        }

        @Override
        public void drawString(String str, int x, int y)
        {
        }

        @Override
        public void drawString(AttributedCharacterIterator iterator, int x, int y)
        {
        }

        @Override
        public boolean drawImage(Image img, int x, int y, ImageObserver observer)
        {
            return false;

        }

        @Override
        public boolean drawImage(Image img, int x, int y, int width, int height, ImageObserver observer)
        {
            return false;
        }

        @Override
        public boolean drawImage(Image img, int x, int y, Color bgcolor, ImageObserver observer)
        {
                        return false;

        }

        @Override
        public boolean drawImage(Image img, int x, int y, int width, int height, Color bgcolor, ImageObserver observer)
        {
                        return false;

        }

        @Override
        public boolean drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2, ImageObserver observer)
        {
            return false;
        }

        @Override
        public boolean drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2, Color bgcolor, ImageObserver observer)
        {
            return false;
        }

        @Override
        public void dispose()
        {
        }
        
    }
    
}
