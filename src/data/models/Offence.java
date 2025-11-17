package data.models;

public enum Offence {

    ONE_WAY(40.00),
    DRUNK_DRIVING(70.00),
    NO_SEAT_BELT(100),
    OVER_SPEEDING(80.00);

    public double price;

    Offence(double price) {
        this.price = price;
    }
}
