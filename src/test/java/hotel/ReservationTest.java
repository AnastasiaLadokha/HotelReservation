package hotel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReservationTest {
    @Test
    public void createReservationObjectTest() {
        Reservation reservation = new Reservation();

        reservation.setId(1);
        reservation.setUser(new User());
        reservation.setHotel(new Hotel());

        assertEquals(reservation.getId(), 1);
        assertEquals(reservation.getUser(), new User());
        assertEquals(reservation.getHotel(), new Hotel());
    }
}
