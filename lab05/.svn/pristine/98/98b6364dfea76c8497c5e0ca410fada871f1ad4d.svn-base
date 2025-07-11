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
 * @author August Preuss
 */
public class HousePart2 extends JFrame {

    private House house1;

    @Override
    public void paint(Graphics g) {
        house1 = new House(200, 200, 400, 400, Color.BLUE);
        house1.draw(g);

    }

    public HousePart2() {
        super.setSize(700, 700);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            new HousePart2().setVisible(true);
        });
    }

}
