package dtos.requests;

import data.models.Owner;

import java.time.Year;

public class RegisterVehicleRequest {
    private String vehicleName;
    private String model;
    private String color;
    private Owner ownerName;
    private Year productionYear;
    private String ownerEmail;
    private String ownerNumber;
    private String ownerAddress;
    private String chasisNumber;

    public Owner getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(Owner ownerName) {
        this.ownerName = ownerName;
    }

    public String getChasisNumber() {
        return chasisNumber;
    }

    public void setChasisNumber(String chasisNumber) {
        this.chasisNumber = chasisNumber;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Owner getOwner() {
        return ownerName;
    }

    public void setOwner(Owner owner) {
        this.ownerName = owner;
    }

    public Year getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(Year productionYear) {
        this.productionYear = productionYear;
    }

    public String getOwnerNumber() {
        return ownerNumber;
    }

    public void setOwnerNumber(String ownerNumber) {
        this.ownerNumber = ownerNumber;
    }

    public String getOwnerEmail() {
        return ownerEmail;
    }

    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
    }

    public String getOwnerAddress() {
        return ownerAddress;
    }

    public void setOwnerAddress(String ownerAddress) {
        this.ownerAddress = ownerAddress;
    }
}
