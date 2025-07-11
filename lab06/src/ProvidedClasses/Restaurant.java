/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProvidedClasses;

import java.util.Random;

/**
 *
 * @author araderma
 */
public class Restaurant 
{

    private String name; 
    private Mode   mode; 
       
    // Using an Enum type just for fun
    // Also for learning purposes. Apparently they can do more than I originally thought!
    // Always try to learn something new every day. 
    public enum Mode
    {
        WORKS_CORRECTLY ("This mode should work properly and all of your tests should pass.") 
        { 
            @Override
            public boolean getsDiscount(int age, boolean militaryStatus) 
            { 
                return ((age >= 1 && age <= 6 || age >= 65) || (age >= 16 && militaryStatus)) && !(militaryStatus && age < 16);
            } 
        },
        ALWAYS_TRUE("This mode disregards method arguments and always returns true.")
        { 
            @Override
            public boolean getsDiscount(int age, boolean militaryStatus) 
            { 
                return true; 
            } 
        },
        ALWAYS_FALSE("This mode disregards method arguments and always returns false.")
        {
            @Override
            public boolean getsDiscount(int age, boolean militaryStatus) 
            {
                return false;
            }   
        },
        AGE_BOUNDARY_TOO_TIGHT("This mode has age boundaries (excluding military service) that are too restrictive.") 
        {
            @Override
            public boolean getsDiscount(int age, boolean militaryStatus) 
            {
                return ((age >= 0 && age < 6 || age > 65) || (age >= 16 && militaryStatus)) && !(militaryStatus && age < 16);
            }
        },
        AGE_BOUNDARY_TOO_LOOSE("This mode has age boundaries (excluding military service) that are too permissive.")
        {
            @Override
            public boolean getsDiscount(int age, boolean militaryStatus) 
            {
                return ((age >= 0 && age <= 7 || age >= 64) || (age >= 16 && militaryStatus)) && !(militaryStatus && age < 16);
            } 
        },
        REQUIRES_MILITARY_SERVICE("This mode requires valid military service to receive a discount.")
        {
            @Override
            public boolean getsDiscount(int age, boolean militaryStatus)
            {
                return (age >= 16 && militaryStatus);
            }
            
        },
        NO_MILITARY_AGE_RESTRICTION("This mode functions correctly but does not validate age for military service.")
        {
            @Override
            public boolean getsDiscount(int age, boolean militaryStatus)
            {
                return (age >= 0 && age <= 6 || age >= 65) || militaryStatus;
            }
        },
        MILITARY_AGE_BOUNDARY_TOO_TIGHT("This mode functions correctly but makes the military age boundary too restrictive.")
        {
            @Override
            public boolean getsDiscount(int age, boolean militaryStatus)
            {
                return ((age >= 0 && age <= 6 || age >= 65) || (age > 16 && militaryStatus)) && !(militaryStatus && age <= 16);
            }
        },
        MILITARY_AGE_BOUNDARY_TOO_LOOSE("This mode functions correctly but makes the military age boundary too permissive.")
        {
            @Override
            public boolean getsDiscount(int age, boolean militaryStatus)
            {
                return ((age >= 0 && age <= 6 || age >= 65) || (age >= 15 && militaryStatus)) && !(militaryStatus && age < 15);
            }
        },
        ALLOWS_ILLEGAL_AGES("This mode allows for negative age values, but handles military service properly.")
        {
            @Override
            public boolean getsDiscount(int age, boolean militaryStatus) 
            {
                return ((age <= 6 || age >= 65) || (age >= 16 && militaryStatus)) && !(militaryStatus && age < 16);
            }
        };
       
        
        private String description;
        
        private Mode(String desc)
        {
            this.description = desc; 
        }
        
        public abstract boolean getsDiscount(int age, boolean militaryStatus); 
        
        private String getDescription()
        {
            return description; 
        }
        
    }
    
    public Restaurant() 
    {
        this(new Random().nextInt(Mode.values().length)); 
    }
    
    public Restaurant(int mode)
    {
        this.name = "Big Al's Pizza Emporium";
        int maxMode = Mode.values().length;
        this.mode = (mode > maxMode || mode < 0) ? Mode.WORKS_CORRECTLY : Mode.values()[mode]; 
    }
    
    public Restaurant(Mode mode)
    {
        this.name = "Big Al's Pizza Emporium";
        this.mode = mode;
    }
    
    public String getModeDescription()
    {
        return mode.getDescription(); 
    }
    
    public Mode getMode()
    {
        return mode; 
    }
    
    public boolean checkIfCustomerGetsDiscount(int age, boolean militaryStatus)
    {
        return mode.getsDiscount(age, militaryStatus);
    }
    
}
