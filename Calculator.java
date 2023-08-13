import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

import java.awt.BorderLayout;
import java.awt.Color;
public class Calculator{
    private JFrame frame;
    JPanel displayPanel,calculationPanel;
    public Calculator(){
        frame=new JFrame("calculator");
        frame.setSize(500,500);
        
        displayPanel=new JPanel();
        displayPanel.setVisible(true);
        displayPanel.setBackground(Color.RED);
        displayPanel.setSize(500,40);
        displayPanel.setLocation(0, 0);
        displayPanel.setLayout(null);
        frame.add(displayPanel);
        calculationPanel=new JPanel();
        calculationPanel.setVisible(true);
        calculationPanel.setBackground(Color.BLACK);
        calculationPanel.setSize(500,40);
        calculationPanel.setLayout(null);
        calculationPanel.setLocation(0,40);
        frame.add(calculationPanel);


        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

 public static void main(String args[]){
    new Calculator();
 }
}
