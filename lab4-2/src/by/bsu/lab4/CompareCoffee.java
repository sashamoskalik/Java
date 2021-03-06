package by.bsu.lab4;

import by.bsu.lab4.Coffee.Coffee;

import java.util.Comparator;

public class CompareCoffee implements Comparator<Coffee> {

    public int compare(Coffee ob1, Coffee ob2) {
        return (ob1.getCost()/ob1.getWeight() - ob2.getCost()/ob2.getWeight());
    }
}
