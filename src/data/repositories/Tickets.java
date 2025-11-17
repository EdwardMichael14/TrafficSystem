package data.repositories;

import data.models.Ticket;
import data.models.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tickets implements TicketRepository {

    private static List<Ticket> tickets = new ArrayList<>();
    private int generateId;
    private static int count;


    @Override
    public Ticket save(Ticket ticket) {

        if (ticket.getId() == 0) {
            ticket.setId(generateId());
            tickets.add(ticket);
            count++;
        } else {
            for (Ticket ticket2 : tickets) {
                if (ticket.getId() == ticket2.getId()) {
                    ticket2 = ticket;
                    break;
                }
            }
        }
        return ticket;
    }

    @Override
    public Ticket findById(int id) {
        for (Ticket ticket : tickets) {
            if(ticket.getId() == id) {
                return ticket;

            }

        }
        throw new IllegalArgumentException("Ticket with id " + id + " not found");
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
                break;
            }

        }
        count --;

    }



    @Override
    public void deleteAll() {
        count = 0;
        tickets.clear();

    }

    @Override
    public void deleteTicket(Ticket ticket) {
        for (Ticket ticket1 : tickets) {
            if (ticket1 == ticket) {
                tickets.remove(ticket);
                break;
            }
        }
        count--;
    }

    @Override
    public long count() {
        return tickets.size();

    }

    private int generateId() {
        generateId++;
        return generateId;
    }




}
