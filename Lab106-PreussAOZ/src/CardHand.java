
import java.util.NoSuchElementException;


/**
 *
 * @author August Preuss
 * @version 3/24/2025
 * The cardhand class
 * 
 */
public class CardHand   {
    
//new LinkedPositionalList variable
    private LinkedPositionalList<Card> cardHand = null;
    
    //creates a Position for each suit value, this keeps our suits organized
    private Position<Card> hearts;
    private Position<Card> diamonds;
    private Position<Card> spades;
    private Position<Card> clubs;
    
    /**
     * Constructor that makes a new LinkedPositional list
     * Establishes each "finger" of lists to keep everything organized by suit
     */
    public CardHand(){
        cardHand = new LinkedPositionalList<>();
        
        hearts = null;
        diamonds = null;
        spades = null;
        clubs = null;
    }
    /**
     * Gets the LinkedPositionalList so we can use it in other classes as needed
     * Allows us to use methods associated with LinkedPositionalList
     * @return cardHand variable, this is our list
     */
    public LinkedPositionalList<Card> getCardHand(){
        return cardHand;
    }
    
    /**
     * adds a card into the correct Position depending on the suit
     * @param rank, rank of the card
     * @param suit, suit of the card, This is important since it organizes our list
     */
    public void addCard(String rank, String suit){
        Card newCard = new Card(rank, suit);
        Position<Card> insertPos = null;
        
        //each if statements follow these similar steps
        //in this case we look for hearts as a suit
        if(suit.equalsIgnoreCase("hearts")){
            //this is set to hearts so we are inserting the new card into this area of the list
            insertPos = hearts;
            //if Position is null then we add card last to the hand, otherwise add it after the last hearts card
            hearts = (hearts == null) ? cardHand.addLast(newCard) : cardHand.addAfter(hearts, newCard);
        }
        else if(suit.equalsIgnoreCase("diamonds")){
            insertPos = diamonds;
            diamonds = (diamonds == null) ? cardHand.addLast(newCard) : cardHand.addAfter(diamonds, newCard);
            
        }
        else if(suit.equalsIgnoreCase("spades")){
            insertPos = spades;
            spades = (spades == null) ? cardHand.addLast(newCard) : cardHand.addAfter(spades, newCard);
            
        }
        else if(suit.equalsIgnoreCase("clubs")){
            insertPos = clubs;
            clubs = (clubs ==  null) ? cardHand.addLast(newCard) : cardHand.addAfter(clubs, newCard);
            
        }
        //simply checks if a valid suit is provided from the Card object
        else{
            throw new IllegalStateException("Invalid suit");
        }
        
        
        
    }
    
    /**
     * Allows us to use this iterate over the cards
     * @return the LinkedPositionalList creates an iterator and returns it
     */
    public Iterator<Card> iterator(){
        return cardHand.iterator();
    }
    /**
     * Lets us iterate through an entire suit
     * @param suit, the suit of the card 
     * @return this creates an iterator that goes off of the suit given to it
     */
    public Iterator<Card> suitIterator(String suit){
        return new SuitIterator(suit);
    }

    /**
     * A nested class that makes a suit Iterator object and has respective Iterator methods
     */        
    private class SuitIterator implements Iterator<Card>{
        private Position<Card> cursor = cardHand.first();
        private Position<Card> recent = null;
        private final String suit;
        
        /**
         * Creates a SuitIterator object
         * @param suit, suit of the card
         */
        public SuitIterator(String suit){
            cursor = cardHand.first();
            this.suit = suit.toLowerCase();
            
            while(cursor != null && !cursor.getElement().getSuit().equalsIgnoreCase(suit)){
                cursor = cardHand.after(cursor);
            }
        }
        
        /**
         * checks if theres a value next in line
         * @return true if there is another value, false if otherwise
         */
        @Override
        public boolean hasNext(){
            return cursor != null;
        }
        
        /**
         * Gets the next card from the given suit list and returns it
         * @return the given Card that is found next in the list
         * @throws NoSuchElementException, uses this when there isn't anything left
         */
        @Override
        public Card next() throws NoSuchElementException {
            if(cursor == null) throw new NoSuchElementException("Nothing left");
            
            Card result = cursor.getElement();
            
            cursor = cardHand.after(cursor);
            while(cursor != null && !cursor.getElement().getSuit().equalsIgnoreCase(suit)){
                cursor = cardHand.after(cursor);
            }
            return result;
        }
        /**
         * removes a given card from the list
         * @throws IllegalStateException, uses this when there is nothing we can remove
         */
        @Override
        public void remove() throws IllegalStateException{
            if(recent == null) throw new IllegalStateException("Nothing to remove");
            Position<Card> nextCursor = cardHand.after(recent);
            cardHand.remove(recent);
            cursor = nextCursor;
            recent = null;
        }
    }
}


