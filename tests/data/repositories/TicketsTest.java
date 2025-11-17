package data.repositories;

import data.models.Ticket;
import data.models.Vehicle;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketsTest {

    private TicketRepository tickets;
    private Ticket ticket;

    @BeforeEach
    void setUp() {
        tickets = new Tickets();
        ticket = new Ticket();
    }

    @AfterEach
    void tearDown() {
        tickets.deleteAll();
    }

    @Test
    public void testSaveTicket() {
        Ticket ticket1 = new Ticket();
        tickets.save(ticket1);
        assertEquals(1, tickets.count());
    }

    @Test
    void findById() {
       Ticket ticket1 = new Ticket();
        tickets.save(ticket1);
        Ticket ticket2 = new Ticket();
        tickets.save(ticket2);
        Ticket ticket3 = new Ticket();
        tickets.save(ticket3);
        assertEquals(ticket3, tickets.findById(3));
    }


    @Test
    void deleteById() {

        Ticket ticket1 = new Ticket();
        tickets.save(ticket1);
        Ticket ticket2 = new Ticket();
        tickets.save(ticket2);
        Ticket ticket3 = new Ticket();
        tickets.save(ticket3);
        tickets.deleteById(3);
        assertEquals(2, tickets.count());
    }

    @Test
    void deleteAll() {
        Ticket ticket1 = new Ticket();
        tickets.save(ticket1);
        Ticket ticket2 = new Ticket();
        tickets.save(ticket2);
        Ticket ticket3 = new Ticket();
        tickets.save(ticket3);
        tickets.deleteAll();
        assertEquals(0, tickets.count());
    }

    @Test
    void deleteTicket() {
        Ticket ticket1 = new Ticket();
        tickets.save(ticket1);
        Ticket ticket2 = new Ticket();
        tickets.save(ticket2);
        Ticket ticket3 = new Ticket();
        tickets.save(ticket3);
        tickets.deleteTicket(ticket1);
        assertEquals(2, tickets.count());
    }

    @Test
    void updateTicket() {
        Ticket ticket1 = new Ticket();
        tickets.save(ticket1);
        Ticket ticket2 = new Ticket();
        tickets.save(ticket2);
        tickets.save(ticket2);
        assertEquals(2, tickets.count());
    }

}