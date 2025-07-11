/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Questions;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author araderma
 */
public class EmployeeTest {
    

    /**
     * Test of getName method, of class Employee.
     */
    @Test
    public void testDefaultConstructor() 
    {
        Employee testEmployee = new Employee();
        
        assertEquals("Incorrect name for default Employee", "Joe Schmoe", testEmployee.getName());
        assertEquals("Incorrect ID for default Employee", 12345, testEmployee.getID());
        assertEquals("Incorrect name for default Employee", 37000.00, testEmployee.getSalary(), 0.0);
    }

    @Test
    public void testAlternateConstructor_CorrectInputs() 
    {
        Employee testEmployee = new Employee("Jane Doe", 43234, 82000.00);
        
        assertEquals("Incorrect name for Employee", "Jane Doe", testEmployee.getName());
        assertEquals("Incorrect ID for Employee", 43234, testEmployee.getID());
        assertEquals("Incorrect name for Employee", 82000.00, testEmployee.getSalary(), 0.0);
    }
    
    @Test
    public void testAlternateConstructor_NameArgumentIsNull() 
    {
        Employee testEmployee = new Employee(null, 43234, 82000.00);
        
        assertEquals("Incorrect name for Employee", "No Name Given", testEmployee.getName());
    }
    
    @Test
    public void testAlternateConstructor_IDArgumentIsOutOfRange() 
    {
        Employee testEmployee = new Employee("Jane Doe", -43, 82000.00);
        
        assertEquals("Incorrect ID for Employee", 0, testEmployee.getID());
        
        testEmployee = new Employee("Jane Doe", 2345236, 82000.00);
        
        assertEquals("Incorrect ID for Employee", 99999, testEmployee.getID());
    }
    
    @Test
    public void testAlternateConstructor_SalaryArgumentIsOutOfRange() 
    {
        Employee testEmployee = new Employee("Jane Doe", 43234, 12000.00);
        
        assertEquals("Incorrect salary for Employee", 20000.00, testEmployee.getSalary(), 0.0);
    }

    @Test
    public void testSetName_ValidArgument() {
        
        Employee instance = new Employee();
        instance.setName("Susan Smith");
        
        assertEquals("setName method did not properly set the name of an Employee", "Susan Smith", instance.getName());
    }
    
    @Test
    public void testSetName_NullArgument() {
        
        Employee instance = new Employee();
        instance.setName(null);
        
        assertEquals("setName method did not properly set the name of an Employee when passed a null value", "No Name Given", instance.getName());
    }

    @Test
    public void testSetID_ValidArgument() {

        Employee instance = new Employee();
        instance.setID(1234);
       
        assertEquals("setID method did not properly set the ID of an Employee", 1234, instance.getID());
    }
    
    @Test
    public void testSetID_ArgumentTooLow() {

        Employee instance = new Employee();
        instance.setID(-1234);
       
        assertEquals("setID method did not properly set the ID of an Employee for a value that was too low", 0, instance.getID());
    }
    
    @Test
    public void testSetID_ArgumentTooHigh() {

        Employee instance = new Employee();
        instance.setID(34521234);
       
        assertEquals("setID method did not properly set the ID of an Employee for a value that was too high", 99999, instance.getID());
    }

    @Test
    public void testSetSalary_ValidArgument() {
        
        Employee instance = new Employee();
        instance.setSalary(55000.00);
        
        assertEquals("setSalary method did not properly set the salary of an Employee", 55000.00, instance.getSalary(), 0.0);
    }
    
    @Test
    public void testSetSalary_ArgumentTooLow() {
        
        Employee instance = new Employee();
        instance.setSalary(5000.00);
        
        assertEquals("setSalary method did not properly set the salary of an Employee when the argument was too low", 20000.00, instance.getSalary(), 0.0);
    }

}
