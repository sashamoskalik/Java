//Числа-палиндромы, значения которых в прямом и обратном порядке совпадают.
package by.bsu.lab1;

import java.util.Scanner;

public class NumbersPalindromes {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int n = input.nextInt();
        int array[] = new int[n];
        System.out.println("Введите члены массива");
        for (int i=0; i<n; i++){
            array[i]=input.nextInt();
        }
        System.out.print("Массив: ");
        for (int i=0; i<n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print("Полиндром: ");
        for (int i=0; i<n; i++) {
            int ReverNumber=0;
            int SecondNumber = array[i];
            while (SecondNumber != 0) {
                ReverNumber = ReverNumber * 10 + SecondNumber % 10;
                SecondNumber /= 10;
            }
            if (ReverNumber == array[i]) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
