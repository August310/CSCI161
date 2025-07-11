/**
 *
 * @author August Preuss
 * @version 1/25/2025
 * A subclass of Employee
 * 
 */
public class Hourly extends Employee {
    
    private static int hourlyEmployeeCount;
    private String position;
    private double hourlyRate;
    
    /**
     * 
     * @param id
     * @param name
     * @param position
     * @param hourlyRate 
     */
    
    public Hourly(int id, String name, String position, double hourlyRate){
        super(id, name);
        this.position = position;
        this.hourlyRate = hourlyRate;
        hourlyEmployeeCount++;
    }
    
    /**
     * 
     * @return position
     */
    
    public String getPosition(){
        return position;
    }
    
    /**
     * 
     * @param position updates position
     */
    
    public void setPosition(String position){
        this.position = position;
    }
    
    /**
     * 
     * @return hourlyRate
     */
    
    public double getHourlyRate(){
        return hourlyRate;
    }
    
    /**
     * 
     * @param hourlyRate updates hourlyRate
     */
    
    public void setHourlyRate(double hourlyRate){
        this.hourlyRate = hourlyRate;                
    }
    
    /**
     * 
     * @return number of times hourly constructor is called
     */
    
    public int getHourlyEmployeeCount(){
        return hourlyEmployeeCount;
    }
    
    /**
     * 
     * @return contents of instance
     */
    
    public String toString(){
        return super.toString() + ":" + getClass().getName() + "@" + position + ":" + hourlyRate;
    }
    
    /**
     * 
     * @param o
     * @return true if equal, false if otherwise
     */
    
    public boolean equals( Object o ){
        if( !( o instanceof Hourly ) )
            return false;
        
        Hourly h = ( Hourly ) o;
        
        return super.equals(h)
                && position.equals(h.position)
                && hourlyRate == h.hourlyRate;
    }
    
    
}
