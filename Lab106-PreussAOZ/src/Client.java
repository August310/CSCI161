/**
 *
 * @author August Preuss
 * @version 3/19/2025
 * A main method
 * 
 */
public class Client {
    
    /**
     * This main method uses methods from the game class to show the "game"
     * @param args 
     */
    public static void main(String[] args) {
        //instantiate a new game with 4 players and 13 cards per player
        Game game = new Game(4,13);
        //There will be 13 rounds 1 for each card
        for(int round = 1; round <= 13; round++){
            System.out.println("Card " + round);
            System.out.println();
            //each player receives a random card from the deck, no card is the same
            game.getCard();
            //this method shows each players hands in order by suit by the end of each card being distributed
            game.showHands();
        }
        
    }
    
}
