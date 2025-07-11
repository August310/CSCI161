/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questions;

/**
 *
 * @author august.preuss
 */
public class Employee {

    String name;
    int ID;
    double salary;

    public Employee() {
        name = "Joe Schmoe";
        ID = 12345;
        salary = 37000.00;
    }

    public Employee(String name, int ID, double salary) {
        setName(name);
        setID(ID);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String newName) {
        if (newName == null || newName.isEmpty()) {
            name = "No Name Given";
        } else {
            name = newName;
        }
    }

    public void setID(int newID) {
<<<<<<< .mine
        if (newID <= 0) {
||||||| .r2653
        if (newID == 0) {
=======
        if (newID < 0) {
>>>>>>> .r3748
            ID = 0;
        } else if (newID >= 99999) {
            ID = 99999;
        } else if (newID == 0) {
            ID = 0;
        } else {
            ID = newID;
        }
    }

    public void setSalary(double newSalary) {
        if (newSalary <= 20000) {
            salary = 20000;
        } else {
            salary = newSalary;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }

        Employee employee = (Employee) o;
        return name.equals(employee.getName()) && (ID == employee.getID()) && (salary == employee.getSalary());
    }
}
