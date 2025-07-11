
import java.util.Random;

/**
 *
 * @author August Preuss
 * @version 2/2/2025
 * A main method class meant to make sure the Scores class works
 * 
 */
public class Client {

    
    public static void main(String[] args) {
        
        
        Scores scoresList = new Scores(2);
           
        Random rand = new Random();
        
        for(int i = 0; i < 16; i++){            
            
            int randomNumber = rand.nextInt(21) - 10; //creates values ranging from -10 to 10
            scoresList.add(randomNumber);
        }
        
        System.out.println("Prints out the size and list of scores, " + scoresList.toString());
        
        scoresList.add(3);
        
        System.out.println("Number 3 has been added to end of list, and array doubles in size, " + scoresList.toString());
        
        int removedNumber = scoresList.remove(); //gathers the number thats been removed
        
        System.out.println("Randomly removes a number from the list and returns the value removed, " + removedNumber);
        
        System.out.println("Returns the number at index position 6, " + scoresList.get(6));
        
        System.out.println("Now a random number has been removed from the list, " + removedNumber + ", " + scoresList.toString());
        
        System.out.println("Gets number of times the number at index position 6 appears in the list, " + scoresList.getFrequencyOf(scoresList.get(6)));
        
        int indexSixNumber = scoresList.get(6); //gets number at index 6
        
        scoresList.remove(indexSixNumber); //removes the 1st occurance of number at index 6
        
        System.out.println("Print out frequency of number after removing first occurance of it found in index position 6, " + scoresList.getFrequencyOf(indexSixNumber));
        
        System.out.println("Final result of the scores list, " + scoresList.toString());
        
        System.out.println("This checks if the list contains -5, " + scoresList.contains(-5));
        
        
        //new Scores object to test our equals method
        Scores scoresList2 = new Scores(2);
        
        for(int i = 0; i < 16; i++){            
            
            int randomNumber = rand.nextInt(21) - 10; //creates values ranging from -10 to 10
            scoresList2.add(randomNumber);
        }
        
        System.out.println("This is a new list to test if our equals method works, " + scoresList2.toString());
        
        //Tests for true
        System.out.println("This tests for equality, " + scoresList.equals(scoresList));
        
        //Tests for false
        System.out.println("This tests for inequality, " + scoresList.equals(scoresList2));
    }
    
}
