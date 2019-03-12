package by.bsu.lab4;

import by.bsu.lab4.Arabic.ArabicBank;
import by.bsu.lab4.Arabic.ArabicGrain;
import by.bsu.lab4.Arabic.ArabicMolot;
import by.bsu.lab4.Arabic.ArabicPackage;
import by.bsu.lab4.Coffee.BusCoffee;
import by.bsu.lab4.Coffee.Coffee;
import by.bsu.lab4.Robusta.RobustaBank;
import by.bsu.lab4.Robusta.RobustaGrain;
import by.bsu.lab4.Robusta.RobustaMolot;
import by.bsu.lab4.Robusta.RobustaPackage;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Bus coffee = generateBus(132, 300);
        System.out.println(coffee);


        System.out.println("НАХОДИМ");
        List<Coffee> quality = FindByQuality(coffee.getCoffee(), 4, 5);
        System.out.println(quality.toString());


        Collections.sort(coffee.getCoffee(), new CompareCoffee());
        System.out.println("Сортируем по соотношению веса к стоимости");
        System.out.println(coffee);
        }

    private static List<Coffee> FindByQuality(List<Coffee> coffee, int from, int to) {
        List<Coffee> quality = new ArrayList<>();
        for (Coffee coffee1 : coffee){
            if (coffee1.getQuality()>=from && coffee1.getQuality()<=to){
                quality.add(coffee1);
            }
        }
        return quality;
    }

    private static Bus generateBus(int size, int cost) {
        Bus coffee = new Bus();
        coffee.setBusCost(cost);
        coffee.setBusSize(size);
        coffee.getCoffee().add(new ArabicBank("ArabicBank", 20,30, 10, 5 ));
        coffee.getCoffee().add(new ArabicGrain("ArabicGrain", 50,30,15,5));
        coffee.getCoffee().add(new ArabicMolot("ArabicMolot", 30,40,4,3));
        coffee.getCoffee().add(new ArabicPackage("ArabicPackage", 10,40,20,4));
        coffee.getCoffee().add(new RobustaBank("RobustaBank",30,50,50,3));
        coffee.getCoffee().add(new RobustaGrain("RobustaGrain",20,30,3,4));
        coffee.getCoffee().add(new RobustaMolot("RobustaMolot",10,30,15,5));
        coffee.getCoffee().add(new RobustaPackage("RobustaPackage",20,50,25,4));
        return coffee;
    }


}
