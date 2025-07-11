package Questions;

import java.awt.Graphics;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author araderma
 */
public class DrawableTest {


    public static Method[] methods;

    @BeforeClass
    public static void setUpClass()
    {
        methods = Drawable.class.getDeclaredMethods();


    }

    @Test
    public void testDrawable_HasCorrectModifiers()
    {
        int mod = Drawable.class.getModifiers();

        if (!Modifier.isPublic(mod))
        {
            fail("Drawable is not defined as a \"public\" class.");
        }
        if (!Modifier.isAbstract(mod))
        {
            fail("Drawable is not defined as an \"abstract\" class.");
        }
    }

    @Test
    public void testDrawable_HasDrawMethod()
    {
        String message = "Drawable has an inappropriate number of methods.";
        assertEquals(message, 1, methods.length);

        assertEquals("Drawable does not have an appropriately named method.", "draw", methods[0].getName());

    }

    @Test
    public void testDrawable_DrawMethod_HasCorrectModifiers()
    {
        String message = "Drawable has an inappropriate number of methods.";
        assertEquals(message, 1, methods.length);

        assertEquals("Drawable does not have an appropriately named method.", "draw", methods[0].getName());

        int mod = methods[0].getModifiers();

        if (!Modifier.isPublic(mod))
        {
            fail("draw is not defined as a \"public\" method.");
        }
        if (!Modifier.isAbstract(mod))
        {
            fail("draw is not defined as an \"abstract\" method.");
        }
    }

    @Test
    public void testDrawable_DrawMethod_HasCorrectParameters()
    {
        String message = "Drawable has an inappropriate number of methods.";
        assertEquals(message, 1, methods.length);

        assertEquals("Drawable does not have an appropriately named method.", "draw", methods[0].getName());

        Class[] parameters = methods[0].getParameterTypes();

        assertEquals("draw does not the the correct number of parameters", 1, parameters.length);

        String name = parameters[0].getCanonicalName();

        String type = name.substring(name.lastIndexOf(".") + 1);

        assertEquals("draw does not have the correct parameter type", "Graphics", type);
    }

}
