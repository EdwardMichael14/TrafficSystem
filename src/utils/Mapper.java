package utils;

import data.models.Officer;
import data.models.Owner;
import data.models.Ticket;
import data.models.Vehicle;
import dtos.requests.IssueTicketRequest;
import dtos.requests.RegisterOfficerRequest;
import dtos.requests.RegisterVehicleRequest;

public class Mapper {

    public static Vehicle map(RegisterVehicleRequest request){
        Vehicle vehicle = new Vehicle();

        vehicle.setName(request.getVehicleName());
        vehicle.setYear(request.getProductionYear());
        vehicle.setModel(request.getModel());
        vehicle.setColor(request.getColor());
        vehicle.setChasisNumber(request.getChasisNumber());

        Owner owner = new Owner();
        owner.setEmail(request.getOwnerEmail());
        owner.setAddress(request.getOwnerAddress());
        owner.setName(request.getVehicleName());
        owner.setEmail(request.getOwnerEmail());

        vehicle.setOwner(owner);

        return vehicle;
    }

    public static Officer map(RegisterOfficerRequest request){

        Officer officer = new Officer();
        officer.setName(request.getName());
        officer.setEmail(request.getEmail());

        return officer;
    }



}
