/**
 *
 * @author August Preuss
 * @version 2/9/2025
 * Main method to test ArrayBag, LinkedBag, and Player Classes
 * 
 */
public class Client {

    
    public static void main(String[] args) {
        
        //creating new ArrayBag object of capacity 2
        ArrayBag mensTeam = new ArrayBag(2);
        
        //creating Player objects 
        Player mens1 = new Player("Scott", "PointGuard", 35);
        
        Player mens2 = new Player("Johnny", "PowerForward", 66);
        
        Player mens3 = new Player("Jim", "ShootingGuard", 11);
        
        Player mens4 = new Player("Tyrell", "Center", 41);
        
        Player mens5 = new Player("Joshua", "SmallForward", 9);
            
        Player mens6 = new Player("Tim", "Center", 4);
        
        Player mens7 = new Player("Terry", "PointGuard", 23);
        
        Player mens8 = new Player("Luka", "SmallForward", 21);
        
        //adding player objects to the list
        mensTeam.add(mens1);
        
        mensTeam.add(mens2);
        
        mensTeam.add(mens3);
        
        mensTeam.add(mens4);
        
        mensTeam.add(mens5);
        
        mensTeam.add(mens6);
        
        mensTeam.add(mens7);
        
        mensTeam.add(mens8);
        
        //print out all the Players we added
        System.out.println(mensTeam);
        
        //removes random Player from list
        mensTeam.remove();
        
        //prints new list
        System.out.println(mensTeam);
        
        //gets but does not remove the player in the 4th index position
        System.out.println(mensTeam.get(4));
        
        //makes new Player
        Player mens9 = new Player("Jimbo", "Center", 57);
        
        //adds new Player
        mensTeam.add(mens9);
        
        //prints out new list
        System.out.println(mensTeam);
        
        //removes player at index position 4
        mensTeam.remove(mensTeam.get(4));
        
        //prints new list
        System.out.println(mensTeam);
        
        
        
        
        
        //creates a new ArrayBag object
        ArrayBag courses = new ArrayBag();
        
        //adding Strings representing courses
        String course1 = "CSCI 159";
        
        String course2 = "CSCI 161";
        
        String course3 = "CSCI 222";
        
        String course4 = "POLS 220";
        
        String course5 = "MUSC 112";
        
        //adding them to the list
        courses.add(course1);
        
        courses.add(course2);
        
        courses.add(course3);
        
        courses.add(course4);
        
        courses.add(course5);
        
        //prints out list
        System.out.println(courses);
        
        //removes random item
        courses.remove();
        
        //prints list again
        System.out.println(courses);
        
        
        //creates a LinkedBag object for the womens team of capacity 2
        LinkedBag womensTeam = new LinkedBag(2);
        
        //creates new Player objects
        Player womens1 = new Player("Janet", "Center", 12);
        
        Player womens2 = new Player("Vanessa", "PointGuard", 56);
        
        Player womens3 = new Player("Hannah", "ShootingGuard", 7);
        
        Player womens4 = new Player("Brooke", "SmallForward", 25);
        
        Player womens5 = new Player("Carly", "PowerForward", 4);
        
        Player womens6 = new Player("Lilly", "Center", 1);
        
        Player womens7 = new Player("Heidi", "SmallForward", 5);
        
        Player womens8 = new Player("Sam", "PointGuard", 22);
        
        //adds Players to list
        womensTeam.add(womens1);
        
        womensTeam.add(womens2);
        
        womensTeam.add(womens3);
        
        womensTeam.add(womens4);
        
        womensTeam.add(womens5);
        
        womensTeam.add(womens6);
        
        womensTeam.add(womens7);
        
        womensTeam.add(womens8);
        
        //prints out list
        System.out.println(womensTeam);
        
        //removes random Player
        womensTeam.remove();
        
        //prints out list
        System.out.println(womensTeam);
        
        //gets but does not remove Player from index position 4
        System.out.println(womensTeam.get(4));
        
        //creates new Player object
        Player womens9 = new Player("Micayla", "Center", 28);
        
        //adds Player to list
        womensTeam.add(womens9);
        
        //prints list
        System.out.println(womensTeam);
        
        //removes Player from index position 4
        womensTeam.remove(womensTeam.get(4));
        
        //prints out list
        System.out.println(womensTeam);
        
        
        
        
        
    }
    
}
