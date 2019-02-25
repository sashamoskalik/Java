package by.bsu.Matrix;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args){
        int temp=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter razmernost = ");
        int n = input.nextInt();
        final int min = 0;
        final int max = 3;
        int array[][] = new int[n][n];
        for (int i=0; i<n;i++){
            for (int j=0;j<n;j++){
                array[i][j]= min + (int)(Math.random() * max);
            }
        }
        System.out.println("Matrix: ");
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for (int i=0; i<n; i++){
            int counter = 0;
            int newline[] = new int[n];
            for (int j=0; j<n; j++){
                if (array[i][j] != 0){
                    newline[counter++] = array[i][j];
                }
            }
            array[i] = Arrays.copyOf(newline, n);
        }
        System.out.println("Matrix after: ");
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
