package Questions.Chapter9;

import java.util.Random;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author araderma
 */
public class Question2Test {

    static Object[] results; 
    
    @BeforeClass
    public static void setUpClass() 
    {
        Question2 q2 = new Question2();
        
        results = q2.Question2(); 
    }
      
    @Test
    public void testQuestion2_Part1_CorrectType() 
    {
        Object o = results[0];
        
        String name = o.getClass().getName();
        
        String type = name.replace("[", "").substring(0, 1);
        String className = name.replace("[", "").substring(1); 
                
        if (type.equals("B"))
        {
            fail("Using type byte which is too small.");
        }
        
        if (type.equals("D") || type.equals("F"))
        {
            fail("Floating-point types should not be used.");
        }
        
        if (type.equals("L") && className.length() > 0)
        {
            fail("You should use a primitive type.");
        } 
    }
    
    @Test
    public void testQuestion2_Part2_CorrectType() 
    {
        Object o = results[1];
        
        String name = o.getClass().getName();
        
        String type = name.replace("[", "").substring(0, 1);
        String className = name.replace("[", "").substring(1); 
                        
        if (className.length() > 0)
        {
            fail("You should use a primitive type.");
        } 
        
        if (!(type.equals("D") || type.equals("F")))
        {
            fail("The amount of snowfall may contain a fractional part.");
        }
    }
    
    @Test
    public void testQuestion2_Part3_CorrectType() 
    {
        Object o = results[2];
        
        String name = o.getClass().getName();
        
        String type = name.replace("[", "").substring(0, 1);
        String className = name.replace("[", "").substring(1); 
           
                
        if (className.length() > 0)
        {
            fail("You should use a primitive type for this.");
        } 
        
        if (type.equals("D") || type.equals("F"))
        {
            fail("Floating-point types should not be used as sales are a whole number.");
        }

    }
    
    @Test
    public void testQuestion2_Part4_CorrectType() 
    {
        Object o = results[3];
        
        String name = o.getClass().getName();
        
        String type = name.replace("[", "").substring(0, 1);
        String className = name.replace("[", "").substring(1); 
                       
        if (!className.contains("String"))
        {
            fail("You should use a String type to store names.");
        } 
    }
    
    @Test
    public void testQuestion2_Part5_CorrectType() 
    {
        Object o = results[4];
        
        String name = o.getClass().getName();
        
        String type = name.replace("[", "").substring(0, 1);
        String className = name.replace("[", "").substring(1); 
                
        if (!(type.equals("D") || className.contains("Double") || type.equals("F") || type.contains("Float")))
        {
            fail("You want to store sales amounts in dollars.");
        } 
        
    }
    
    @Test
    public void testQuestion2_Part1_CorrectDimensions() 
    {
        Object o = results[0];
        
        String name = o.getClass().getName();
        
        int dimensions = name.lastIndexOf("[") + 1; 

        String message = "This test fails if there are an incorrect number of dimensions.";
        assertEquals(message, 2, dimensions);
    }
    
    @Test
    public void testQuestion2_Part2_CorrectDimensions() 
    {
        Object o = results[1];
        
        String name = o.getClass().getName();
        
        int dimensions = name.lastIndexOf("[") + 1; 

        String message = "This test fails if there are an incorrect number of dimensions.";
        assertEquals(message, 2, dimensions);
    }
    
    @Test
    public void testQuestion2_Part3_CorrectDimensions() 
    {
        Object o = results[2];
        
        String name = o.getClass().getName();
        
        int dimensions = name.lastIndexOf("[") + 1; 

        String message = "This test fails if there are an incorrect number of dimensions.";
        assertEquals(message, 3, dimensions);
    }
    
    @Test
    public void testQuestion2_Part4_CorrectDimensions() 
    {
        Object o = results[3];
        
        String name = o.getClass().getName();
        
        int dimensions = name.lastIndexOf("[") + 1; 

        String message = "This test fails if there are an incorrect number of dimensions.";
        assertEquals(message, 2, dimensions);
    }
    
    @Test
    public void testQuestion2_Part5_CorrectDimensions() 
    {
        Object o = results[4];
        
        String name = o.getClass().getName();
        
        int dimensions = name.lastIndexOf("[") + 1; 

        String message = "This test fails if there are an incorrect number of dimensions.";
        assertEquals(message, 5, dimensions);
    }
    
    @Test
    public void testQuestion2_Part1_Dimesion1Correct() 
    {
        Object o = results[0];
        
        int[][] result; 
        try 
        {
            result = (int[][])o; 
            int length = result.length;
            
            String message = "This test fails if specified dimension is an incorrect size.";
            assertEquals(message, 111, length); 
        } 
        catch (Exception e) 
        {
            fail("Unable to type-cast to proper type");
        }  
    }
    
    @Test
    public void testQuestion2_Part1_Dimesion2Correct() 
    {
        Object o = results[0];
        
        int[][] result; 
        try 
        {
            result = (int[][])o; 
            int length = result[0].length;
            
            String message = "This test fails if specified dimension is an incorrect size.";
            assertEquals(message, 11, length); 
        } 
        catch (Exception e) 
        {
            fail("Unable to type-cast to proper type");
        }  
    }
    
