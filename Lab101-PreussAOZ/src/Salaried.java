/**
 *
 * @author August Preuss
 * @version 01/25/2025
 * A subclass of Employee.
 * 
 */
public class Salaried extends Employee {
    
    private static int salariedEmployeeCount;
    private String title;
    private int salary;
    
    /**
     * 
     * @param id
     * @param name
     * @param title
     * @param salary 
     */
    public Salaried( int id, String name, String title, int salary )
    {
        super( id, name );
        this.title = title;
        this.salary = salary;
        salariedEmployeeCount++;
    }
    
    /**
     * 
     * @return title
     */
    public String getTitle( ) { return title; }
    
    /**
     * 
     * @param title updates title
     */
    public void setTitle( String title ) { this.title = title; }
    
    /**
     * 
     * @return salary
     */
    public int getSalary( ) { return salary; }
    
    /**
     * 
     * @param salary updates salary
     */
    public void setSalary( int salary ) { this.salary = salary; }
    
    /**
     * 
     * @return number of times salaried constructor is called
     */
    public int getSalariedEmployeeCount(){
        return salariedEmployeeCount;
    }
    
    
    /**
     * 
     * @return contents of instance
     */
    public String toString()
    {
        return super.toString() + ":" + getClass().getName() + "@" + title + ":" + salary;
    }
    
    /**
     * 
     * @param o
     * @return true if equal, false otherwise
     */
    public boolean equals( Object o )
    {
        if ( !( o instanceof Salaried ) )
            return false;
        
        Salaried s = ( Salaried ) o;
        
        return super.equals( s )
                && title.equals( s.title )
                && salary == s.salary;
    }
    
}

