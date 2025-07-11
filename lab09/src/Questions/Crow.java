/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questions;

import ProvidedClasses.Tool;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author August Preuss
 */
public class Crow extends Bird 
{
    
private ArrayList<Tool> toolTypes;

    public Crow(){
        super("Jacob", 2008, Color.BLACK);
        toolTypes = new ArrayList<>();
        toolTypes.add(Tool.CHAINSAW);
    }

    public void addTool(Tool tool){
        toolTypes.add(tool);
    }

    public ArrayList<Tool> getToolsUsed(){
            return new ArrayList<>(toolTypes);
    }

@Override
public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", ");
        
        for(Tool tool : toolTypes){
            sb.append(tool.toString());
        }
        return sb.toString();
    }









}
