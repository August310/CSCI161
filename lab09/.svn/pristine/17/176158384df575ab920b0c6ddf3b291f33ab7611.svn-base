/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Questions;

import ProvidedClasses.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;


public class ZooTest {

    static Field[]          fields;
    static Method[]         methods;
    static Constructor[]    constructors;
    
    @BeforeClass
    public static void setUpClass() 
    {
        fields          = Zoo.class.getDeclaredFields();
        methods         = Zoo.class.getDeclaredMethods();
        constructors    = Zoo.class.getDeclaredConstructors();
        
        for(Field f : fields)
        {
            f.setAccessible(true);
        }
    }
    
    @Test
    public void testZoo_addAnimal() throws Exception
    {
        assertEquals("Unexpected number of instance variables.", 1, fields.length);
        
        Zoo testZoo = new Zoo();
        
        Lion l = new Lion();
        
        testZoo.addAnimal(l);
        
        ArrayList<Animal> actual = (ArrayList<Animal>) fields[0].get(testZoo);
        
        assertEquals("Unexpected number of animals in the zoo.", 1, actual.size());
        
        assertEquals("Wrong animal added to the zoo.", l, actual.get(0));     
    }
    
    @Test
    public void testZoo_IntanceVariables_MeaningfulIdentifiers()
    {
        assertEquals("Unexpected number of instance variables.", 1, fields.length);
        
        String name = fields[0].getName().toLowerCase();
        
        if(!(name.contains("animal") || name.contains("list")))
        {
            fail("Non-meaningful identifier for animal list instance variable: " + name);
        }
    }
    
    @Test
    public void testZoo_InstanceVariable_CorrectAccessModifier()
    {
        assertEquals("Unexpected number of instance variables.", 1, fields.length);
        
        int mod = fields[0].getModifiers(); 
        
        if(!Modifier.isPrivate(mod))
        {
            fail("Animal list instance variable should have correct access modifier. Was: " + Modifier.toString(mod));
        }
    }
    
    @Test
    public void testZoo_listAnimals_WorksCorrectly()
    {
        Zoo testZoo = new Zoo();
        
        Animal a = new Crow();
        Animal b = new Parrot();
        Animal c = new Lion();
        
        testZoo.addAnimal(a);
        testZoo.addAnimal(b);
        testZoo.addAnimal(c);
        
        String expected = a.toString() + "\n" + b.toString() + "\n" + c.toString() + "\n";
        
        System.out.println("Output for listAnimals():\n");
        System.out.println(testZoo.listAnimals());
        
        assertEquals("listAnimals produced unexpected output.", expected, testZoo.listAnimals());
        
    }
    
   
    
}
