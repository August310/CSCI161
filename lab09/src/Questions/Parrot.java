/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questions;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author august.preuss
 */
public class Parrot extends Bird
{
  private ArrayList<String> knownWords;
    
    
    public Parrot(){
        super("Polly", 2010, Color.GREEN);
        knownWords = new ArrayList<>();
        knownWords.add("Polly");
                
    }
    
    public void addWord(String word){
       knownWords.add(word);
                
    }
    
    public String listWordsKnown(){
        StringBuilder sb = new StringBuilder();
        for(String word : knownWords){
            sb.append(word).append("; ");
        }
        return sb.toString();
    }
    
    
    @Override
    public String toString(){
        return super.toString() + ", " + listWordsKnown();
    }
      
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
