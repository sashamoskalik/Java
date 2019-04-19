package by.bsu.lab6;

public class Tram extends PublicTransport {
    public Tram(String typeOfTransport, String license, int numberOfPeople, String wheels) {
        super(typeOfTransport, license, numberOfPeople, wheels);
    }

    @Override
    double cost() {
        return 0.60;
    }

    @Override
    int route() {
        return 10;
    }
}
