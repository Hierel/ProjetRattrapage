package fr.isen.ticketapp.interfaces;

import fr.isen.ticketapp.interfaces.models.TicketModel;
import fr.isen.ticketapp.interfaces.services.Ticketservice;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;

@Path("/tickets")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TicketModelResource {

    @Inject
    Ticketservice ticketService;

    @GET
    public List<TicketModel> getAllTickets() {
        return ticketService.getAllTicket();
    }

    @GET
    @Path("/{id}")
    public Response getTicketById(@PathParam("id") int id) {
        TicketModel ticket = ticketService.getOneTicket(id);
        if (ticket == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        return Response.ok(ticket).build();
    }

    @POST
    public Response addTicket(TicketModel ticket) {
        TicketModel createdTicket = ticketService.addTicket(ticket);
        return Response.status(Response.Status.CREATED).entity(createdTicket).build();
    }

    @PUT
    @Path("/{id}")
    public Response updateTicket(@PathParam("id") int id, TicketModel ticket) {
        ticket.id = id;
        ticketService.updateTicket(ticket);
        return Response.ok().build();
    }

    @DELETE
    @Path("/{id}")
    public Response removeTicket(@PathParam("id") int id) {
        ticketService.updateTicket(null); // Adjust as necessary if a delete method is available
        return Response.noContent().build();
    }
}
