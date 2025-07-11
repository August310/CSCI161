/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TextAdventure;

/**
 *
 * @author August
 */
public class TextAdventure {

    public static void main(String[] args) {
                                                                                                                            
        
        
        Creature dragon = new Creature("Dragon", "big and brooding", "defeated");
        Creature orc = new Creature("Orc", "buff and dumb", "defeated");
        Creature roommate = new Creature("Roommate", "kind and intelligent", "defeated");

        Item sword = new Item("Sword", "tiny sword found in a box of cereal");
        Item spork = new Item("Spork", "very useful for eating... or poking");
        Item mathBook = new Item("Math Book", "unbearably boring");

        Room startRoom = new Room("Basement", "A musty basement with not much around other than a door on the other side");
        
        Room room2 = new Room("Classroom", "A classroom filled with empty desks and books scattered about", sword);
        
        Room room3 = new Room("Library", "A library with a vast array of books and a weird nest in the middle", dragon);
        
        Room room4 = new Room("Arcade", "Asiles of arcade machines line this place, these things haven't been played in ages");
        
        Room room5 = new Room("Cafeteria", "A once bustling cafeteria is now empty with nothing but a couple trays of moldy food");
        
        Room room6 = new Room("Secret study room", "A top secret study room containing all kinds of educational materials", spork);
        
        Room room7 = new Room("Skating rink", "A blast of cold air leads you to finding yourself in a skating rink", orc);
        
        Room room8 = new Room("Indoor playground", "An old indoor playground is starting to give into the surrounding elements, rotting away");
        
        Room room9 = new Room("Basketball court", "A number of basketball are strewn about like someone left in a hurry", mathBook);

        Room endRoom = new Room("Exit tunnel", "A tunnel to get out is on the otherside of your roommate", roommate);
        
        Exit doubleDoor = new Exit("Double door", "Two freshly polished glass doors", "You carefully open the door", room3 );
        
        Exit doubleDoor1 = new Exit("Double door", "Two freshly polished glass doors", "You carefully open the door", room2 );
         
        Exit doubleDoor2 = new Exit("Double door", "Two freshly polished glass doors", "You carefully open the door", endRoom );
          
        Exit doubleDoor3 = new Exit("Double door", "Two freshly polished glass doors", "You carefully open the door", room8 );

        Exit woodDoor = new Exit("Wooden door", "An old creaky door", "You apply wd-40 to the door before walking inside", room2 );
        
        Exit woodDoor1 = new Exit("Wooden door", "An old creaky door", "You apply wd-40 to the door before walking inside", room5 );
        
        Exit woodDoor2 = new Exit("Wooden door", "An old creaky door", "You apply wd-40 to the door before walking inside", room3 );
        
        Exit woodDoor3 = new Exit("Wooden door", "An old creaky door", "You apply wd-40 to the door before walking inside", room9 );
        
        Exit woodDoor4 = new Exit("Wooden door", "An old creaky door", "You apply wd-40 to the door before walking inside", room7 );
        
        Exit hallway = new Exit("Hallway", "A long looming hallway that you can't see the end of", "You walk onward having no fear of the unknown", room5 );
        
        Exit hallway1 = new Exit("Hallway", "A long looming hallway that you can't see the end of", "You walk onward having no fear of the unknown", room8 );
        
        Exit hallway2 = new Exit("Hallway", "A long looming hallway that you can't see the end of", "You walk onward having no fear of the unknown", room3 );
        
        Exit chippedWallPaper = new Exit("Chipped wallpaper", "A suspiciously chipped wallpaper, it almost looks like you can walk through it", "You rip the wallpaper away entering a brand new secret room", room6 );
        
        Exit window = new Exit("Window", "An open window that leads to a new room", "You cautiously go through the open window", room4 );
        
        Exit window1 = new Exit("Window", "An open window that leads to a new room", "You cautiously go through the open window", room5 );
        
        Exit window2 = new Exit("Window", "An open window that leads to a new room", "You cautiously go through the open window", room7 );
        
        Exit window3 = new Exit("Window", "An open window that leads to a new room", "You cautiously go through the open window", room3 );
        
        Exit window4 = new Exit("Window", "An open window that leads to a new room", "You cautiously go through the open window", room8 );
        
        Exit window5 = new Exit("Window", "An open window that leads to a new room", "You cautiously go through the open window", room9 );
        
        startRoom.setExit1(woodDoor);
        
        room2.setExit1(doubleDoor);
        room2.setExit2(window);
        
        room3.setExit1(doubleDoor1);
        room3.setExit2(woodDoor1);
        room3.setExit3(hallway1);
        room3.setExit4(window2);
        
        room4.setExit1(hallway);
        
        room5.setExit1(woodDoor2);
        room5.setSecretExit(chippedWallPaper);
        
        room6.setExit1(window1);
        
        room7.setExit1(window3);
        room7.setExit2(woodDoor3);
        
        room8.setExit1(window5);
        room8.setExit2(doubleDoor2);
        room8.setExit3(hallway2);
        
        room9.setExit1(window4);
        room9.setExit2(woodDoor4);
        
        endRoom.setExit1(doubleDoor3);
        
        
        
        Player player1 = new Player("August", "The mage");

        World newWorld = new World(startRoom, endRoom);

        Game newGame = new Game(newWorld, player1);

        newGame.setStartText("Welcome to my awesome text adventure!");
        newGame.setVictoryText("Congratulations, you have won!");
        newGame.start();

        

       

    }

}
