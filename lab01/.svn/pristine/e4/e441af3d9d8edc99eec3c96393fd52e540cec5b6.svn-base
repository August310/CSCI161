package Questions;


import java.lang.reflect.Field;
import java.util.HashMap;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author araderma
 */
public class Question5Test {


    static Field[] variableList;
    static String[] variableTypes;
    static String[] variableIdentifiers;
    static int[] variableModifiers;
    static Object[] variableValues;

    static HashMap<String, String> variableTypeMap = new HashMap();
    static HashMap<String, String> variableValueMap = new HashMap();

    @BeforeClass
    public static void setUpClass() throws Exception
    {
        Question5 testObject = new Question5();

        variableList = Question5.class.getDeclaredFields();
        variableTypes = new String[variableList.length];
        variableIdentifiers = new String[variableList.length];
        variableModifiers = new int[variableList.length];
        variableValues = new Object[variableList.length];

        int i = 0;
        for(Field f : variableList)
        {
            f.setAccessible(true);
            variableTypes[i] = f.getType().getCanonicalName().substring(f.getType().getCanonicalName().lastIndexOf(".") + 1);
            variableIdentifiers[i] = f.getName();
            variableModifiers[i] = f.getModifiers();
            variableValues[i] = f.get(testObject);

            variableTypeMap.put(variableIdentifiers[i], variableTypes[i]);
            variableValueMap.put(variableIdentifiers[i], variableValues[i].toString());

            i++;
        }

        displayOutput();
    }

    public static void displayOutput()
    {
        System.out.println("The following variables were declared and initialized:");

        for(int i = 0; i < variableList.length; i++)
        {
            System.out.println(variableIdentifiers[i] + ": " + variableValues[i].toString());
        }
    }

    public static boolean correctNumberOfVariables()
    {
        return variableList.length == 9;
    }

    public static void hasVariable(String name)
    {
        if(!variableValueMap.containsKey(name))
        {
            fail("Could not find a variable with the identifier \""+ name + "\" which is required for this test.");
        }
    }

    public static void hasType(String name, String expected)
    {
        hasVariable(name);
        assertEquals("The variable \"" + name + "\n has an unexpected type.", expected, variableTypeMap.get(name));
    }

    public static void hasValue(String name, String expected, int part)
    {
        hasVariable(name);
        assertEquals("The variable or constant for part " + part + " has an incorrect value.", expected, variableValueMap.get(name));
    }

    @Test
    public void Question5_Part1_CorrectDataType()
    {
        if(correctNumberOfVariables())
        {
            assertEquals("This test fails if the data type for the variable declared for part 1) is incorrect", "int", variableTypes[0]);
        }
        else
        {
            hasType("number1", "int");
        }
    }

    @Test
    public void Question5_Part1_CorrectValue()
    {
        hasVariable("number1");
        int value = Integer.parseInt(variableValueMap.get("number1"));

        if(value <= 0 || value > 100)
        {
            assertEquals("Improper value for variable in part 1.", "1 through 100", String.valueOf(value));
        }
    }

    @Test
    public void Question5_Part2_CorrectDataType()
    {
        if(correctNumberOfVariables())
        {
            assertEquals("This test fails if the data type for the variable declared for part 2) is incorrect", "int", variableTypes[1]);
        }
        else
        {
            hasType("number2", "int");
        }
    }

    @Test
    public void Question5_Part2_CorrectValue()
    {
        hasVariable("number2");
        int value = Integer.parseInt(variableValueMap.get("number2"));

        if(value <= 0 || value > 100)
        {
            assertEquals("Improper value for variable in part 2.", "1 through 100", String.valueOf(value));
        }
    }

    @Test
    public void Question5_Part2_IsNotDivisible()
    {
        hasVariable("number1");
        hasVariable("number2");
        int value1 = Integer.parseInt(variableValueMap.get("number1"));
        int value2 = Integer.parseInt(variableValueMap.get("number2"));


        assertNotEquals("Number1 should not be evenly divisible by number2", value1%value2, 0);

    }

    @Test
    public void Question5_Part3_CorrectDataType()
    {
        if(correctNumberOfVariables())
        {
            assertEquals("This test fails if the data type for the variable declared for part 3) is incorrect", "int", variableTypes[2]);
        }
        else
        {
            hasType("result1", "int");
        }
    }

    @Test
    public void Question5_Part3_CorrectValue()
    {
        if(correctNumberOfVariables())
        {
            int expected = (int)variableValues[0] + (int)variableValues[1];

            assertEquals("This test fails if the value for the variable declared for part 3) is incorrect", expected, (int)variableValues[2]);
        }
        else
        {
            hasVariable("result1");
            int expected = Integer.parseInt(variableValueMap.get("number1")) + Integer.parseInt(variableValueMap.get("number2"));
            assertEquals("This test fails if the value for the variable declared for part 3) is incorrect", expected, Integer.parseInt(variableValueMap.get("result1")));
        }
    }

    @Test
    public void Question5_Part4_CorrectDataType()
    {
        if(correctNumberOfVariables())
        {
            assertEquals("This test fails if the data type for the variable declared for part 4) is incorrect", "int", variableTypes[3]);
        }
        else
        {
            hasType("result1", "int");
        }
    }

