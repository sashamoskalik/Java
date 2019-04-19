package by.bsu.lab6;

public class Main {
    public static void main(String[] args){
        Tram tram = new Tram("Трамвай", "Да", 80, "нет");
        tram.name();
        tram.license();
        tram.numberOfPeople();
        tram.wheels();
    }
}
