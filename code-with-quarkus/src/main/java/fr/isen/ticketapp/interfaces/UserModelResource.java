package fr.isen.ticketapp.interfaces;

import fr.isen.ticketapp.interfaces.models.UserModel;
import fr.isen.ticketapp.interfaces.services.Userservice;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserModelResource {

    @Inject
    Userservice userService;

    @GET
    public List<UserModel> getAllUsers() {
        return userService.getAllUser();
    }

    @GET
    @Path("/{id}")
    public Response getUserById(@PathParam("id") int id) {
        UserModel user = userService.getOneUser(id);
        if (user != null) {
            return Response.ok(user).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @POST
    public Response addUser(UserModel user) {
        UserModel createdUser = userService.addUser(user);
        return Response.status(Response.Status.CREATED).entity(createdUser).build();
    }

    @PUT
    public Response updateUser(UserModel user) {
        userService.updateUser(user);
        return Response.ok().build();
    }

    @DELETE
    @Path("/{id}")
    public Response removeUser(@PathParam("id") int id) {
        userService.removeUser(id);
        return Response.noContent().build();
    }
}
