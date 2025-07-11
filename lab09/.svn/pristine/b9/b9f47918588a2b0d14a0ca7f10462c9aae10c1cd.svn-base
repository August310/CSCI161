/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questions;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author August Preuss
 */

public class Ball extends GameObject implements Moveable {
    
    private int diameter;
    private int xVelocity;
    private int yVelocity;
    
    public Ball(int xPosition, int yPosition, int diameter, Color color){
        this.diameter = diameter;
        super.xPos = xPosition;
        super.yPos = yPosition;
        super.color = color;
    }
    @Override
    public void draw(Graphics g){
        g.setColor(super.color);
        g.fillOval(xPos, yPos, diameter, diameter);
        
    }

    @Override
    public Rectangle getBounds() {
       return new Rectangle(xPos, yPos, diameter, diameter);
    }

    @Override
    public void move() {
        xPos += xVelocity;
        yPos += yVelocity;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
