package LastMa.data.models;

public enum Offence {

    ONE_WAY(40_00),
    DRUNK_DRIVING(70_00),
    NO_SEAT_BELT(100),
    OVER_SPEEDING(80_00);

    public double price;

    Offence(double price) {
        this.price = price;
    }
}
