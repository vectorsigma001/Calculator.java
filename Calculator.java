import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JFrame frame;
    private JPanel displayPanel, calculationPanel, componentPanel;
    private JTextField displayTextField,calculationTextField;
    private boolean start;
    public Calculator() {
        start=true;
        frame = new JFrame("calculator");
        frame.setSize(500, 520);

        ActionListener insert = new InsertAction();
        ActionListener command = new InsertCommand();

        displayPanel = new JPanel();
        displayPanel.setVisible(true);
        displayPanel.setBackground(Color.RED);
        displayPanel.setSize(500, 40);
        displayPanel.setLocation(0, 0);
        displayPanel.setLayout(null);
        frame.add(displayPanel);
        
        displayTextField=new JTextField();
        displayTextField.setVisible(true);
        displayTextField.setSize(500,40);
        displayTextField.setLocation(0,0);
        displayPanel.add(displayTextField);


        calculationPanel = new JPanel();
        calculationPanel.setVisible(false);
        calculationPanel.setBackground(Color.BLACK);
        calculationPanel.setSize(500, 40);
        calculationPanel.setLayout(null);
        calculationPanel.setLocation(0, 40);
        frame.add(calculationPanel);

        calculationTextField=new JTextField();
        calculationTextField.setVisible(true);
        calculationTextField.setSize(500,40);
        calculationTextField.setLocation(0,40);
        calculationTextField.setLayout(null);
        calculationPanel.add(calculationTextField);
        

        componentPanel = new JPanel();
        componentPanel.setVisible(true);
        componentPanel.setBackground(Color.CYAN);
        componentPanel.setSize(500, 420);
        componentPanel.setLocation(0, 80);

        addButton("7", insert);
        addButton("8", insert);
        addButton("9", insert);
        addButton("/", command);
        addButton("4", insert);
        addButton("5", insert);
        addButton("6", insert);
        addButton("*", command);
        addButton("1", insert);
        addButton("2", insert);
        addButton("3", insert);
        addButton("-", command);
        addButton("0", insert);
        addButton(".", insert);
        addButton("=", insert);
        addButton("+", command);
        addButton("Clear", command);

        componentPanel.setLayout(new GridLayout(5, 4));
        frame.add(componentPanel);

        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void addButton(String label, ActionListener listener) {
        JButton button = new JButton(label);
        button.addActionListener(listener);
        componentPanel.add(button);
    }

    class InsertAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String input=e.getActionCommand();
            if(start){
                displayTextField.setText("");
            }
        }
    }

    class InsertCommand implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Placeholder
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
