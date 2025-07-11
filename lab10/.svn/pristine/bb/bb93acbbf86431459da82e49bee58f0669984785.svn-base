/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ProvidedClasses;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author araderma
 */
public class Student implements Serializable
{
    private String   name;
    private int      ID; 
    private double   GPA; 
    private String[] courses;
    
    public Student(String name, int ID, double GPA, String[] courses)
    {
        this.name       = name; 
        this.ID         = ID; 
        this.GPA        = GPA; 
        this.courses    = courses; 
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getID()
    {
        return ID;
    }
    
    public double getGPA()
    {
        return GPA;
    }
    
    public String[] getCourses()
    {
        return Arrays.copyOf(courses, courses.length);
    }
    
    public String toString()
    {
        ArrayList<String> courseList = new ArrayList(Arrays.asList(courses));
        
        return "Name: " + name + " ID: " + ID + " GPA: " + GPA + " Courses: " + courseList;
    }
    
    public boolean equals (Object o)
    {
        if(!(o instanceof Student))
        {
            return false;
        }
        else
        {
            Student s = (Student) o; 
            
            ArrayList<String> thisStudentCourses = new ArrayList(Arrays.asList(courses));
            ArrayList<String> otherStudentCourses = new ArrayList(Arrays.asList(s.getCourses()));
            
            return (name.equals(s.getName()) && ID == s.getID() && GPA == s.getGPA() && thisStudentCourses.equals(otherStudentCourses));
        }
    }
    
}
