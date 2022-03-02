package main;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Bookingid {

    private int bookingid;
    private Booking booking;

    public Bookingid() {
    }
}
