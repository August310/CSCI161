/**
 *
 * @author August Preuss
 * @version 2/8/2025
 * Class for a player
 * 
 */
public class Player {
    
    private String name;
    private String positionPlayed;
    private int jerseyNumber;
    
    /**
     * Creates a player object
     * @param name, String for player name
     * @param positionPlayed, String for position played
     * @param jerseyNumber, int for jersey number
     */
    public Player(String name, String positionPlayed, int jerseyNumber){
        this.name = name;
        this.positionPlayed = positionPlayed;
        this.jerseyNumber = jerseyNumber;
    }
    
    /**
     * gets name of player
     * @return String of players name
     */
    public String getName(){
        return name;
    }
    
    /**
     * gets players position played
     * @return String of position played
     */
    public String getPositionPlayed(){
        return positionPlayed;
    }
    
    /**
     * gets jersey number from player
     * @return int of jersey number
     */
    public int getJerseyNumber(){
        return jerseyNumber;
    }
    
    /**
     * sets name to something new
     * @param name, the new name you want for player
     */
    public void setName(String name){
        this.name = name;
    }
    
    /**
     * sets position played to something new
     * @param positionPlayed, the new position you want for player 
     */
    public void setPositionPlayed(String positionPlayed){
        this.positionPlayed = positionPlayed;
    }
    
    /**
     * sets jersey number to something new
     * @param jerseyNumber, the new jersey number you want for player
     */
    public void setJerseyNumber(int jerseyNumber){
        this.jerseyNumber = jerseyNumber;
    }
    
    /**
     * The classes respective toString method
     * @return String of the classname, players name, players position, and players jersey number 
     */
    public String toString(){
        return getClass().getName() + "@" + getName() + ":" + getPositionPlayed() + ":" + getJerseyNumber();
    }
    
    /**
     * The classes respective equals method
     * @param o
     * @return true if name, position, and jerseynumber, are all the same, false if otherwise
     */
    public boolean equals(Object o){
        if( !(o instanceof Player))
            return false;
        Player p = (Player) o;
        
        return name.equals(p.name)
                && positionPlayed.equals(p.positionPlayed)
                && jerseyNumber == p.jerseyNumber;
    }
    
    
    
    
    
    
    
    
}
