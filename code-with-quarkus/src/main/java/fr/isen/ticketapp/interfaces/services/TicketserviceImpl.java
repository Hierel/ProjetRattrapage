package fr.isen.ticketapp.interfaces.services;

import fr.isen.ticketapp.interfaces.models.TicketModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TicketserviceImpl implements Ticketservice {

    private List<TicketModel> tickets = new ArrayList<>();

    @Override
    public List<TicketModel> getAllTicket() {
        return tickets;
    }

    @Override
    public TicketModel addTicket(TicketModel ticketModel) {
        tickets.add(ticketModel);
        return ticketModel;
    }

    @Override
    public void updateTicket(TicketModel ticketModel) {
        Optional<TicketModel> existingTicket = tickets.stream()
                .filter(ticket -> ticket.id == ticketModel.id)
                .findFirst();

        existingTicket.ifPresent(ticket -> {
            ticket.impact = ticketModel.impact;
            ticket.titre = ticketModel.titre;
            ticket.description = ticketModel.description;
            ticket.etat = ticketModel.etat;
            ticket.user_creator = ticketModel.user_creator;
            ticket.poste_informatique = ticketModel.poste_informatique;
            ticket.type_demande = ticketModel.type_demande;
        });
    }

    @Override
    public TicketModel getOneTicket(int id) {
        return tickets.stream()
                .filter(ticket -> ticket.id == id)
                .findFirst()
                .orElse(null);  // Retourne null si le ticket n'existe pas
    }
}
