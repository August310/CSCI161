/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ExtraCredit;

import ExtraCredit.ExtraCredit1;
import java.util.Random;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author araderma
 */
public class ExtraCredit1Test {
    
    public ExtraCredit1Test() 
    {
        
    }

    @Test
    public void testQuestion3Output() {
        System.out.println("\nQuestion 3 Output:");
        String[] counties = {"Richland", "Park", "Dale"};
        String[] products = {"Alcohol", "Tobacco", "Soda Pop", "Potato Chips", "Food", "Clothing", "Shoes", "Books"};
        String[] paymentMethods = {"Cash", "Credit", "Check"};
        
        Random rand = new Random(); 

        for (int i = 0; i < 10; i++)
        {
            String county        = counties[rand.nextInt(counties.length)];
            String product       = products[rand.nextInt(products.length)];
            String paymentMethod = paymentMethods[rand.nextInt(paymentMethods.length)];

            double result = ExtraCredit1.question3(county, product, paymentMethod);

            System.out.println("Buying " + product + " in " + county + " with a " + paymentMethod + " payment has a tax rate of " + result + "%.");
        }
    }
    
    @Test
    public void testQuestion3_Dale_Tobacco_Check_IsCorrect()
    {
        assertEquals(4.5, ExtraCredit1.question3("Dale", "Tobacco", "Check"), 0.0);
    }
    
    @Test
    public void testQuestion3_Dale_Tobacco_Cash_IsCorrect()
    {
        assertEquals(8.5, ExtraCredit1.question3("Dale", "Tobacco", "Cash"), 0.0);
    }
    
    @Test
    public void testQuestion3_Dale_Tobacco_Credit_IsCorrect()
    {
        assertEquals(3.5, ExtraCredit1.question3("Dale", "Tobacco", "Credit"), 0.0);
    }
    
    @Test
    public void testQuestion3_Dale_Alcohol_Check_IsCorrect()
    {
        assertEquals(4.5, ExtraCredit1.question3("Dale", "Alcohol", "Check"), 0.0);
    }
    
    @Test
    public void testQuestion3_Dale_Alcohol_Cash_IsCorrect()
    {
        assertEquals(8.5, ExtraCredit1.question3("Dale", "Alcohol", "Cash"), 0.0);
    }
    
    @Test
    public void testQuestion3_Dale_Alcohol_Credit_IsCorrect()
    {
        assertEquals(3.5, ExtraCredit1.question3("Dale", "Alcohol", "Credit"), 0.0);
    }
    
    @Test
    public void testQuestion3_Dale_Food_Cash_IsCorrect()
    {
        assertEquals(1.5, ExtraCredit1.question3("Dale", "Food", "Cash"), 0.0);
    }
    
    @Test
    public void testQuestion3_Dale_Food_Check_IsCorrect()
    {
        assertEquals(2.5, ExtraCredit1.question3("Dale", "Food", "Check"), 0.0);
    }
    
    @Test
    public void testQuestion3_Dale_PotatoChips_Cash_IsCorrect()
    {
        assertEquals(3.0, ExtraCredit1.question3("Dale", "Potato Chips", "Cash"), 0.0);
    }
    
    @Test
    public void testQuestion3_Dale_SodaPop_Check_IsCorrect()
    {
        assertEquals(4.0, ExtraCredit1.question3("Dale", "Soda Pop", "Check"), 0.0);
    }
    
    @Test
    public void testQuestion3_Richland_SodaPop_Cash_IsCorrect()
    {
        assertEquals(3.0, ExtraCredit1.question3("Richland", "Soda Pop", "Cash"), 0.0);
    }
    
    @Test
    public void testQuestion3_Richland_Clothing_Cash_IsCorrect()
    {
        assertEquals(4.0, ExtraCredit1.question3("Richland", "Clothing", "Cash"), 0.0);
    }
    
    @Test
    public void testQuestion3_Richland_Clothing_Check_IsCorrect()
    {
        assertEquals(4.5, ExtraCredit1.question3("Richland", "Clothing", "Check"), 0.0);
    }
    
    @Test
    public void testQuestion3_Richland_Clothing_Credit_IsCorrect()
    {
        assertEquals(5.0, ExtraCredit1.question3("Richland", "Clothing", "Credit"), 0.0);
    }
    
    @Test
    public void testQuestion3_Richland_Shoes_Cash_IsCorrect()
    {
        assertEquals(5.0, ExtraCredit1.question3("Richland", "Shoes", "Cash"), 0.0);
    }
    
