/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questions;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author august.preuss
 */
public class Brick {

    private int xPosition;
    private int yPosition;
    private int width;
    private int height;
    private Color color;

    public Brick(int xPosition, int yPosition, int width, int height, Color color) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public int getXPosition() {
        return xPosition;
    }

    public int getYPosition() {
        return yPosition;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Color getColor() {
        return color;
    }

    public void setXPosition(int newXPosition) {
        xPosition = newXPosition;
    }

    public void setYPosition(int newYPosition) {
        yPosition = newYPosition;
    }

    public void setwidth(int newWidth) {
        width = newWidth;
    }

    public void setHeight(int newHeight) {
        height = newHeight;
    }

    public void setColor(Color newColor) {
        color = newColor;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(xPosition, yPosition, width, height);
    }

}
