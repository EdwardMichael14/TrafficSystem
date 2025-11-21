package LastMa.services;


import LastMa.data.models.Offence;
import LastMa.data.models.Officer;
import LastMa.data.models.Ticket;
import LastMa.data.models.Vehicle;
import LastMa.data.repositories.OfficerRepository;
import LastMa.data.repositories.TicketRepository;
import LastMa.data.repositories.VehicleRepositories;
import LastMa.dtos.requests.IssueTicketRequest;
import LastMa.dtos.requests.SettleTicketRequest;
import LastMa.dtos.requests.ViewTicketRequest;
import LastMa.dtos.responses.IssueTicketResponse;
import LastMa.dtos.responses.SettleTicketResponse;
import LastMa.dtos.responses.ViewTicketResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.Optional;

import static LastMa.utils.Mapper.*;


@Service
public class TicketServicesImpl implements TicketServices {
    @Autowired
    private VehicleRepositories vehicleRepositories;
    @Autowired
    private OfficerRepository officerRepository ;
    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public IssueTicketResponse issueTicket(IssueTicketRequest request) {

        Optional<Officer> officer = officerRepository.findByEmail(request.getOfficerEmail());
        if(!officer.isPresent()) {
            throw new IllegalArgumentException("Officer not found");
        }
        Optional<Vehicle> vehicle = vehicleRepositories.findById(request.getVehicleId());
        if(!vehicle.isPresent()) {
            throw new IllegalArgumentException("Vehicle not found");
        }

        Ticket ticket = new Ticket();
        ticket.setOffence(Offence.valueOf(request.getOffence()));
        ticket.setVehicle(vehicle.get());
        ticket.setIssuer(officer.get());
        Ticket issuedTicket = ticketRepository.save(ticket);
        vehicle.get().getTickets().add(ticket);
        vehicleRepositories.save(vehicle.get());

        return map(issuedTicket);
    }

    @Override
    public SettleTicketResponse settleTicket(SettleTicketRequest request) {
        Optional<Ticket> foundTicket = ticketRepository.findById(request.getTicketId());
        if(!foundTicket.isPresent()) {
            throw new IllegalArgumentException("Ticket not found");
        }
        if(foundTicket.get().getOffence().price != request.getOffenceFee()){
            throw new IllegalArgumentException("Offence price not match");
        }
        foundTicket.get().setHasPaid(true);
        Ticket settleTicket = ticketRepository.save(foundTicket.get());

        return mapSettled(settleTicket);
    }

    public ViewTicketResponse viewTickets(ViewTicketRequest request) {
        Optional<Vehicle> vehicle = vehicleRepositories.findById(request.getVehicleId());
        if(!vehicle.isPresent()) {
            throw new IllegalArgumentException("Vehicle not found");
        }
        Vehicle foundVehicle = vehicle.get();
        String vehicleTickets = foundVehicle.getTickets() + " ";

        return mapView(vehicleTickets);
    }


}
