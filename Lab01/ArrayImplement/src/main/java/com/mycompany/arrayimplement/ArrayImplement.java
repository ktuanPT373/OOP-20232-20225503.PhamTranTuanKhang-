/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrayimplement;

/**
 *
 * @author khangpt
 */
import java.util.Scanner;
public class ArrayImplement {
       
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("You want the array at what size ?");
        int size = scanner.nextInt();
        
        int[] arr = new int[size];
        
        System.out.println("Enter the elements of the array:");
        for (int i=0; i < size; i++){
            System.out.print("Element" + (i+1) + ": ");
            arr[i] = scanner.nextInt();
        }
        
        for (int i=0; i < size - 1 ; i++){
            for (int j = 0; j < size - i - 1; j++){
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;;
                }
            }
        }
        
        int sum = 0;
        for (int i=0; i < size; i++){
            sum += arr[i];
        }
        
        double average = (double) sum/size;
        
        String result = "";
        for (int i = 0; i < size; i++){
            result = result + arr[i] + " ";
        }
        System.out.println("Sorted Array: " + result);
        System.out.println("Sum of all elements: " + sum);
        System.out.println("Average of all elements: "+ average);
        
        }
}
