/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questions;

/**
 *
 * @author August Preuss
 */
public class ScrabbleScore {

    public static int calculateScore(String word) {

        if (word == null) {
            return -1;
        }

        word = word.toLowerCase();

        int score = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if (c == ' ') {
                score += 0;
            } 
            else if (c == 'e' || c == 'a' || c == 'i' || c == 'o' || c == 'n' || c == 'r' || c == 't' || c == 'l' || c == 's' || c == 'u') {
                score += 1;
            } 
            else if (c == 'd' || c == 'g') {
                score += 2;
            } 
            else if (c == 'b' || c == 'c' || c == 'm' || c == 'p') {
                score += 3;
            } 
            else if (c == 'f' || c == 'h' || c == 'v' || c == 'w' || c == 'y') {
                score += 4;
            } 
            else if (c == 'k') {
                score += 5;
            } 
            else if (c == 'j' || c == 'x') {
                score += 8;
            } 
            else if (c == 'q' || c == 'z') {
                score += 10;
            } 
            else {
                return -1;
            }
        }

        return score;

    }

}
