package fr.isen.ticketapp.interfaces.services;

import java.util.List;
import fr.isen.ticketapp.interfaces.models.TicketModel;

//begin of modifiable zone(Javadoc).......C/0be4ac75-b716-4397-88b4-0ffea495578d

//end of modifiable zone(Javadoc).........E/0be4ac75-b716-4397-88b4-0ffea495578d
public interface Ticketservice {
//begin of modifiable zone(Javadoc).......C/2d45ca70-19d3-4be5-aa06-27fe1f0160c5

//end of modifiable zone(Javadoc).........E/2d45ca70-19d3-4be5-aa06-27fe1f0160c5
    List<TicketModel> getAllTicket();

//begin of modifiable zone(Javadoc).......C/c0a7599f-d156-4dfa-80e1-ba1cd9741244

//end of modifiable zone(Javadoc).........E/c0a7599f-d156-4dfa-80e1-ba1cd9741244
    TicketModel addTicket(final TicketModel ticketModel);

//begin of modifiable zone(Javadoc).......C/8565d2c2-d09a-4bb4-8a36-6908016fbed0

//end of modifiable zone(Javadoc).........E/8565d2c2-d09a-4bb4-8a36-6908016fbed0
    void updateTicket(final TicketModel ticketModel);

//begin of modifiable zone(Javadoc).......C/132b3b0d-82de-4f58-bfad-86f100a0fd07

//end of modifiable zone(Javadoc).........E/132b3b0d-82de-4f58-bfad-86f100a0fd07
    TicketModel getOneTicket(final int id);

}
