/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questions;

import java.util.Random;

/**
 *
 * @author August
 */
public class Magic8Ball {

    public static String askQuestion(String question) {
        Random rand = new Random();
        if (question.toLowerCase().startsWith("who")) {

            String[] whoList = {
                "A dancing crocodile.",
                "Wouldn't you like to know.",
                "Indiana Jones",
                "Stranger Things",
                "A busy bee."
            };
            return whoList[rand.nextInt(whoList.length)];

        } else if (question.toLowerCase().startsWith("what")) {

            String[] whatList = {
                "Tacos, tacos, and more tacos.",
                "I'm not sure if I can answer that.",
                "These questions are wearing me out.",
                "The answer is... nothing.",
                "Counterclaim, nope."
            };

            return whatList[rand.nextInt(whatList.length)];

        } else if (question.toLowerCase().startsWith("where")) {
            String[] whereList = {
                "Somewhere in Africa.",
                "It is downtown Fargo.",
                "Las Vegas, Nevada.",
                "Europe.",
                "The dark cave."
            };

            return whereList[rand.nextInt(whereList.length)];

        } else if (question.toLowerCase().startsWith("why")) {
            String[] whyList = {
                "Why are you asking me this?",
                "That's just the way it is.",
                "why why why...",
                "Because people love to dance!",
                "Hamburgers provide protein."
            };
            return whyList[rand.nextInt(whyList.length)];
        } else if (question.toLowerCase().startsWith("when")) {
            String[] whenList = {
                "In about 15 minutes.",
                "When I say so.",
                "200 million years.",
                "When you take a shower.",
                "2 and a half hours from now."
            };
            return whenList[rand.nextInt(whenList.length)];
        } else if (question.toLowerCase().startsWith("how")) {
            String[] howList = {
                "I'm in your walls.",
                "I'm a dumb computer.",
                "how, more like howdy",
                "You should figure that out yourself.",
                "All signs point to confusion."

            };
            return howList[rand.nextInt(howList.length)];
        } else {
            String[] generalList = {
                "This question is way above my paygrade.",
                "I'm a magic 8 ball, not a genie.",
                "I'm ignoring you.",
                "This question was wack.",
                "Can you ask a better question."
            };
            return generalList[rand.nextInt(generalList.length)];
        }

    }

}
