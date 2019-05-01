package com.booking;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;

@Path("booking")
public class RoomBookingController {

    private RoomBookingService bookingService = new RoomBookingService();

    @GET
    @Path("all")
    @Produces ( MediaType.APPLICATION_JSON )
    public ArrayList<Booking> get() {

        return bookingService.getAllBookedRooms();
    }

    /*
    @GET
    @Path("{id}")
    @Produces ( MediaType.APPLICATION_JSON )
    public Training getTraining( @PathParam("id") int id ) {

        bookingService.getBooking(id);
    }

    @PUT
    @Produces ( MediaType.APPLICATION_JSON )
    public void updateTraining(int id) {
        bookingService.updateBooking(id);
    }

    @POST
    @Produces ( MediaType.APPLICATION_JSON )
    public int addTraining(Booking booking) {
        return bookingService.addBooking();
    }

    @DELETE
    @Path("{id}")
    @Produces ( MediaType.APPLICATION_JSON )
    public void deleteTraining( @PathParam("id") int id ) {
        return bookingService.deleteBooking(id);
    }
    */
}