    @Test
    public void Question5_Part4_CorrectValue()
    {
        if(correctNumberOfVariables())
        {
            int expected = (int)variableValues[0] - (int)variableValues[1];

            assertEquals("This test fails if the value for the variable declared for part 4) is incorrect", expected, (int)variableValues[3]);
        }
        else
        {
            hasVariable("result2");
            int expected = Integer.parseInt(variableValueMap.get("number1")) - Integer.parseInt(variableValueMap.get("number2"));
            assertEquals("This test fails if the value for the variable declared for part 4) is incorrect", expected, Integer.parseInt(variableValueMap.get("result2")));
        }
    }

    @Test
    public void Question5_Part5_CorrectDataType()
    {
        if(correctNumberOfVariables())
        {
            assertEquals("This test fails if the data type for the variable declared for part 5) is incorrect", "int", variableTypes[4]);
        }
        else
        {
            hasType("result3", "int");
        }
    }

    @Test
    public void Question5_Part5_CorrectValue()
    {
        if(correctNumberOfVariables())
        {
            int expected = (int)variableValues[0] * (int)variableValues[1];

            assertEquals("This test fails if the value for the variable declared for part 5) is incorrect", expected, (int)variableValues[4]);
        }
        else
        {
            hasVariable("result3");
            int expected = Integer.parseInt(variableValueMap.get("number1")) * Integer.parseInt(variableValueMap.get("number2"));
            assertEquals("This test fails if the value for the variable declared for part 5) is incorrect", expected, Integer.parseInt(variableValueMap.get("result3")));

        }
    }

    @Test
    public void Question5_Part6_CorrectDataType()
    {
        if(correctNumberOfVariables())
        {
            assertEquals("This test fails if the data type for the variable declared for part 6) is incorrect", "int", variableTypes[5]);
        }
        else
        {
            hasType("result4", "int");
        }
    }

    @Test
    public void Question5_Part6_CorrectValue()
    {
        if(correctNumberOfVariables())
        {
            int expected = (int)variableValues[0] / (int)variableValues[1];

            assertEquals("This test fails if the value for the variable declared for part 6) is incorrect", expected, (int)variableValues[5]);
        }
        else
        {
            hasVariable("result4");
            int expected = Integer.parseInt(variableValueMap.get("number1")) / Integer.parseInt(variableValueMap.get("number2"));
            assertEquals("This test fails if the value for the variable declared for part 6) is incorrect", expected, Integer.parseInt(variableValueMap.get("result4")));
        }
    }

    @Test
    public void Question5_Part7_CorrectDataType()
    {
        if(correctNumberOfVariables())
        {
            assertEquals("This test fails if the data type for the variable declared for part 7) is incorrect", "int", variableTypes[6]);
        }
        else
        {
            hasType("result5", "int");
        }
    }

    @Test
    public void Question5_Part7_CorrectValue()
    {
        if(correctNumberOfVariables())
        {
            int expected = (int)variableValues[0] % (int)variableValues[1];

            assertEquals("This test fails if the value for the variable declared for part 7) is incorrect", expected, (int)variableValues[6]);
        }
        else
        {
            hasVariable("result5");
            int expected = Integer.parseInt(variableValueMap.get("number1")) % Integer.parseInt(variableValueMap.get("number2"));
            assertEquals("This test fails if the value for the variable declared for part 7) is incorrect", expected, Integer.parseInt(variableValueMap.get("result5")));

        }
    }

    @Test
    public void Question5_Part8_CorrectDataType()
    {
        if(correctNumberOfVariables())
        {
            assertEquals("This test fails if the data type for the variable declared for part 8) is incorrect", "double", variableTypes[7]);
        }
        else
        {
            hasType("result6", "double");
        }
    }

    @Test
    public void Question5_Part8_CorrectValue()
    {
        if(correctNumberOfVariables())
        {
            double expected = (int)variableValues[0] / (int)variableValues[1];

            assertEquals("This test fails if the value for the variable declared for part 8) is incorrect", expected, (double)variableValues[7], 0.0001);
        }
        else
        {
            hasVariable("result6");
            double expected = Integer.parseInt(variableValueMap.get("number1")) / Integer.parseInt(variableValueMap.get("number2"));
            assertEquals("This test fails if the value for the variable declared for part 8) is incorrect", expected, Double.parseDouble(variableValueMap.get("result6")), 0.0001);

        }
    }

    @Test
    public void Question5_Part9_CorrectDataType()
    {
        if(correctNumberOfVariables())
        {
            assertEquals("This test fails if the data type for the variable declared for part 9) is incorrect", "double", variableTypes[8]);
        }
        else
        {
            hasType("result7", "double");
        }
    }

    @Test
    public void Question5_Part9_CorrectValue()
    {
        if(correctNumberOfVariables())
        {
            double expected = ((double)(int)variableValues[0]) / (int)variableValues[1];


            assertEquals("This test fails if the value for the variable declared for part 9) is incorrect", expected, (double)variableValues[8], 0.0001);
        }
        else
        {
            hasVariable("result7");
            double expected = Double.parseDouble(variableValueMap.get("number1")) / Double.parseDouble(variableValueMap.get("number2"));

            assertEquals("This test fails if the value for the variable declared for part 9) is incorrect", expected, Double.parseDouble(variableValueMap.get("result7")), 0.0001);
        }
    }

}
