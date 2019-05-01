package com.booking;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RoomBookingService {

    private Connection connect = new DatabaseConnectionManager().getConnection();

    public ArrayList<Booking> getAllBookedRooms() {

        ArrayList<Booking> listOfBookings = new ArrayList<Booking>();

        try {
            PreparedStatement ps
                    = connect.prepareStatement("select * from booking");

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Booking booking = new Booking();
                booking.setBooking_id(rs.getInt(1));
                booking.setGuest_name(rs.getString(2));
                booking.setRoomType(rs.getString(3));
                booking.setFromDate(rs.getString(4));
                booking.setToDate(rs.getString(5));

                listOfBookings.add(booking);
            }

            connect.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listOfBookings;

    }

    public Booking getBooking(int boooking_id) {

        Booking booking = new Booking();

        try {
            PreparedStatement ps
                    = connect.prepareStatement("select * from booking where booking_id=" + boooking_id);

            ResultSet rs = ps.executeQuery();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return booking;

    }

    public int addBooking(){
        return 0;
    }

    public void updateBooking(int boooking_id){

    }

    public void deleteBooking(int boooking_id){

    }
}
