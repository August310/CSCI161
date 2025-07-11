package Questions.Chapter8;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author araderma
 */
public class ArrayUtilitiesTest {
    
    public ArrayUtilitiesTest() 
    {
        
    }
    
    @Test
    public void testResizeArray_ElementsCorrect() 
    {
        int[] oldArray = {0, 1, 2, 3};
        int[] expResult = {0, 1, 2, 3, 0, 0, 0, 0};
        int[] result = ArrayUtilities.resizeArray(oldArray);
        
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testResizeArray_SizeCorrect() 
    {
        int[] oldArray = {0, 1, 2, 3};
        int[] expResult = {0, 1, 2, 3, 0, 0, 0, 0};
        int[] result = ArrayUtilities.resizeArray(oldArray);
        
        assertEquals(expResult.length, result.length);
    }


    @Test
    public void testCopyArray_ElementsCorrect() 
    {

        int[] oldArray = {0, 1, 2, 3};
        int[] expResult = {0, 1, 2, 3};
        
        int[] result = ArrayUtilities.copyArray(oldArray);
        
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testCopyArray_IsDifferentObject() 
    {

        int[] oldArray = {0, 1, 2, 3};
        
        int[] result = ArrayUtilities.copyArray(oldArray);
        
        String message = "This test fails if the copyArray method's return value has the same object reference as the argument passed to it.";
        assertFalse(message, oldArray == result);
    }
    
    @Test
    public void testCopyArray_SizeCorrect() 
    {

        int[] oldArray = {0, 1, 2, 3};
        int[] expResult = {0, 1, 2, 3};
        
        int[] result = ArrayUtilities.copyArray(oldArray);
        
        assertEquals(expResult.length, result.length);
    }


    @Test
    public void testArraysAreEqual_EqualArrays() 
    {
        int[] array1 = {0, 1, 2, 3};
        int[] array2 = {0, 1, 2, 3};
        boolean expResult = true;
        boolean result = ArrayUtilities.arraysAreEqual(array1, array2);
        
        String message = "This test fails of the arraysAreEqual method does not return true for two equal arrays.";
        assertEquals(message, expResult, result);
    }
    
    @Test
    public void testArraysAreEqual_UnequalArrays() 
    {
        int[] array1 = {0, 1, 2, 3};
        int[] array2 = {1, 2, 3, 5};
        boolean expResult = false;
        boolean result = ArrayUtilities.arraysAreEqual(array1, array2);
        
        String message = "This test fails of the arraysAreEqual method does not return false for two equally sized, unequal arrays.";
        assertEquals(message, expResult, result);
    }
    
    @Test
    public void testArraysAreEqual_DifferentSizes() 
    {
        int[] array1 = {0, 1, 2, 3};
        int[] array2 = {0, 1, 2, 3, 4};
        boolean expResult = false;
        
        try 
        {
            boolean result = ArrayUtilities.arraysAreEqual(array1, array2);
        
            String message = "This test fails of the arraysAreEqual method does not return false for two different sized arrays.";
            assertEquals(message, expResult, result); 
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
            fail("This test fails if it generates a runtime exception.");
        }
        
    }
    
    @Test
    public void testArraysAreEqual_UnequalArrays_LastElement() 
    {
        int[] array1 = {0, 1, 2, 3};
        int[] array2 = {0, 1, 2, 4};
        boolean expResult = false;
        boolean result = ArrayUtilities.arraysAreEqual(array1, array2);
        
        String message = "This test fails of the arraysAreEqual method does not return false for two unequal arrays with their only difference in the last element.";
        assertEquals(message, expResult, result);
    }
    
    @Test
    public void testArraysAreEqual_UnequalArrays_FirstElement() 
    {
        int[] array1 = {0, 1, 2, 3};
        int[] array2 = {1, 1, 2, 3};
        boolean expResult = false;
        boolean result = ArrayUtilities.arraysAreEqual(array1, array2);
        
        String message = "This test fails of the arraysAreEqual method does not return false for two unequal arrays with their only difference in the first element.";
        assertEquals(message, expResult, result);
    }
    
}
