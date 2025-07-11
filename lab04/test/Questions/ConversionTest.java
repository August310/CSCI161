package Questions;


import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import static org.junit.Assert.*;
import org.junit.Test;


public class ConversionTest 
{
    @Test
    public void testCelsiusToFahrenheit_int() 
    {
        int temperature = -40;
        int expResult = -40;
        int result = Conversion.celsiusToFahrenheit(temperature);
        assertEquals(expResult, result);
    }

    @Test
    public void testCelsiusToFahrenheit_double() 
    {
        double temperature = 12.5;
        double expResult = 54.5;
        double result = Conversion.celsiusToFahrenheit(temperature);
        assertEquals(expResult, result, 0.00001);
    }

    @Test
    public void testFahrenheitToCelsius_int() 
    {
        int temperature = 212;
        int expResult = 100;
        int result = Conversion.fahrenheitToCelsius(temperature);
        assertEquals(expResult, result);
    }

    @Test
    public void testFahrenheitToCelsius_double() 
    {
        double temperature = 117.5;
        double expResult = 47.5;
        double result = Conversion.fahrenheitToCelsius(temperature);
        assertEquals(expResult, result, 0.00001);
    }

    @Test
    public void testMetersToInches_int() 
    {
        int length = 4;
        int expResult = 157;
        int result = Conversion.metersToInches(length);
        assertEquals(expResult, result);
    }

    @Test
    public void testMetersToInches_double() 
    {
        double length = 6.32;
        double expResult = 248.8189;
        double result = Conversion.metersToInches(length);
        assertEquals(expResult, result, 0.001);

    }

    @Test
    public void testInchesToMeters_int() 
    {
        int length = 37;
        int expResult = 0;
        int result = Conversion.inchesToMeters(length);
        assertEquals(expResult, result);
    }

    @Test
    public void testInchesToMeters_double() 
    {
        double length = 178.5;
        double expResult = 4.5339;
        double result = Conversion.inchesToMeters(length);
        assertEquals(expResult, result, 0.001);
    }
    
    @Test
    public void testPrivateConstructor()
    {
        Constructor<?> cons[];
        try 
        {
            cons = Conversion.class.getDeclaredConstructors();
            for (Constructor<?> c : cons)
            {
                if (!Modifier.isPrivate(c.getModifiers()))
                {
                    fail("Non-private constructor method: " + Modifier.toString(c.getModifiers()) + " " + c.toString().substring(c.toString().indexOf(".") + 1));
                }
            }
        } 
        catch (Exception e) 
        {
            fail("No constructor method has been declared.");
        }
    }
   
}
