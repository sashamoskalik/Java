package by.bsu.LengthNumbers;

import java.util.Scanner;

/**
 * @author Alexander Moskalik
 */
public class LengthNumbers {
    /**
     *Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
     */
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество чисел = ");
        int n = input.nextInt();
        int min = 1000;
        int max = 0;
        int indexmin = 0;
        int indexmax = 0;
        int array[] = new int[n];
        System.out.print("Введите числа: ");
        for (int i=0; i<n; i++){
            array[i] = input.nextInt();
        }
        for (int i=0; i<n; i++){
           int length=0;
           int secondnumber = array[i];
           while(secondnumber != 0){
               length++;
               secondnumber/=10;
           }
           if (length < min){
               min = length;
               indexmin = i;
           }
           if (length > max){
               max = length;
               indexmax = i;
           }
        }
        System.out.println("Самое короткое число и его длина: " + array[indexmin] + " " + min);
        System.out.println("Самое длинное число и его длина: " + array[indexmax] + " " + max);
        System.out.print("Числа: ");
        for (int i=0; i<n; i++){
            System.out.print(array[i] + " ");
        }
    }
}
