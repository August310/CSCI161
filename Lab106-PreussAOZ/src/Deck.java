/**
 *
 * @author August Preuss
 * @version 3/23/2025
 * A class for a deck of cards
 * 
 */
public class Deck  {
    //Using the ArrayBag class from prior lab
    private ArrayBag<Card> cards = null;
    
    /**
     * Creates a deck object which takes all the ranks and suits to make a deck of 52 Card objects
     */
    public Deck(){
        //ArrayBag is our container of choice here due to easy methods to implement
        cards = new ArrayBag();
        
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] suits = {"Spades", "Clubs", "Hearts", "Diamonds"};
    
        for(String rank : ranks){
            for(String suit : suits){
                cards.add(new Card(rank, suit));
            }
        }
        
    }
    
    /**
     * Checks if the container of cards is empty, then removes and returns a random card from the deck
     * @return, random card from the deck and removes it from that deck so it can't be drawn again
     */
    public Card card(){
        if(cards.isEmpty()){
            throw new IllegalStateException("No cards left to remove");
        }
        return cards.remove();
    }
    /**
     * checks if deck is empty
     * @return true if empty, false if not
     */
    public boolean isEmpty(){
        return cards.isEmpty();
    }
    
}
