/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author araderma
 */
public class Magic8BallTest {
    
    private static HashMap<String, Integer>[] responses; 
    
    @BeforeClass
    public static void setUpClass() {
        responses = new HashMap[7]; 
        
        for(int i = 0; i < responses.length; i++)
        {
            responses[i] = new HashMap<>(); 
        }
        
        String whyQuestion = "Why do birds fly?";
        String whatQuestion = "What is love? (Baby don't hurt me, don't hurt me, no more.)";
        String whereQuestion = "Where should I hide the bodies?";
        String howQuestion = "How do I reach these kids?";
        String whoQuestion = "Who framed Roger Rabbit?"; 
        String whenQuestion = "When will this all be over?";
        String generalQuestion = "Will the answer to this question be \"No\"?";
        
        String[] questions = {whyQuestion, whatQuestion, whereQuestion, howQuestion, whoQuestion, whenQuestion, generalQuestion}; 


        for(int i = 0; i < 7; i++)
        {
            for(int j = 0; j < 1000; j++)
            {
                String result = Magic8Ball.askQuestion(questions[i]);
                if(!responses[i].containsKey(result))
                {
                    responses[i].put(result, 1); 
                }
                else
                {
                    responses[i].put(result, responses[i].get(result) + 1);          
                }
            }
        }
        
        for(int i = 0; i < 7; i++)
        {
            System.out.println("Responses to question: " + questions[i]);
            Object[] keys =  responses[i].keySet().toArray(); 
            Object[] values =  responses[i].values().toArray(); 

            for(int j = 0; j < keys.length; j++)
            {
                System.out.println("  " + (j + 1) + ") " + keys[j] + " : " + values[j]);
            }
        }
                
        
    }
    
    @Test
    public void testWhyQuestionSufficientResponses() {
        int Q = 0; 
        assertTrue("There are fewer than 5 responses to \"why\" questions. found " + responses[Q].size(), responses[Q].size() >= 5);
    }
    
    @Test
    public void testWhyQuestionSufficientlyRandom() {
        int Q = 0; 
        
        int predictedMin = (int)(1000.0 / (responses[Q].size() * 2)); 
        
        for(int i = 0; i < responses[Q].size(); i++)
        {
            assertTrue("Response  " + responses[Q].keySet().toArray()[i] + " did not occur enough", (Integer)responses[Q].values().toArray()[i] >= predictedMin);
        }
    }
    
    @Test
    public void testWhatQuestionSufficientResponses() {
        int Q = 1; 
        assertTrue("There are fewer than 5 responses to \"what\" questions. found " + responses[Q].size(), responses[Q].size() >= 5);
    }
    
    @Test
    public void testWhatQuestionSufficientlyRandom() {
        int Q = 1; 
        
        int predictedMin = (int)(1000.0 / (responses[Q].size() * 2)); 
        
        for(int i = 0; i < responses[Q].size(); i++)
        {
            assertTrue("Response  " + responses[Q].keySet().toArray()[i] + " did not occur enough", (Integer)responses[Q].values().toArray()[i] >= predictedMin);
        }
    }
    
    @Test
    public void testWhereQuestionSufficientResponses() {
        int Q = 2; 
        assertTrue("There are fewer than 5 responses to \"where\" questions. found " + responses[Q].size(), responses[Q].size() >= 5);
    }
    
    @Test
    public void testWhereQuestionSufficientlyRandom() {
        int Q = 2; 
        
        int predictedMin = (int)(1000.0 / (responses[Q].size() * 2)); 
        
        for(int i = 0; i < responses[Q].size(); i++)
        {
            assertTrue("Response  " + responses[Q].keySet().toArray()[i] + " did not occur enough", (Integer)responses[Q].values().toArray()[i] >= predictedMin);
        }
    }
    
    @Test
    public void testHowQuestionSufficientResponses() {
        int Q = 3; 
        assertTrue("There are fewer than 5 responses to \"how\" questions. found " + responses[Q].size(), responses[Q].size() >= 5);
    }
    
    @Test
    public void testHowQuestionSufficientlyRandom() {
        int Q = 3; 
        
        int predictedMin = (int)(1000.0 / (responses[Q].size() * 2)); 
        
        for(int i = 0; i < responses[Q].size(); i++)
        {
            assertTrue("Response  " + responses[Q].keySet().toArray()[i] + " did not occur enough", (Integer)responses[Q].values().toArray()[i] >= predictedMin);
        }
    }
    
    @Test
    public void testWhoQuestionSufficientResponses() {
        int Q = 4; 
        assertTrue("There are fewer than 5 responses to \"who\" questions. found " + responses[Q].size(), responses[Q].size() >= 5);
    }
    
    @Test
    public void testWhoQuestionSufficientlyRandom() {
        int Q = 4; 
        
        int predictedMin = (int)(1000.0 / (responses[Q].size() * 2)); 
        
        for(int i = 0; i < responses[Q].size(); i++)
        {
            assertTrue("Response  " + responses[Q].keySet().toArray()[i] + " did not occur enough", (Integer)responses[Q].values().toArray()[i] >= predictedMin);
        }
    }
    
    @Test
    public void testWhenQuestionSufficientResponses() {
        int Q = 5; 
        assertTrue("There are fewer than 5 responses to \"when\" questions. found " + responses[Q].size(), responses[Q].size() >= 5);
    }
    
    @Test
    public void testWhenQuestionSufficientlyRandom() {
        int Q = 5; 
        
        int predictedMin = (int)(1000.0 / (responses[Q].size() * 2)); 
        
        for(int i = 0; i < responses[Q].size(); i++)
        {
            assertTrue("Response  " + responses[Q].keySet().toArray()[i] + " did not occur enough", (Integer)responses[Q].values().toArray()[i] >= predictedMin);
        }
    }
    
    @Test
    public void testGeneralQuestionSufficientResponses() {
        int Q = 6; 
        assertTrue("There are fewer than 5 responses to general questions. found " + responses[Q].size(), responses[Q].size() >= 5);
    }
    
    @Test
    public void testGeneralQuestionSufficientlyRandom() {
        int Q = 6; 
        
        int predictedMin = (int)(1000.0 / (responses[Q].size() * 2)); 
        
        for(int i = 0; i < responses[Q].size(); i++)
        {
            assertTrue("Response  " + responses[Q].keySet().toArray()[i] + " did not occur enough", (Integer)responses[Q].values().toArray()[i] >= predictedMin);
        }
    }
    
    
    
}
