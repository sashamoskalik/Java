package by.bsu.lab6;

public abstract class PublicTransport implements Vehicle {
    String typeOfTransport;
    String license;
    int numberOfPeople;
    String wheels;

    abstract double cost();
    abstract int route();

    public PublicTransport(String typeOfTransport, String license, int numberOfPeople, String wheels) {
        this.typeOfTransport = typeOfTransport;
        this.license = license;
        this.numberOfPeople = numberOfPeople;
        this.wheels = wheels;
    }

    @Override
    public void name() {
        System.out.println(typeOfTransport + "\n" + "Маршрут: №" + route() + " Стоимость проезда = " + cost() + "руб.");
    }

    @Override
    public void license() {
        System.out.println("Нужны права для вождения? " + license);
    }

    @Override
    public void numberOfPeople() {
        System.out.println("Вмещаемость = " + numberOfPeople);
    }

    public void wheels(){
        System.out.println("Есть колеса? " + wheels);
    }

}
