package services;

import data.repositories.*;
import dtos.requests.IssueTicketRequest;
import dtos.requests.RegisterOfficerRequest;
import dtos.requests.RegisterVehicleRequest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketServicesImplTest {
    private TicketServicesImpl ticketServices;
    private VehicleServiceImpl vehicleService;
    private OfficerServicesImpl officerServices;
    private TicketRepository ticketRepository;

    @BeforeEach
    void setUp() {
        ticketServices = new TicketServicesImpl();
        vehicleService = new VehicleServiceImpl();
        officerServices = new OfficerServicesImpl();
        ticketRepository = new Tickets();
    }

    @AfterEach
    void tearDown() {
        ticketRepository.deleteAll();
    }

    @Test
    public void set(){
        RegisterVehicleRequest request = new RegisterVehicleRequest();
        request.setChasisNumber("44441442");
        RegisterOfficerRequest request1 = new RegisterOfficerRequest();
        request1.setEmail("adewale");
        vehicleService.register(request);
        officerServices.registerOfficer(request1);
        IssueTicketRequest request2 = new IssueTicketRequest();
        request2.setOfficerEmail("adewale");
        request2.setOffence("ONE_WAY");
        request2.setVehicleId(1);
        ticketServices.issueTicket(request2);
        assertEquals(1,ticketRepository.count());
    }

    @Test
    public void testNotregistered(){
        RegisterVehicleRequest request = new RegisterVehicleRequest();
        request.setChasisNumber("44441441");

        RegisterOfficerRequest request1 = new RegisterOfficerRequest();
        request1.setEmail("adewale");

        vehicleService.register(request);
        officerServices.registerOfficer(request1);

        IssueTicketRequest request2 = new IssueTicketRequest();
        request2.setOfficerEmail("adewale");
        request2.setOffence("ONE_WAY");
        request2.setVehicleId(2);

        ticketServices.issueTicket(request2);
        assertThrows(IllegalArgumentException.class, () ->  ticketServices.issueTicket(request2) );
    }





}