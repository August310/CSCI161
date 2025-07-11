/**
 *
 * @author August Preuss
 * @version 3/23/2025
 * A class for the game
 * 
 */
public class Game {
    private Deck deck;
    private CardHand[] players;
    private int numPlayers;
    private int maxCardsPerPlayer;
    
    /**
     * creates a game object that involves making a deck, and players that use a CardHand object
     * @param numPlayers, number of players we want playing the game
     * @param maxCardsPerPlayer, maximum cards each player gets
     */
    public Game(int numPlayers, int maxCardsPerPlayer){
        this.numPlayers = numPlayers;
        this.maxCardsPerPlayer = maxCardsPerPlayer;
        this.deck = new Deck();
        this.players = new CardHand[numPlayers];
        
        //each player gets a new CardHand object, AKA their own LinkedPositionalList
        for(int i = 0; i < numPlayers; i++){
            players[i] = new CardHand();
        }
    }
    /**
     * Uses card method from the Deck class which gives each player a random card to add to their own respective hand
     */
    public void getCard(){
        for(int i = 0; i < numPlayers; i++){
            //checks if deck is empty
            if(deck.isEmpty()){
                System.out.println("No more cards left in deck");
                return;
            }
            //Random card is taken from deck
            Card dealtCard = deck.card();
            //the random card is added to the respective players hand
            players[i].addCard(dealtCard.getRank(), dealtCard.getSuit());
        }
    }
    
    /**
     * Saves space in the client class by printing out each player and the cards that they have in their hands
     */
    public void showHands(){
        for(int i = 0; i < numPlayers; i++){
            System.out.println("Player " + (i + 1) + ":");
            
            //We get the cardhand of each player so we can use the LinkedPositionalList methods
            LinkedPositionalList<Card> hand = players[i].getCardHand();
            //Takes first card from the players hand
            Position<Card> current = hand.first();
            
            //moves through the players hnd and prints out each card until we hit no more cards left
            while(current != null){
                Card card = current.getElement();
                System.out.print(card.getRank() + " of " + card.getSuit() + ", ");
                current = hand.after(current);
            }
            System.out.println();
        }
        System.out.println();
    }
    
}
