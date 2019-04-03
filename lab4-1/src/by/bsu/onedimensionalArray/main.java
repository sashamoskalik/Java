package by.bsu.onedimensionalArray;

import by.bsu.onedimensionalArray.Element.Element;
import by.bsu.onedimensionalArray.Massiv.Massiv;

public class Main {
    public static void main(String[] args){
        Massiv massiv = new Massiv();
        OneDimensionalArray oneDimensionalArray = new OneDimensionalArray();
        massiv.setN(6);
        massiv.setMin(0);
        massiv.setMax(10);
        massiv.showArray1();
        massiv.showArray2();


        oneDimensionalArray.sum();
        oneDimensionalArray.subtraction();
        oneDimensionalArray.multiplication();

    }
}
