package services;

import data.models.Officer;
import data.models.Owner;
import data.models.Ticket;
import data.models.Vehicle;
import data.repositories.*;
import dtos.requests.RegisterVehicleRequest;
import dtos.requests.SettleTicketRequest;
import dtos.responses.RegisterVehicleResponse;
import dtos.responses.SettleTicketResponse;

import static utils.Mapper.map;

public class VehicleServiceImpl implements VehicleService{
    private VehicleRepositories vehicles = new Vehicles();
    private Officers officers = new Officers();
    private Tickets tickets = new  Tickets();


    @Override
    public RegisterVehicleResponse register(RegisterVehicleRequest request) {

        if(vehicles.findByChasisNumber(request.getChasisNumber()) != null)
            throw new IllegalArgumentException("Vehicle already exists");
        Vehicle vehicle = map(request);
        vehicles.save(vehicle);
        return new RegisterVehicleResponse();
    }

    @Override
    public SettleTicketResponse settleTicket(SettleTicketRequest request) {
        Vehicle vehicle = vehicles.findById(request.getVehicleId());
        Officer officer = officers.findById(request.getOfficerId());
        Ticket ticket = findTicket(vehicle, request);
        ticket.setHasPaid(true);
        ticket.setPaidOfficer(officer);
        tickets.save(ticket);
        return null;
        }


    private Ticket findTicket(Vehicle vehicle, SettleTicketRequest request) {
        for (Ticket ticket : vehicle.getTickets()) {
            if (ticket.getId() == request.getTicketId()) return ticket;
        }
        return null;
    }
}