/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentassignone;

/**
 *
 * @author educa
 */
// File: SpiralPatternOfNumbers.java

//concrete class that extends abstarct class spiralPettern

public class SpiralPatternOfNumbers extends SpiralPattern {
    
    //Override abstarct method to generate and display spiral numbers
    
    @Override
    public void getSpiralNumbers(int n) {
        
        //Initialize a 2D array to store the spiral pattern
        
        int[][] numbers = new int[n][n];
        
        //Starting value to fill the array
        int value = 1;
        
        //Maximum column index
        int maxCol = n - 1;
        //Minimum column index
        int minCol = 0;
        //Maximum row index
        int maxRow = n - 1;
        //Minimum row index
        int minRow = 0;
        
        
        // Fill the array in a spiral order
        while (value <= n * n) {
            
            // Fill the top row from left to right
            for (int i = minCol; i <= maxCol; i++) {
                numbers[minRow][i] = value++;
            }
            
            // Fill the right column from top to bottom
            for (int i = minRow + 1; i <= maxRow; i++) {
                numbers[i][maxCol] = value++;
            }
            
            // Fill the bottom row from right to left
            for (int i = maxCol - 1; i >= minCol; i--) {
                numbers[maxRow][i] = value++;
            }
            
            // Fill the left column from bottom to top
            for (int i = maxRow - 1; i > minRow; i--) {
                numbers[i][minCol] = value++;
            }
            
            // Move the boundaries inward
            minCol++;
            minRow++;
            maxCol--;
            maxRow--;
        }
        
        // Print the spiral pattern
        System.out.println("Spiral pattern of numbers");
        System.out.println();
        
        
        // Iterate through the 2D array to print each number
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                
                // Print each number followed by a tab
                System.out.print(numbers[i][j] + "\t"); 
            }
            
            // Move to the next line after each row
            System.out.println();
        }
    }
}
