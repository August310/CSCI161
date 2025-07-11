/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HelperClasses;

import GameEntities.Horse;
import GameEntities.Survivor;

/**
 *
 * @author August Preuss
 */
public class DescriptionHelper {
    
    private DescriptionHelper(){
        
    }
    
    public static String getThirstDescription(Survivor survivor){
        int thirst = survivor.getThirst();
        if(thirst >= 8){
            return "not thirsty";
        }
        else if(thirst < 8 && thirst >= 6){
            return "slighty thirsty";
        }
        else if(thirst <= 5 && thirst >= 2){
            return "dehydrated";
        }
        else{
            return "severely dehydrated";
        }
        
    }

public static String getHungerDescription(Survivor survivor){
        int hunger = survivor.getHunger();
        if(hunger >= 8){
            return "satiated";
        }
        else if(hunger < 8 && hunger >= 6){
            return "slighty hungry";
        }
        else if(hunger <= 5 && hunger >= 2){
            return "hungry";
        }
        else{
            return "starving";
        }
        
    }


public static String getEnergyDescription(Survivor survivor){
        int energy = survivor.getEnergy();
        if(energy >= 8){
            return "energetic";
        }
        else if(energy < 8 && energy >= 6){
            return "rested";
        }
        else if(energy <= 5 && energy >= 2){
            return "tired";
        }
        else{
            return "energy deprived";
        }
        
    }


public static String getHealthDescription(Survivor survivor){
        int health = survivor.getHealth();
        if(health >= 8){
            return "Not thirsty";
        }
        else if(health < 8 && health >= 6){
            return "Slighty thirsty";
        }
        else if(health <= 5 && health >= 2){
            return "Dehydrated";
        }
        else{
            return "Severely dehydrated";
        }
        
    }



public static String getThirstDescription(Horse horse){
        int thirst = horse.getThirst();
        if(thirst >= 8){
            return "not thirsty";
        }
        else if(thirst < 8 && thirst >= 6){
            return "slighty thirsty";
        }
        else if(thirst <= 5 && thirst >= 2){
            return "dehydrated";
        }
        else{
            return "severely dehydrated";
        }
        
    }


public static String getHungerDescription(Horse horse){
        int hunger = horse.getHunger();
        if(hunger >= 8){
            return "satiated";
        }
        else if(hunger < 8 && hunger >= 6){
            return "slighty hungry";
        }
        else if(hunger <= 5 && hunger >= 2){
            return "hungry";
        }
        else{
            return "starving";
        }
        
    }



public static String getEnergyDescription(Horse horse){
        int energy = horse.getEnergy();
        if(energy >= 8){
            return "energetic";
        }
        else if(energy < 8 && energy >= 6){
            return "rested";
        }
        else if(energy <= 5 && energy >= 2){
            return "tired";
        }
        else{
            return "energy deprived";
        }
        
    }


public static String getStatus(Survivor survivor){
    return "Survivor status: " + getHungerDescription(survivor) + ", " + getThirstDescription(survivor) + ", " + getEnergyDescription(survivor) + ", " + getHealthDescription(survivor);
}

public static String getStatus(Horse horse){
    return "Horse status: " + getHungerDescription(horse) + ", "  + getThirstDescription(horse) + ", " + getEnergyDescription(horse);
}























}