    @Test
    public void testQuestion2_Part2_Dimesion1Correct() 
    {
        Object o = results[1];
        
        double[][] result; 
        try 
        {
            result = (double[][])o; 
            int length = result.length;
            
            String message = "This test fails if specified dimension is an incorrect size.";
            assertEquals(message, 100, length); 
        } 
        catch (Exception e) 
        {
            fail("Unable to type-cast to proper type");
        }  
    }
    
    @Test
    public void testQuestion2_Part2_Dimesion2Correct() 
    {
        Object o = results[1];
        
        double[][] result; 
        try 
        {
            result = (double[][])o; 
            int length = result[0].length;
            
            String message = "This test fails if specified dimension is an incorrect size.";
            assertEquals(message, 7, length); 
        } 
        catch (Exception e) 
        {
            fail("Unable to type-cast to proper type");
        }  
    }
    
    @Test
    public void testQuestion2_Part3_Dimesion2Correct() 
    {
        Object o = results[2];
        
        int[][][] result; 
        try 
        {
            result = (int[][][])o; 
            int length = result[0].length;
            
            String message = "This test fails if specified dimension is an incorrect size.";
            assertEquals(message, 52, length); 
        } 
        catch (Exception e) 
        {
            fail("Unable to type-cast to proper type");
        }  
    }
    
    @Test
    public void testQuestion2_Part3_Dimesion3Correct() 
    {
        Object o = results[2];
        
        int[][][] result; 
        try 
        {
            result = (int[][][])o; 
            int length = result[0][0].length;
            
            String message = "This test fails if specified dimension is an incorrect size.";
            assertEquals(message, 17, length); 
        } 
        catch (Exception e) 
        {
            fail("Unable to type-cast to proper type");
        }  
    }
    
    @Test
    public void testQuestion2_Part3_Dimesion1Correct() 
    {
        Object o = results[2];
        
        int[][][] result; 
        try 
        {
            result = (int[][][])o; 
            int length = result.length;
            
            String message = "This test fails if specified dimension is an incorrect size.";
            assertEquals(message, 3, length); 
        } 
        catch (Exception e) 
        {
            fail("Unable to type-cast to proper type");
        }  
    }
    
    @Test
    public void testQuestion2_Part4_Dimesion1Correct() 
    {
        Object o = results[3];
        
        String[][] result; 
        try 
        {
            result = (String[][])o; 
            int length = result.length;
            
            String message = "This test fails if specified dimension is an incorrect size.";
            assertEquals(message, 3, length); 
        } 
        catch (Exception e) 
        {
            fail("Unable to type-cast to proper type");
        }  
    }
    
    @Test
    public void testQuestion2_Part4_Dimesion2Correct() 
    {
        Object o = results[3];
        
        String[][] result; 
        try 
        {
            result = (String[][])o; 
            int length = result[0].length;
            
            String message = "This test fails if specified dimension is an incorrect size.";
            assertEquals(message, 365, length); 
        } 
        catch (Exception e) 
        {
            fail("Unable to type-cast to proper type");
        }  
    }
    
    @Test
    public void testQuestion2_Part5_Dimesion1Correct() 
    {
        Object o = results[4];
        
        double[][][][][] result; 
        try 
        {
            result = (double[][][][][])o; 
            int length = result.length;
            
            String message = "This test fails if specified dimension is an incorrect size.";
            assertEquals(message, 10, length); 
        } 
        catch (Exception e) 
        {
            fail("Unable to type-cast to proper type");
        }  
    }
    
    @Test
    public void testQuestion2_Part5_Dimesion2Correct() 
    {
        Object o = results[4];
        
        double[][][][][] result; 
        try 
        {
            result = (double[][][][][])o; 
            int length = result[0].length;
            
            String message = "This test fails if specified dimension is an incorrect size.";
            assertEquals(message, 52, length); 
        } 
        catch (Exception e) 
        {
            fail("Unable to type-cast to proper type");
        }  
    }
    
    @Test
    public void testQuestion2_Part5_Dimesion3Correct() 
    {
        Object o = results[4];
        
        double[][][][][] result; 
        try 
        {
            result = (double[][][][][])o; 
            int length = result[0][0].length;
            
            String message = "This test fails if specified dimension is an incorrect size.";
            assertEquals(message, 7, length); 
        } 
        catch (Exception e) 
        {
            fail("Unable to type-cast to proper type");
        }  
    }
    
    @Test
    public void testQuestion2_Part5_Dimesion4Correct() 
    {
        Object o = results[4];
        
        double[][][][][] result; 
        try 
        {
            result = (double[][][][][])o; 
            int length = result[0][0][0].length;
            
            String message = "This test fails if specified dimension is an incorrect size.";
            assertEquals(message, 10, length); 
        } 
        catch (Exception e) 
        {
            fail("Unable to type-cast to proper type");
        }  
    }
    
    @Test
    public void testQuestion2_Part5_Dimesion5Correct() 
    {
        Object o = results[4];
        
        double[][][][][] result; 
        try 
        {
            result = (double[][][][][])o; 
            int length = result[0][0][0][0].length;
            
            String message = "This test fails if specified dimension is an incorrect size.";
            assertEquals(message, 12, length); 
        } 
        catch (Exception e) 
        {
            fail("Unable to type-cast to proper type");
        }  
    }
}
