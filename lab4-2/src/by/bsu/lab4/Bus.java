package by.bsu.lab4;

import by.bsu.lab4.Coffee.Coffee;

import java.util.ArrayList;
import java.util.List;

public class Bus {
    private int busSize;
    private int busCost;
    private List<Coffee> coffee = new ArrayList<>();


    public int getBusSize() {
        return busSize;
    }

    public void setBusSize(int busSize) {
        this.busSize = busSize;
    }

    public int getBusCost() {
        return busCost;
    }

    public void setBusCost(int busCost) {
        this.busCost = busCost;
    }

    public List<Coffee> getCoffee() {
        return coffee;
    }

    public void setCoffee(List<Coffee> coffee) {
        this.coffee = coffee;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "busSize=" + getBusSize() +
                ", busCost=" + getBusCost() +
                ", coffee=" + coffee.toString() +
                '}';
    }
}
