package data.repositories;

import data.models.Ticket;
import data.models.Vehicle;

import java.util.List;

public interface TicketRepository {

    Ticket save(Ticket tickets);
    Ticket findById(int id);
    List<Ticket> findAll();
    void deleteById(int id);
    void deleteAll();
    void deleteTicket(Ticket ticket);
    long count();
}
