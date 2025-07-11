/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questions;

import java.text.NumberFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author August Preuss
 */
public class MyProgram {
   
public static void main (String [] args)    
{
    String budget     = JOptionPane.showInputDialog("Please enter the amount of money you have for your monthly budget.");
    String rent       = JOptionPane.showInputDialog("Please enter the amount of money you will spend on rent this month.");
    String groceries  = JOptionPane.showInputDialog("Please enter the amount of money you will spend on groceries this month.");
    String various    = JOptionPane.showInputDialog("Please enter the amount of money you will spend on other expenses this month.");
    
    double budgetValue    = Double.parseDouble(budget);
    double rentValue      = Double.parseDouble(rent);
    double groceriesValue = Double.parseDouble(groceries);
    double variousValue   = Double.parseDouble(various);
    
    NumberFormat USCurrency   = NumberFormat.getCurrencyInstance();
    NumberFormat USPercentage = NumberFormat.getPercentInstance();
    
    JOptionPane.showMessageDialog(null, "The rent for this month is " + USCurrency.format(rentValue) + " which is " + USPercentage.format(rentValue / budgetValue) + " of the budget.");
    JOptionPane.showMessageDialog(null, "The groceries for this month are " + USCurrency.format(groceriesValue) + " which is " + USPercentage.format(groceriesValue / budgetValue) + " of the budget." );
    JOptionPane.showMessageDialog(null, "Other expenses for this month are " + USCurrency.format(variousValue) + " which is " + USPercentage.format(variousValue / budgetValue) + " of the budget.");
    
}
}