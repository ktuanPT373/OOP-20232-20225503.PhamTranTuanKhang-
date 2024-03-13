/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.addtwomatrices;

/**
 *
 * @author khangpt
 */
import java.util.Scanner;
public class AddTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the size of row ?");
        int row = scanner.nextInt();
        System.out.println("What is the size of column ?");
        int column = scanner.nextInt();
        
        int[][] matrix1 = new int[row][column];
        int[][] matrix2 = new int[row][column];
        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
               System.out.print("Enter value at position for matrix1 [" + i + "][" + j + "]: ");
               matrix1[i][j] = scanner.nextInt();
            }
        }
        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
               System.out.print("Enter value at position for matrix2 [" + i + "][" + j + "]: ");
               matrix2[i][j] = scanner.nextInt();
            }
        }
        int[][] matrix = new int[row][column];

        System.out.println("Sum matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); 
        }
        
    }
}
