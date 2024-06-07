/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hust.soict.dsai.swing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author khangpt
 */
public class SwingAccumulator extends JFrame{
    private JTextField tfInput;
    private JTextField tfOutput;
    private int sum = 0;
    
    // Constructor to set up GUI components and event handlers
    public SwingAccumulator(){
        Container cp = getContentPane();
        cp.setLayout(new GridLayout(2,2));
        cp.add(new JLabel("Enter an Integer: "));
        
        tfInput = new JTextField(10);
        cp.add(tfInput);
        tfInput.addActionListener(new TFInputListener());
        
        cp.add(new JLabel("The Accumulated Sum is: "));
        
        tfOutput = new JTextField(10);
        tfOutput.setEditable(false);
        cp.add(tfOutput);
        
        setTitle("Swing Accumulator");
        setSize(350,120);
        setVisible(true);
    }
    public static void main(String[] args){
        new SwingAccumulator();
    }
    
    private class TFInputListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt){
            int numberIn = Integer.parseInt(tfInput.getText());
            sum += numberIn;
            tfInput.setText("");
            tfOutput.setText(sum + "");
        }
    }
    
}
