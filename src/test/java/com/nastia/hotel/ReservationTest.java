package com.nastia.hotel;

import com.nastia.hotel.model.Hotel;
import com.nastia.hotel.model.Reservation;
import com.nastia.hotel.model.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReservationTest {
    @Test
    public void createReservationObjectTest() {
        Reservation reservation = Reservation.builder().build();
        User user = User.builder().build();
        Hotel hotel = Hotel.builder().build();

        reservation.setId(1);
        reservation.setUser(user);
        reservation.setHotel(hotel);

        assertEquals(reservation.getId(), 1);
        assertEquals(reservation.getUser(), user);
        assertEquals(reservation.getHotel(), hotel);
    }
}
