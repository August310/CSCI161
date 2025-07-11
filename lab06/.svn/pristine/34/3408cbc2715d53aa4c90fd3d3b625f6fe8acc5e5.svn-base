/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab06;

import MyUnitTests.DiscountMethodTest;
import ProvidedClasses.Restaurant;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.*; 
import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

/**
 *
 * @author araderma
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DiscountMethodTestTest {
   
    private static int modesWorking = 0; 
    
    @Test
    public void testForWorksCorrectlyMode()
    {
        DiscountMethodTest.testRestaurant = new Restaurant(Restaurant.Mode.WORKS_CORRECTLY);
        
        Result results = JUnitCore.runClasses(MyUnitTests.DiscountMethodTest.class);
        
        System.out.println(" Ran " + results.getRunCount() + " tests with " + results.getFailureCount() + " methods failing.");
        
        if(results.getFailureCount() > 0)
        {
            fail("You should not have any failed test cases for WORKS_CORRECTLY mode");
        }
        assertEquals("Icorrect number of moded working",9,modesWorking);
    }
    @Test
    public void testForAlwaysTrueMode()
    {
        DiscountMethodTest.testRestaurant = new Restaurant(Restaurant.Mode.ALWAYS_TRUE);
        
        Result results = JUnitCore.runClasses(MyUnitTests.DiscountMethodTest.class);
        
        System.out.println(" Ran " + results.getRunCount() + " tests with " + results.getFailureCount() + " methods failing.");
        
        if(results.getFailureCount() == 0 || results.getFailureCount() == results.getRunCount())
        {
            fail("You do not have a test that descriminates for ALWAYS_TRUE mode");
        } 
        modesWorking++; 
    }
    @Test
    public void testForAlwaysFalseMode()
    {
        DiscountMethodTest.testRestaurant = new Restaurant(Restaurant.Mode.ALWAYS_TRUE);
        
        Result results = JUnitCore.runClasses(MyUnitTests.DiscountMethodTest.class);
        
        System.out.println(" Ran " + results.getRunCount() + " tests with " + results.getFailureCount() + " methods failing.");
        
        if(results.getFailureCount() == 0 || results.getFailureCount() == results.getRunCount())
        {
            fail("You do not have a test that descriminates for ALWAYS_FALSE mode");
        } 
        modesWorking++;
    }
    @Test
    public void testForAgeBoundaryTooLooseMode()
    {
        DiscountMethodTest.testRestaurant = new Restaurant(Restaurant.Mode.AGE_BOUNDARY_TOO_LOOSE);
        
        Result results = JUnitCore.runClasses(MyUnitTests.DiscountMethodTest.class);
        
        System.out.println(" Ran " + results.getRunCount() + " tests with " + results.getFailureCount() + " methods failing.");
        
        if(results.getFailureCount() == 0)
        {
            fail("You do not have a test that descriminates for AGE_BOUNDARY_TOO_LOOSE mode");
        } 
        modesWorking++;
    }
    @Test
    public void testForAgeBoundaryTooTightMode()
    {
        DiscountMethodTest.testRestaurant = new Restaurant(Restaurant.Mode.AGE_BOUNDARY_TOO_TIGHT);
        
        Result results = JUnitCore.runClasses(MyUnitTests.DiscountMethodTest.class);
        
        System.out.println(" Ran " + results.getRunCount() + " tests with " + results.getFailureCount() + " methods failing.");
        
        if(results.getFailureCount() == 0)
        {
            fail("You do not have a test that descriminates for AGE_BOUNDARY_TOO_TIGHT mode");
        } 
        modesWorking++;
    }
    @Test
    public void testForAllowsIllegalAgesMode()
    {
        DiscountMethodTest.testRestaurant = new Restaurant(Restaurant.Mode.ALLOWS_ILLEGAL_AGES);
        
        Result results = JUnitCore.runClasses(MyUnitTests.DiscountMethodTest.class);
        
        System.out.println(" Ran " + results.getRunCount() + " tests with " + results.getFailureCount() + " methods failing.");
        
        if(results.getFailureCount() == 0)
        {
            fail("You do not have a test that descriminates for ALLOWS_ILLEGAL_AGES mode");
        } 
        modesWorking++;
    }
    @Test
    public void testForMilitaryAgeBoundaryTooLooseMode()
    {
        DiscountMethodTest.testRestaurant = new Restaurant(Restaurant.Mode.MILITARY_AGE_BOUNDARY_TOO_LOOSE);
        
        Result results = JUnitCore.runClasses(MyUnitTests.DiscountMethodTest.class);
        
        System.out.println(" Ran " + results.getRunCount() + " tests with " + results.getFailureCount() + " methods failing.");
        
        if(results.getFailureCount() == 0)
        {
            fail("You do not have a test that descriminates for MILITARY_AGE_BOUNDARY_TOO_LOOSE mode");
        } 
        modesWorking++;
    }
    @Test
    public void testForMilitaryAgeBoundaryTooTightMode()
    {
        DiscountMethodTest.testRestaurant = new Restaurant(Restaurant.Mode.MILITARY_AGE_BOUNDARY_TOO_TIGHT);
        
        Result results = JUnitCore.runClasses(MyUnitTests.DiscountMethodTest.class);
        
        System.out.println(" Ran " + results.getRunCount() + " tests with " + results.getFailureCount() + " methods failing.");
        
        if(results.getFailureCount() == 0)
        {
            fail("You do not have a test that descriminates for MILITARY_AGE_BOUNDARY_TOO_TIGHT mode");
        } 
        modesWorking++;
    }
    @Test
    public void testForNoMilitaryAgeRestrictionMode()
    {
        DiscountMethodTest.testRestaurant = new Restaurant(Restaurant.Mode.NO_MILITARY_AGE_RESTRICTION);
        
        Result results = JUnitCore.runClasses(MyUnitTests.DiscountMethodTest.class);
        
        System.out.println(" Ran " + results.getRunCount() + " tests with " + results.getFailureCount() + " methods failing.");
        
        if(results.getFailureCount() == 0)
        {
            fail("You do not have a test that descriminates for NO_MILITARY_AGE_RESTRICTION mode");
        } 
        modesWorking++;
    }
    @Test
    public void testForRequiresMilitaryServiceMode()
    {
        DiscountMethodTest.testRestaurant = new Restaurant(Restaurant.Mode.REQUIRES_MILITARY_SERVICE);
        
        Result results = JUnitCore.runClasses(MyUnitTests.DiscountMethodTest.class);
        
        System.out.println(" Ran " + results.getRunCount() + " tests with " + results.getFailureCount() + " methods failing.");
        
        if(results.getFailureCount() == 0)
        {
            fail("You do not have a test that descriminates for REQUIRES_MILITARY_SERVICE mode");
        } 
        modesWorking++;
    }
    
}
