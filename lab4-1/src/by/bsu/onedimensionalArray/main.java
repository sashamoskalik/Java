package by.bsu.onedimensionalArray;

import by.bsu.onedimensionalArray.Element.Element;
import by.bsu.onedimensionalArray.Massiv.Massiv;

public class Main {
    public static void main(String[] args){
        OneDimensionalArray oneDimensionalArray = new OneDimensionalArray();

        oneDimensionalArray.setN(6);
        oneDimensionalArray.setMin(0);
        oneDimensionalArray.setMax(10);
        oneDimensionalArray.showArray1();
        oneDimensionalArray.showArray2();
        oneDimensionalArray.sum();
        oneDimensionalArray.subtraction();
        oneDimensionalArray.multiplication();

    }
}
