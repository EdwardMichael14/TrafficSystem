package data.repositories;

import data.models.Ticket;

import java.util.ArrayList;
import java.util.List;

public class Tickets implements TicketRepository{

    public List<Ticket> tickets = new ArrayList<>();


    @Override
    public Ticket save(Ticket ticket) {
        tickets.add(ticket);
        return ticket;
    }

    @Override
    public Ticket findById(int id) {
        for (Ticket ticket : tickets) {
            if (ticket.getId() == id) {
                return ticket;
            }
        }
        return null;
    }

    @Override
    public List<Ticket> findAll() {
        return tickets;
    }

    @Override
    public void deleteById(int id) {
        for (Ticket ticket : tickets) {
            if (ticket.getId() == id) {
                tickets.remove(ticket);
            }
        }
    }

    @Override
    public void deleteAll() {
        tickets.clear();

    }

    @Override
    public void deleteTicket(Ticket ticket) {
        for (Ticket ticket1 : tickets) {
            if (ticket1 == ticket) {
                tickets.remove(ticket);
            }
        }
    }

    @Override
    public long count() {
        return 0;
    }
}
