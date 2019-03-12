package by.bsu.lab4.Coffee;

public class BusCoffee implements Coffee {
    private String name;
    private int size;
    private int cost;
    private int weight;
    private int quality;

    public BusCoffee(String name, int size, int cost, int weight, int quality) {
        this.name = name;
        this.size = size;
        this.cost = cost;
        this.weight = weight;
        this.quality = quality;
    }


    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return getName();
    }
}
