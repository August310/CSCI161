package ProvidedClasses;

/**
 *
 * @author araderma
 */
public class Teacher 
{
    private String name; 
    private int    ID; 
    
    /**
     * Default constructor for the Teacher class.
     * Creates a Teacher object with a name "Mrs. Roberts" and an ID 48234
     */
    public Teacher()
    {
        name = "Mrs. Roberts";
        ID   = 48234; 
    }
    
    /**
     * Alternate constructor for the Teacher class. 
     * 
     * @param name The name for the teacher
     * @param ID The ID for the teacher
     */
    public Teacher(String name, int ID)
    {
        this.name = name; 
        this.ID = ID; 
    }
    
    /**
     * Accessor method for the Teacher's name
     * @return The name of the teacher
     */
    public String getName()
    {
        return name; 
    }
    
    /**
     * Accessor method for the Teacher's ID
     * @return The ID of the teacher
     */
    public int getID()
    {
        return ID; 
    }
    
    /**
     * Mutator method for the Teacher's name
     * @param name The new name to use for the Teacher
     */
    public void setName(String name)
    {
        this.name = name; 
    }
    
    /**
     * Mutator method for the Teacher's ID
     * @param ID The new ID to use for the Teacher
     */
    public void setID(int ID)
    {
        this.ID = ID; 
    }
    
    /**
     * Overridden toString method for the Teacher class
     * @return A String representation of this Teacher object
     */
    public String toString()
    {
        return "Teacher: (Name: " + name + ", ID: " + ID + ")"; 
    }
    
    /**
     * Overridden equals method for the Teacher class
     * @param o An Object to test against this Teacher for equality
     * @return Whether or not the this Teacher is equal to the Object o
     */
    public boolean equals(Object o)
    {
        if (o instanceof Teacher)
        {
            Teacher t = (Teacher)o; 
            
            return t.getName().equals(name) && t.getID() == ID; 
        }
        return false; 
    }
}
