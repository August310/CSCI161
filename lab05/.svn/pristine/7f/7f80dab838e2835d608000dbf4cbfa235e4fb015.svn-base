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
import java.text.AttributedCharacterIterator;
import java.util.HashMap;
import java.util.Set;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author araderma
 */
public class ModernArtTest
{
    
    private static TestGraphics g = new TestGraphics();
    private static int[] counts; 
    private static HashMap<Color, Integer> colors;
    
    @BeforeClass
    public static void setup()
    {
        ModernArt ma = new ModernArt();
        ma.paint(g);
        counts = g.methodCallMap; 
        colors = g.colorMap; 
        
        System.out.println("Methods Called:");
        for(int i = 0; i < 7; i++)
        {
            System.out.println("  " + g.callMapNames[i] + ": " + counts[i]);
        }
        
        System.out.println("Colors Used:");
        Set<Color> colorSet = colors.keySet(); 
        for(Color c : colorSet)
        {
            System.out.println("  " + formatName(getNameOfColor(c)) + ": " + colors.get(c));
        }
    }
    
    public static String formatName(String s)
    {
        if (s == null || s.length() < 1)
        {
            return s; 
        }
        
        return s.substring(0, 1).toUpperCase() + s.substring(1); 
    }
    
    public static String getNameOfColor(Color c)
    {
        if(c == null)
        {
            return "null"; 
        }
        
        for (Field field : Color.class.getFields())
        {
            try
            {
                if (field.getType() == Color.class)
                {
                    if (c.equals(field.get(c)))
                    {
                        return field.getName();
                    }
                }
            } 
            catch (IllegalAccessException | IllegalArgumentException e)
            {
                System.err.println("Could not determine Color's name");
            }
        }
        
        return c.toString(); 
    }
    
    @Test
    public void testNumberOfColorsUsed()
    {
        int colorsUsed = colors.keySet().size();
        
        if(colorsUsed < 3)
        {
            fail("You need to use at least 3 colors. You used " + colorsUsed);
        }
    }
    
    @Test
    public void testNumberOfNonSolidRectangles()
    {
        int used = counts[0]; 
        
        if(used < 1)
        {
            fail("You need to use at least 1 non-solid rectangle. You used " + used);
        }
    }
    
    @Test
    public void testNumberOfNonSolidOvals()
    {
        int used = counts[1]; 
        
        if(used < 1)
        {
            fail("You need to use at least 1 non-solid ovals. You used " + used);
        }
    }
    
    @Test
    public void testNumberOfSolidOvals()
    {
        int used = counts[2]; 
        
        if(used < 1)
        {
            fail("You need to use at least 1 solid ovals. You used " + used);
        }
    }
    
    @Test
    public void testNumberOfNonSolidPolygons()
    {
        int used = counts[3]; 
        
        if(used < 1)
        {
            fail("You need to use at least 1 non-solid polygons. You used " + used);
        }
    }
    
    @Test
    public void testNumberOfSolidPolygons()
    {
        int used = counts[4]; 
        
        if(used < 1)
        {
            fail("You need to use at least 1 solid polygons. You used " + used);
        }
    }
    
    @Test
    public void testNumberOfLines()
    {
        int used = counts[5]; 
        
        if(used < 3)
        {
            fail("You need to use at least 3 lines. You used " + used);
        }
    }
    
    @Test
    public void testNumberOfStrings()
    {
        int used = counts[6]; 
        
        if(used < 1)
        {
            fail("You need to use at least 1 strings. You used " + used);
        }
    }
    
    private static class TestGraphics extends Graphics
    {
        Color currentColor = Color.BLACK; 
        HashMap<Color, Integer> colorMap = new HashMap(); 
        int[] methodCallMap = new int[]{0, 0, 0, 0, 0, 0, 0};
        String[] callMapNames = new String[]{"Non-Solid Rectangle", "Non-Solid Oval", "Solid Oval", "Non-Solid Polygon", "Solid Polygon", "Line", "String"}; 
        
        private void countColor()
        {
            if(!colorMap.containsKey(currentColor))
            {
                colorMap.put(currentColor, 1);
            }
            else
            {
                int count = colorMap.get(currentColor);
                colorMap.put(currentColor, ++count); 
            }
        }

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
            return currentColor;
        }

        @Override
        public void setColor(Color c)
        {
            currentColor = c; 
            
            
            
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
            methodCallMap[5]++;
            countColor();
        }

        @Override
        public void fillRect(int x, int y, int width, int height)
        {
            countColor();
        }
        
        @Override
        public void drawRect(int x, int y, int width, int height)
        {
            methodCallMap[0]++; 
            countColor();
        }

        @Override
        public void clearRect(int x, int y, int width, int height)
        {
            
        }

        @Override
        public void drawRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight)
        {
            countColor();
        }

        @Override
        public void fillRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight)
        {
            countColor();
        }

        @Override
        public void drawOval(int x, int y, int width, int height)
        {
            methodCallMap[1]++;
            countColor();
        }

        @Override
        public void fillOval(int x, int y, int width, int height)
        {
            methodCallMap[2]++; 
            countColor();
        }

        @Override
        public void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle)
        {
            countColor();
        }

        @Override
        public void fillArc(int x, int y, int width, int height, int startAngle, int arcAngle)
        {
            countColor();
        }

        @Override
        public void drawPolyline(int[] xPoints, int[] yPoints, int nPoints)
        {
            countColor();
        }

        @Override
        public void drawPolygon(int[] xPoints, int[] yPoints, int nPoints)
        {
            methodCallMap[3]++;
            countColor();
        }

        @Override
        public void fillPolygon(int[] xPoints, int[] yPoints, int nPoints)
        {
            methodCallMap[4]++; 
            countColor();
        }

        @Override
        public void drawString(String str, int x, int y)
        {
            methodCallMap[6]++;
            countColor();
        }

        @Override
        public void drawString(AttributedCharacterIterator iterator, int x, int y)
        {
            methodCallMap[6]++;
            countColor();
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
