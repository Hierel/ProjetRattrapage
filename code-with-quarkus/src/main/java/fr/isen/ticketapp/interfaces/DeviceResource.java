package fr.isen.ticketapp.interfaces;

import fr.isen.ticketapp.interfaces.models.DeviceModel;
import fr.isen.ticketapp.interfaces.services.Deviceservice;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;

@Path("/devices")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DeviceResource {

    @Inject
    Deviceservice deviceService;

    @GET
    public List<DeviceModel> getAllDevices() {
        return deviceService.getAllDevice();
    }

    @GET
    @Path("/{id}")
    public Response getDeviceById(@PathParam("id") int id) {
        DeviceModel device = deviceService.getOneDevice(id);
        if (device == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        return Response.ok(device).build();
    }

    @POST
    public Response addDevice(DeviceModel device) {
        DeviceModel createdDevice = deviceService.addDevice(device);
        return Response.status(Response.Status.CREATED).entity(createdDevice).build();
    }

    @PUT
    @Path("/{id}")
    public Response updateDevice(@PathParam("id") int id, DeviceModel device) {
        device.id = id;
        deviceService.updateDevice(device);
        return Response.ok().build();
    }

    @DELETE
    @Path("/{id}")
    public Response removeDevice(@PathParam("id") int id) {
        deviceService.removeDevice(id);
        return Response.noContent().build();
    }
}
