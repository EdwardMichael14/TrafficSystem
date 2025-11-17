package services;

import data.models.Offence;
import data.models.Officer;
import data.models.Ticket;
import data.models.Vehicle;
import data.repositories.*;
import dtos.requests.IssueTicketRequest;
import dtos.responses.IssueTIcketResponse;

public class TicketServicesImpl implements TicketServices {
    private final VehicleRepositories vehicleRepositories = new Vehicles();
    private final OfficerRepository officerRepository  = new Officers();
    private final TicketRepository ticketRepository = new Tickets();

    @Override
    public IssueTIcketResponse issueTicket(IssueTicketRequest request) {

        Officer officer = officerRepository.findByEmail(request.getOfficerEmail());
        if(officer == null) {
            throw new IllegalArgumentException("Officer not found");
        }
        Vehicle vehicle = vehicleRepositories.findById(request.getVehicleId());
        if(vehicle == null) {
            throw new IllegalArgumentException("Vehicle not found");
        }

        Ticket ticket = new Ticket();
        ticket.setOffence(Offence.valueOf(request.getOffence()));
        ticket.setVehicle(vehicle);
        ticket.setIssuer(officer);
        ticketRepository.save(ticket);
        vehicle.getTickets().add(ticket);
        vehicleRepositories.save(vehicle);
        return null;
    }


}
