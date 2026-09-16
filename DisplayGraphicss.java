/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package displaygraphicss;

import java.awt.*;
import javax.swing.*;


public class DisplayGraphicss extends JPanel{
  
  //this is a constructor method.
  public DisplayGraphicss(){
    super();
  }
  
    /* Create a paintComponent() method to override the one in
    JPanel.This is where the drawing happens. We don't have 
    to call it in our program, it gets called automatically 
    whenever the panel needs to be redrawn, like when it is 
    made visible or moved or whatever.
  */
  public void paintComponent(Graphics g){
    final int MID = 150;
    final int TOP = 50;
    g.setColor(Color.lightGray); //set the graphics object's paint color
    //for next action
   
    g.setColor(Color.blue);
    g.fillRect(0,0,400,300);
    g.setColor(Color.yellow);
    g.fillRect(0, 175, 400, 160); // ground
    g.setColor(Color.yellow); //restting paint color
    g.fillOval(-40, -40, 80, 80); // sun
    g.setColor(Color.white); //resetting paint color
    g.fillOval(220, 30, 50, 20);
    g.fillOval(240, 20, 40, 20);
    g.fillOval(MID-20, TOP, 40, 40);// head
    g.fillOval(MID-35, TOP+35, 70, 50); // upper torso
    g.fillOval(MID-50, TOP+80, 100, 60); // lower torso
    g.setColor(Color.red);
    g.fillRect(MID-15, TOP-5, 30, 4);
    g.fillRect(MID-18, TOP+32, 36, 8);
    g.fillRect(MID+4, TOP+38, 8, 18);
    g.fillOval(MID-10, TOP+10, 5, 5); // left eye
    g.fillOval(MID+5, TOP+10, 5, 5);// right eye
    g.setColor(Color.black);
    g.fillOval(MID-2, TOP+45, 5, 5);
    g.fillOval(MID-2, TOP+57, 5, 5);
    g.fillOval(MID-2, TOP+69, 5, 5);
    g.drawArc(MID-10, TOP+20, 20, 10, 190, 160); // smile
    g.drawLine(MID-25, TOP+60, MID-50, TOP+40); // left arm
    g.drawLine(MID+25, TOP+60, MID+55, TOP+60); // right arm
    g.drawLine(MID-20, TOP+5, MID+20, TOP+5); // brim of hat
    g.fillRect(MID-15, TOP-20, 30, 25);// top of hat
    g.setColor(Color.GREEN);
    g.fillPolygon(new int[] {175, 220, 275}, new int[] {200, 20, 200}, 3);
  }

    /**
     * @param args the command line arguments
     */
    public static void main(String arg[]){
        //create a new JFrame object, initialize
        JFrame frame = new JFrame("Display Graphics");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);

        // Create a new identifier for a Basic JPanel (DisplayGraphics) called "panel",
        // then create a new BasicJPanel object for it to refer to.
        DisplayGraphicss panel = new DisplayGraphicss();

        // Make the panel object the content pane of the JFrame.
        // This puts it into the drawable area of frame, and now
        // we do all our drawing to panel, using paintComponent(), above.
        frame.setContentPane(panel);
        frame.setVisible(true);
    }
    
}