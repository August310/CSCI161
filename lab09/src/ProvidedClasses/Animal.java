/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ProvidedClasses;

/**
 *
 * @author araderma
 */
public class Animal 
{
    protected String name; 
    private   int    birthYear; 
    
    public Animal()
    {
        name      = "No Name";
        birthYear = 2008;
    }
    
    public Animal(String name, int birthYear)
    {
        if(name != null)
            this.name      = name; 
        else
            this.name      = "No Name";
        
        if(birthYear < 2015)
            this.birthYear = birthYear; 
        else
            this.birthYear = 2014; 
    }
    
    public String getName()
    {
        return name; 
    }
    
    public int getBirthYear()
    {
        return birthYear; 
    }
    
    public void setName(String newName)
    {
        if(newName != null)
            name = newName; 
    }
    
    public String toString()
    {
        return name + ", " + birthYear; 
    }
}
