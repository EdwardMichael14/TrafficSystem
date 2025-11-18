package data.models;

import java.time.LocalDateTime;

public class Ticket {
    private Vehicle vehicle;
    private int id;
    private Offence offence;
    private Officer issuer;
    private LocalDateTime dateOfBooking = LocalDateTime.now();
    private LocalDateTime dateOfPayment = LocalDateTime.now();
    private boolean hasPaid;
    private Officer paidOfficer;

    public Officer getPaidOfficer() {
        return paidOfficer;
    }

    public void setPaidOfficer(Officer paidOfficer) {
        this.paidOfficer = paidOfficer;
    }

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
