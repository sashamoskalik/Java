package by.bsu.onedimensionalArray;

import by.bsu.onedimensionalArray.Element.Element;
import by.bsu.onedimensionalArray.Massiv.Massiv;

import java.util.Arrays;

public class OneDimensionalArray extends Massiv {
    private int[] res;


    public void sum(){
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


    public int[] getRes() {
        return res;
    }

    public void setRes(int[] res) {
        this.res = res;
    }

    public OneDimensionalArray(int[] array1, int[] array2) {
       super(array1, array2);
    }

    public OneDimensionalArray(int n, int min, int max, int[] array1, int[] array2, int[] res) {
        super(n, min, max, array1, array2);
        this.res = res;
    }

    public OneDimensionalArray(){
        super();
    }


    public OneDimensionalArray(int[] res) {
        this.res = res;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        OneDimensionalArray that = (OneDimensionalArray) o;
        return Arrays.equals(res, that.res);
    }

    @Override
    public int hashCode() {

        int result = super.hashCode();
        result = 31 * result + Arrays.hashCode(res);
        return result;
    }
}
