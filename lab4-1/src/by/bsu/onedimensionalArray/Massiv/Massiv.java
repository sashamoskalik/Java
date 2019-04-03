package by.bsu.onedimensionalArray.Massiv;

import by.bsu.onedimensionalArray.Element.Element;

import java.util.Arrays;
import java.util.Objects;

public class Massiv extends Element {
    public int[] array1;
    public int[] array2;

    public void showArray1() {
        array1 = new int[n];
        Generate(array1, n, min, max);
        System.out.print("Массив1: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println(" ");
    }

    public void showArray2(){
        array2 = new int[n];
        Generate(array2, n, min, max);
        System.out.print("Массив2: ");
        for (int i = 0; i<n; i++){
            System.out.print(array2[i] + " ");
        }
        System.out.println(" ");
    }

    /*public void sum(){
        res = new int[n];
        System.out.print("Сумма массивов: ");
        for (int i = 0; i<n; i++){
            res[i] = array1[i] + array2[i];
            System.out.print(res[i] + " ");
        }
        System.out.println(" ");
    }

    public void subtraction(){
        System.out.print("Разность массивов: ");
        for (int i = 0; i<n; i++){
            res[i] = array1[i] - array2[i];
            System.out.print(res[i] + " ");
        }
        System.out.println(" ");
    }

    public void multiplication(){
        System.out.print("Произведение массивов: ");
        for (int i = 0; i<n; i++){
            res[i] = array1[i] * array2[i];
            System.out.print(res[i] + " ");
        }
    }

*/

    public Massiv(int[] array1, int[] array2) {
        this.array1 = array1;
        this.array2 = array2;
    }

    public Massiv(int n, int min, int max, int[] array1, int[] array2) {
        super(n, min, max);
        this.array1 = array1;
        this.array2 = array2;
    }

    public Massiv(){}

    public int[] getArray1() {
        return array1;
    }

    public void setArray1(int[] array1) {
        this.array1 = array1;
    }

    public int[] getArray2() {
        return array2;
    }

    public void setArray2(int[] array2) {
        this.array2 = array2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Massiv massiv = (Massiv) o;
        return Arrays.equals(array1, massiv.array1) &&
                Arrays.equals(array2, massiv.array2);
    }

    @Override
    public int hashCode() {

        int result = Arrays.hashCode(array1);
        result = 31 * result + Arrays.hashCode(array2);
        return result;
    }

}
