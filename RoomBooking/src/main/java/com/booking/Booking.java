package com.booking;

public class Booking {

    public int getBooking_id() {
        return booking_id;
    }

    private int booking_id;

    public String getGuest_name() {
        return guest_name;
    }

    public String getRoom_type() {
        return room_type;
    }

    public String getFromDate() {
        return fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    private String guest_name;
    private String room_type;
    private String fromDate;
    private String toDate;


    public Booking() {
        this.booking_id = 0;
        this.guest_name = "";
        this.room_type = "";
        this.fromDate = "";
        this.toDate = "";
    }

    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    public void setGuest_name(String guest_name) {
        this.guest_name = guest_name;
    }

    public void setRoomType(String room_type) {
        this.room_type = room_type;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public void setToDate(String toDate) {
        this.fromDate = toDate;
    }
}
