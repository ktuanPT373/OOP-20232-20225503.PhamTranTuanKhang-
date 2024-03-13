/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nstartriangle;

/**
 *
 * @author khangpt
 */
import javax.swing.JOptionPane;
public class NStarTriangle {
    public static void main(String[] args) {
        
        String strN = JOptionPane.showInputDialog(null, 
                "Please input the value n: ", JOptionPane.INFORMATION_MESSAGE);
        int n = Integer.parseInt(strN);
        String result = "";
        for (int i =1; i <= n; i++ ){
            for (int j=1; j <= n-i; j++){
                result += "  ";
            }
            for (int k=1; k<=i-1 ; k++){
                result += "*";
            }
            result += "*";
            for (int k=1; k<=i-1 ; k++){
                result += "*";
            }
            result += "\n";
           
        }
        JOptionPane.showMessageDialog(null,result);
    }
}
