/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questions;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author august.preuss
 */
public class Wall extends JFrame {

    private Brick brick1;
    private Brick brick2;
    private Brick brick3;
    private Brick brick4;
    private Brick brick5;
    private Brick brick6;
    private Brick brick7;
    private Brick brick8;

    @Override
    public void paint(Graphics g) {

        brick1 = new Brick(50, 50, 50, 25, Color.RED);
        brick2 = new Brick(50, 100, 50, 25, Color.BLACK);
        brick3 = new Brick(50, 150, 50, 25, Color.BLUE);
        brick4 = new Brick(50, 200, 50, 25, Color.DARK_GRAY);
        brick5 = new Brick(50, 250, 50, 25, Color.GREEN);
        brick6 = new Brick(50, 300, 50, 25, Color.YELLOW);
        brick7 = new Brick(50, 350, 50, 25, Color.ORANGE);
        brick8 = new Brick(50, 400, 50, 25, Color.MAGENTA);

        brick1.draw(g);
        brick2.draw(g);
        brick3.draw(g);
        brick4.draw(g);
        brick5.draw(g);
        brick6.draw(g);
        brick7.draw(g);
        brick8.draw(g);

    }

    public Wall() {
        super.setSize(400, 500);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            new Wall().setVisible(true);
        });
    }

}
