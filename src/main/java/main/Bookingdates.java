package main;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Bookingdates {

    private String checkin;
    private String checkout;

    public Bookingdates() {
    }
}
