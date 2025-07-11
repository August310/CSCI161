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
public class Tool 
{
    private String name; 
    
    public static final Tool HAMMER = new Tool("Hammer"); 
    public static final Tool CHAINSAW = new Tool("Chainsaw"); 
    public static final Tool SCREWDRIVER = new Tool("Screwdriver"); 
    public static final Tool DRILL = new Tool("Drill"); 
    public static final Tool SANDER = new Tool("Sander"); 
    
    private Tool(String name)
    {
        this.name = name; 
    }
    
    public String getName()
    {
        return name; 
    }
    
    public String toString()
    {
        return name; 
    }
}
