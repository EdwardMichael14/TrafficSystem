package data.models;

import java.time.LocalDateTime;

public class Ticket {
    public Vehicle vehicle;
    public int id;
    public Offence offence;
    public Officer issuer;
    public LocalDateTime dateOfBooking = LocalDateTime.now();
    public LocalDateTime dateOfPayment = LocalDateTime.now();
    public boolean hasPaid;


    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Offence getOffence() {
        return offence;
    }

    public void setOffence(Offence offence) {
        this.offence = offence;
    }

    public Officer getIssuer() {
        return issuer;
    }

    public void setIssuer(Officer issuer) {
        this.issuer = issuer;
    }

    public LocalDateTime getDateOfBooking() {
        return dateOfBooking;
    }

    public boolean isHasPaid() {
        return hasPaid;
    }

    public void setHasPaid(boolean hasPaid) {
        this.hasPaid = hasPaid;
    }

    public LocalDateTime getDateOfPayment() {
        return dateOfPayment;
    }

}
