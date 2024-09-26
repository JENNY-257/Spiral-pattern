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


public class SpiralPatternOfNumbers extends SpiralPattern {

    @Override
    public void getSpiralNumbers(int n) {
        int[][] numbers = new int[n][n];
        int value = 1;
        int maxCol = n - 1;
        int minCol = 0;
        int maxRow = n - 1;
        int minRow = 0;

        while (value <= n * n) {
            for (int i = minCol; i <= maxCol; i++) {
                numbers[minRow][i] = value++;
            }
            for (int i = minRow + 1; i <= maxRow; i++) {
                numbers[i][maxCol] = value++;
            }
            for (int i = maxCol - 1; i >= minCol; i--) {
                numbers[maxRow][i] = value++;
            }
            for (int i = maxRow - 1; i > minRow; i--) {
                numbers[i][minCol] = value++;
            }
            minCol++;
            minRow++;
            maxCol--;
            maxRow--;
        }
        System.out.println("Spiral pattern of numbers");
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(numbers[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SpiralPatternOfNumbers printer = new SpiralPatternOfNumbers();
        printer.getSpiralNumbers(5); // Example usage
    }
}
