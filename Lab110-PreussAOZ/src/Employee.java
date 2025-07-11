
import java.util.Random;

/**
 *
 * @author August Preuss
 * @version 5/6/2025
 * makes an employee with random attributes
 * 
 */
public class Employee  {
    
    Random rand = new Random();
    //variables to determine the max and mins for the random employee constructor
    int id;
    String name;
    int dept;
    int hired;
    StringBuilder randomString;
    int lengthMax = 10;
    int lengthMin = 5;
    int deptMax = 5;
    int deptMin = 1;
    int hiredMax = 2018;
    int hiredMin = 2008;
    
    //an employee constructor that makes an employee with random values
    public Employee(){
        //random id from 0 to 99999999
        this.id = rand.nextInt(100000000);
        
        //random length between 5 and 10
        int length = lengthMin + rand.nextInt((lengthMax - lengthMin) + 1);
        //use stringbuilder to make a random string
        randomString = new StringBuilder(length);
        //all of the letters that can be added to the string
        String letters = "abcdefghijklmnopqrstuvwxyz";
        
        //adds a random letter to the string until we hit the length of the string
        for(int i = 0; i < length; i++){
            randomString.append(letters.charAt(rand.nextInt(letters.length())));
        }
        
        //turns the name into a string again
        this.name = randomString.toString();
        
        //random dept from 1 to 5
        this.dept = deptMin + rand.nextInt((deptMax - deptMin) + 1);
        
        //random ired date from 2008 to 2018
        this.hired = hiredMin + rand.nextInt((hiredMax - hiredMin) + 1);
        
    }
    
    /**
     * gets the id of an employee
     * @return id int value
     */
    public int getId(){
        return id;
    }
    
    /**
     * gets the name of an employee
     * @return string name value
     */
    public String getName(){
        return name;
    }
    
    /**
     * gets the dept of an employee
     * @return dept int value
     */
    public int getDept(){
        return dept;
    }
    
    /**
     * gets the hired time of an employee
     * @return hired int value
     */
    public int getHired(){
        return hired;
    }
    
    
    
}
