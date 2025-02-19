package fr.isen.ticketapp.interfaces.services;

import fr.isen.ticketapp.interfaces.models.TicketModel;

import java.util.List;

public class TicketserviceImpl implements Ticketservice {
    @Override
    public List<TicketModel> getAllTicket() {
        return List.of();
    }

    @Override
    public TicketModel addTicket(TicketModel ticketModel) {
        return null;
    }

    @Override
    public void updateTicket(TicketModel ticketModel) {

    }

    @Override
    public TicketModel getOneTicket(int id) {
        return null;
    }
}