    @Test
    public void testQuestion3_Richland_Shoes_Check_IsCorrect()
    {
        assertEquals(5.5, ExtraCredit1.question3("Richland", "Shoes", "Check"), 0.0);
    }
    
    @Test
    public void testQuestion3_Richland_Shoes_Credit_IsCorrect()
    {
        assertEquals(6.0, ExtraCredit1.question3("Richland", "Shoes", "Credit"), 0.0);
    }
    
    @Test
    public void testQuestion3_Richland_Food_Credit_IsCorrect()
    {
        assertEquals(4.0, ExtraCredit1.question3("Richland", "Food", "Credit"), 0.0);
    }
    
    @Test
    public void testQuestion3_Richland_Tobacco_Check_IsCorrect()
    {
        assertEquals(3.5, ExtraCredit1.question3("Richland", "Tobacco", "Check"), 0.0);
    }
    
    @Test
    public void testQuestion3_Richland_Books_Check_IsCorrect()
    {
        assertEquals(1.0, ExtraCredit1.question3("Richland", "Books", "Check"), 0.0);
    }
    
    @Test
    public void testQuestion3_Richland_Books_Cash_IsCorrect()
    {
        assertEquals(1.0, ExtraCredit1.question3("Richland", "Books", "Cash"), 0.0);
    }
    
    @Test
    public void testQuestion3_Richland_Books_Credit_IsCorrect()
    {
        assertEquals(1.0, ExtraCredit1.question3("Richland", "Books", "Credit"), 0.0);
    }
    
    @Test
    public void testQuestion3_Park_Books_Credit_IsCorrect()
    {
        assertEquals(2.0, ExtraCredit1.question3("Park", "Books", "Credit"), 0.0);
    }
    
    @Test
    public void testQuestion3_Park_SodaPop_Check_IsCorrect()
    {
        assertEquals(3.0, ExtraCredit1.question3("Park", "Soda Pop", "Check"), 0.0);
    }
    
    @Test
    public void testQuestion3_Park_Clothing_Check_IsCorrect()
    {
        assertEquals(0.0, ExtraCredit1.question3("Park", "Clothing", "Check"), 0.0);
    }
    
    @Test
    public void testQuestion3_Park_Clothing_Cash_IsCorrect()
    {
        assertEquals(0.0, ExtraCredit1.question3("Park", "Clothing", "Cash"), 0.0);
    }
    
    @Test
    public void testQuestion3_Park_Clothing_Credit_IsCorrect()
    {
        assertEquals(0.0, ExtraCredit1.question3("Park", "Clothing", "Credit"), 0.0);
    }
    
    @Test
    public void testQuestion3_Park_Shoes_Check_IsCorrect()
    {
        assertEquals(0.0, ExtraCredit1.question3("Park", "Shoes", "Check"), 0.0);
    }
    
    @Test
    public void testQuestion3_Park_Shoes_Cash_IsCorrect()
    {
        assertEquals(0.0, ExtraCredit1.question3("Park", "Shoes", "Cash"), 0.0);
    }
    
    @Test
    public void testQuestion3_Park_Shoes_Credit_IsCorrect()
    {
        assertEquals(0.0, ExtraCredit1.question3("Park", "Shoes", "Credit"), 0.0);
    }
    
    @Test
    public void testQuestion3_Park_Alcohol_Credit_IsCorrect()
    {
        assertEquals(5.0, ExtraCredit1.question3("Park", "Alcohol", "Credit"), 0.0);
    }
    
    @Test
    public void testQuestion3_Park_Alcohol_Check_IsCorrect()
    {
        assertEquals(5.0, ExtraCredit1.question3("Park", "Alcohol", "Check"), 0.0);
    }
    
    @Test
    public void testQuestion3_Park_Tobacco_Check_IsCorrect()
    {
        assertEquals(3.0, ExtraCredit1.question3("Park", "Tobacco", "Check"), 0.0);
    }
    
    @Test
    public void testQuestion3_Park_Tobacco_Cash_IsCorrect()
    {
        assertEquals(2.0, ExtraCredit1.question3("Park", "Tobacco", "Cash"), 0.0);
    }
    
    @Test
    public void testQuestion3_invalidCounty_IsCorrect()
    {
        assertEquals(Double.NaN, ExtraCredit1.question3("Adams", "Food", "Cash"), 0.0);
    }
    
    
   
    
}