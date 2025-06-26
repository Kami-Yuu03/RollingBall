package Lib;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class RollingBall extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawOval(100, 100, 50, 50);
    }
}
