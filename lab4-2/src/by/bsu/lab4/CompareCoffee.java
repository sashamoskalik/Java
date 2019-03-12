package by.bsu.lab4;

import by.bsu.lab4.Coffee.Coffee;

import java.util.Comparator;

public class CompareCoffee implements Comparator<Coffee> {

    public int compare(Coffee ob1, Coffee ob2) {
        return (int) (ob1.getCost() - ob2.getCost());
    }
}
