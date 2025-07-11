/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Game;

import GameEntities.Horse;
import GameEntities.Survivor;
import HelperClasses.DescriptionHelper;
import static HelperClasses.DescriptionHelper.getStatus;
import HelperClasses.MenuHelper;
import java.util.Random;

/**
 *
 * @author August Preuss
 */
public class Game {
    
    private Survivor survivor;
    private Horse horse;
    private double difficultyModifier;
    private int distanceTraveled;
    private int pursuerDistance;
    private int distanceBetweenPursuerAndSurvivor;
    private String timeOfDay;
    private String weather;
    private String location;
    private Random rand;


    private boolean checkHorseCanTravel(){
        
        if((horse.getThirst() <= 0) || (horse.getHunger() <= 0) || (horse.getEnergy() <= 0)){
            return false;
        }
        else{
            System.out.println(DescriptionHelper.getStatus(horse));
            return true;
            
            
        }           
       
            
        
    }

    private boolean checkSurvivorIsDead(){
        if((survivor.getThirst() <= 0) || (survivor.getHunger() <= 0) || (survivor.getEnergy() <= 0) || (survivor.getHealth() <= 0)){
            return true;
        }
        else{
            System.out.println(DescriptionHelper.getStatus(survivor));
            return false;
        }
        
    }

    private void getNewLocation(){
        int num = rand.nextInt(14);
        if(num <= 1 && num >= 0){
            location = "Oasis";
        }
        else if(num >= 2 && num <= 3){
            location = "Ruins";
        }    
        else if(num >= 4 && num <= 5){
            location = "River Bank";
        }
        else if(num >= 6 && num <= 11){
            location = "Desert Plains";
        }
        else{
            location = "Desert Hills";
        }
    }

    private void getNewWeather(){
        int num = rand.nextInt(10);
        if(num == 0){
            weather = "Sandstorm";
        }
        else if(num == 1){
            weather = "Raining";
        }    
        else if(num == 2){
            weather = "Cloudy";
        }
        else if(num >= 3 && num <= 5){
            weather = "Warm";
        }
        else{
            if(timeOfDay.equals("Night")){
                weather = "Warm";
            }
            else if(timeOfDay.equals("Morning")){
                weather = "Extremely Hot";
            }
            else if(timeOfDay.equals("Afternoon")){
                weather = "Extremely Hot";
            }
            else{
                weather = "Extremely Hot";
            }
        }
    }

    private void getNewTimeOfDay(){
        
    }

    private String getPursuerDistanceDescription(){
        if (distanceBetweenPursuerAndSurvivor > 100){
            return "The zombies are extremely far away, you have nothing to worry about.";           
        }
        else if(distanceBetweenPursuerAndSurvivor > 50){
            return "The zombies are getting closer but you still have plenty of distance";
        }
        else if(distanceBetweenPursuerAndSurvivor > 20){
            return "The zombies are close, I would get travel soon";
        }
        else{
            return "The zombies are right on your tail, get out of there!";
        }
    }

    private void outputTurnInformation(){
        System.out.println("Location: " + location);
        System.out.println("Time of Day: " + timeOfDay);
        System.out.println("Weather: " + weather);
        System.out.println("Distance Traveled: " + distanceTraveled);
        System.out.println("Pursuer Distance: " + pursuerDistance);
        System.out.println("Survivor Status: " + DescriptionHelper.getStatus(survivor));
        System.out.println("Horse Status: " + DescriptionHelper.getStatus(horse));   
    }   
            

    private void processTurn(){
        int choice = MenuHelper.displayMenu("1. Rest \n2. Search for food \n3. Search for water \n4. Travel carefully \n5. Travel regularly \n6. Ride hard", 1, 6);
        
        if(choice == 1){
            processRest();
        }
        else if(choice == 2){
            processFoodSearch();
        }
        else if(choice == 3){
            processWaterSearch();
        }
        else if(choice == 4){
            processTravelCarefully();
        }
        else if(choice == 5){
            processTravelRegularly();
        }
        else{
            processRideAllOut();
        }
                            
    }

    private void processRest(){
        survivor.adjustEnergy(rand.nextInt(6-2+1)+1);
        horse.adjustEnergy(rand.nextInt(6-2+1)+1);
        
        survivor.adjustThirst(-1);
        horse.adjustThirst(-1);
        
        survivor.adjustHunger(-1);
        horse.adjustHunger(-1);
    }

    private void processFoodSearch(){
        int num = rand.nextInt(10 - 0 + 1)+1;
        if(num >= 5){
            survivor.adjustHunger(rand.nextInt(5-0+1)+1);
            horse.adjustHunger(rand.nextInt(5-0+1)+1);
            
        }
        else{
            survivor.adjustEnergy(-1);
        }
    }

    private void processWaterSearch(){
        int num = rand.nextInt(10 - 0 + 1)+1;
        if(num >= 5){
            survivor.adjustThirst(rand.nextInt(5-0+1)+1);
            horse.adjustThirst(rand.nextInt(5-0+1)+1);
        }
        else{
            survivor.adjustEnergy(-1);
        }
    }

    private void processTravelCarefully(){
        distanceTraveled = rand.nextInt(15-5+1)+1;
        horse.adjustEnergy(-1);
        
        survivor.adjustHunger(-1);
        survivor.adjustThirst(-1);
        
        horse.adjustHunger(-1);
        horse.adjustThirst(-1);
    }

    private void processTravelRegularly(){
        distanceTraveled = rand.nextInt(25-10+1)+1;
        horse.adjustEnergy(-1);
        
        survivor.adjustHunger(-1);
        survivor.adjustThirst(-1);
        
        horse.adjustHunger(-1);
        horse.adjustThirst(-1);
    }

    private void processRideAllOut(){
        distanceTraveled = rand.nextInt(35-15+1)+1;
        horse.adjustEnergy(-2);
        
        survivor.adjustHunger(-1);
        survivor.adjustThirst(-1);
        
        horse.adjustHunger(-1);
        horse.adjustThirst(-1);
    }

    private void processPursuers(){
        int pursuerMovement = rand.nextInt(7-4+1)+1;
        
        if(weather.equals("Sandstorm")){
            pursuerMovement -= 3;
        }
        else if(weather.equals("Raining")){
            pursuerMovement -= 1;
        }
        else if(weather.equals("Cloudy")){
            pursuerMovement += 0;
        }
        else if(weather.equals("Warm")){
            pursuerMovement += 1;
        }
        else{
            pursuerMovement += 0;
        }
        
        if(timeOfDay.equals("Night")){
            pursuerMovement -= 1; 
        }
        
        pursuerDistance += pursuerMovement;
        
        distanceBetweenPursuerAndSurvivor = distanceTraveled - pursuerDistance;
        
    }

    
    
    //Constructor methods
    public void Game(int difficulty, Horse horse, Survivor survivor){
        //should initialize the other instance variables to reasonable values
    }
    
    public void start(){
        //Executes the game logic
    }





}
