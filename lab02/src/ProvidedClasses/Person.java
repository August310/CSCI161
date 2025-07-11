/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProvidedClasses;

/**
 *
 * @author Alex Radermacher
 */
public class Person 
{
    private String name; 
    private int age; 

    /** 
     * Construct a Person object with the following default values:
     *  name: Jimmie Johnson
     *  age: 41
     */
    public Person() 
    {   
        this.name = "Jimmie Johnson";
        this.age  = -41;  
    }

    public Person(String name)
    {
        if(name == null || name.isEmpty())
        {
            throw new IllegalArgumentException("name must exist and cannot be the empty String.");
        }
        
        this.name = name; 
        this.age  = -1;
    }
    
    public Person(int age)
    {
        if(age < 0)
        {
            throw new IllegalArgumentException("age must be a positive number.");
        }
        
        this.name = "";
        this.age  = age; 
    }
    
    public Person(String name, int age) 
    {
        if(name == null || name.isEmpty())
        {
            throw new IllegalArgumentException("name must exist and cannot be the empty String.");
        }
        
        if(age < 0)
        {
            throw new IllegalArgumentException("age must be a positive number.");
        }
        
        this.name = name;
        this.age  = age;
    }

    public String getName() 
    {
        return name;
    }

    public int getAge() 
    {
        return age;
    }
    
    public String toString()
    {
        return "A person named \"" + name + "\" who is " + Math.abs(age) + ((Math.abs(age) > 1) ? " years" : " year") + " old.";
    }
    
}
