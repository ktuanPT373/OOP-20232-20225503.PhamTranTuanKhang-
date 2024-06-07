package hust.soict.dsai.swing;
import java.awt.*;
import java.awt.event.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khangpt
 */
public class AWTAccumulator extends Frame {
    private TextField tfInput;
    private TextField tfOutput;
    private int sum = 0;
    
    public AWTAccumulator() {
        setLayout(new GridLayout(2,2));
        add(new Label("Enter an Integer: "));
        
        tfInput = new TextField(10);
        add(tfInput);
        tfInput.addActionListener(new TFInputListener());
        
        add(new Label("The Accumulated Sum is:"));
        
        tfOutput = new TextField(10);
        tfOutput.setEditable(false);
        add(tfOutput);
        
        setTitle("AWT Accumulator");
        setSize(350, 120);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new AWTAccumulator();
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
