package LastMa.utils;



import LastMa.data.models.Officer;
import LastMa.data.models.Owner;
import LastMa.data.models.Ticket;
import LastMa.data.models.Vehicle;
import LastMa.dtos.requests.RegisterOfficerRequest;
import LastMa.dtos.requests.RegisterVehicleRequest;
import LastMa.dtos.responses.*;

import java.util.List;

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
        owner.setOwnerName(request.getVehicleName());
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


    public static RegisterVehicleResponse map(Vehicle savedVehicle) {
        RegisterVehicleResponse response = new RegisterVehicleResponse();
        response.setId(savedVehicle.getId());
        response.setYear(savedVehicle.getYear());
        response.setName(savedVehicle.getName());
        return response;
    }

    public static RegisterOfficerResponse map(Officer savedOfficer) {
        RegisterOfficerResponse response = new RegisterOfficerResponse();
        response.setName(savedOfficer.getName());
        response.setEmail(savedOfficer.getEmail());
        response.setRank(savedOfficer.getRank());
        response.setId(savedOfficer.getId());
        return response;
    }

    public static IssueTicketResponse map(Ticket issuedTicket) {
        IssueTicketResponse response = new IssueTicketResponse();

        response.setVehicle(issuedTicket.getVehicle());
        response.setOffence(issuedTicket.getOffence());
        response.setIssuer(issuedTicket.getIssuer());
        response.setDateOfBooking(issuedTicket.getDateOfBooking() + " ");
        response.setId(issuedTicket.getId());
        response.setHasPaid(issuedTicket.isHasPaid());
        return response;
    }

    public static SettleTicketResponse mapSettled(Ticket settledTicket){
        SettleTicketResponse response = new SettleTicketResponse();

        response.setVehicleId(settledTicket.getVehicle().getId());
        response.setTicketId(settledTicket.getId());
        response.setOfficerId(settledTicket.getIssuer().getId());
        response.setOffenceFee(settledTicket.getOffence().price);

        return response;

    }

    public static ViewTicketResponse mapView(String tickets){
        ViewTicketResponse response = new ViewTicketResponse();
        response.setTickets(tickets);
        return response;
    }



}
