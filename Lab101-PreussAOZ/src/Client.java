/**
 *
 * @author August Press
 * @version 1/25/2025
 * A main method for the employee class and its respective subclasses
 * 
 */
public class Client {

    public static void main(String[] args) {
        
        //Creates a list of employees that is a length of 10
        Employee[] employeeList = new Employee[10];
        
        
        
        //Creates Salaried and Hourly objects using their given constructors
        Salaried salaried1 =  new Salaried(45, "Al", "Manager", 60000 );
        
        Hourly hourly1 =      new Hourly(23, "Kelly", "Hostess", 25.75);
        
        Salaried salaried2 =  new Salaried(66, "Peggy", "CEO", 120000);
        
        Hourly hourly2 =      new Hourly(98, "Bud", "Busboy", 15.00);
        
        Hourly hourly3 =      new Hourly(21, "Marcy", "Server", 10.00);
        
        Hourly hourly4 =      new Hourly(53, "Jefferson", "Cook", 35.00);
        
        
        //Adds the prior created objects into the employee list array
        employeeList[0] = salaried1;
        
        employeeList[1] = hourly1;
        
        employeeList[2] = salaried2;
        
        employeeList[3] = hourly2;
        
        employeeList[4] = hourly3;
        
        employeeList[5] = hourly4;
        
        //Prints out the entire list using toString method
        //List is checked to make sure it's not null otherwise it will be printed null for the given line
        for(int i = 0; i < employeeList.length; i++){
            
           if(employeeList[i] == null){
                System.out.println("null");
            }
            else{
            System.out.println(employeeList[i].toString());
           }
           
        }
        
        //Checks if given position in array is either salaried, hourly or neither
        //If salaried or hourly, the arraylist position is typecasted to the specific class
        //Then the salary of hourly rate is multiplied by 1.33 to increase by 33%
        //if null then print nothing
        for(int i = 0; i < employeeList.length; i++){
            
            if(employeeList[i] instanceof Salaried){
                Salaried salariedEmployee = (Salaried) employeeList[i];
                int salary = salariedEmployee.getSalary();
                salariedEmployee.setSalary( (int) (salary * 1.33));
                System.out.println(salariedEmployee);
            }
            
            else if(employeeList[i] instanceof Hourly){
                Hourly hourlyEmployee = (Hourly) employeeList[i];
                double hourlyRate = hourlyEmployee.getHourlyRate();
                hourlyEmployee.setHourlyRate(hourlyRate * 1.33);
                System.out.println(hourlyEmployee);
            }
            
            else{
                System.out.print("");
            }
            
        }
        
        //Lines 78 - 90 create hourly and salaried objects to test if the equals method functions properly
        System.out.println("Testing the equals method when hourly objects are the same vs different");
        Hourly hourlyTest1 = new Hourly(25, "John", "Barista", 50.25);
        Hourly hourlyTest2 = new Hourly(25, "John", "Barista", 50.25);
        Hourly hourlyTest3 = new Hourly(22, "Josh", "Clown", 2.20);
        System.out.println(hourlyTest1.equals(hourlyTest2));
        System.out.println(hourlyTest1.equals(hourlyTest3));
        
        System.out.println("Testing the equals method when salaried objects are the same vs different");
        Salaried salariedTest1 = new Salaried(60, "Kate", "Officer", 60000);
        Salaried salariedTest2 = new Salaried(60, "Kate", "Officer", 60000);
        Salaried salariedTest3 = new Salaried(55, "Jacob", "Artist", 200);
        System.out.println(salariedTest1.equals(salariedTest2));
        System.out.println(salariedTest1.equals(salariedTest3));
    }
    
}
