/**
 *
 * @author August Preuss
 * @version 3/23/2025
 * A class for a card object
 * 
 */
public class Card {
    
    private String rank;
    private String suit;
    /**
     * 
     * @param rank, the rank of the card is the number or other value such as Queen
     * @param suit, suit is diamonds, hearts, clubs, or spades
     */
    public Card(String rank, String suit){
        this.rank = rank;
        this.suit = suit;
    }
    /**
     * Simple getter method to get suit value as a String
     * @return the suit of a card
     */
    public String getSuit(){
        return suit;
    }
    /**
     * Simple getter method to get rank value as a String
     * @return the rank of a card
     */
    public String getRank(){
        return rank;
    }
    
}
