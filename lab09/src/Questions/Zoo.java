/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questions;

import ProvidedClasses.Animal;
import ProvidedClasses.Lion;
import java.util.ArrayList;

/**
 *
 * @author August Preuss
 */
public class Zoo extends Animal
{
 
    private ArrayList<Animal> animals;
    
    
    
    public Zoo(){
        animals = new ArrayList<>();
    }
    
    public void addAnimal(Animal animal){
        animals.add(animal);
    }
    
    public String listAnimals(){
        StringBuilder sb = new StringBuilder();
        for(Animal animal : animals){
            sb.append(animal.toString()).append("\n");
        }
        return sb.toString();
    }
    
    
    
    
    
    
    
    
    
    
    
}
