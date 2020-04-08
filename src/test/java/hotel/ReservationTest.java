package hotel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReservationTest {
    @Test
    public void createReservationObjectTest() {
        Reservation reservation = new Reservation();
        User user = new User();
        Hotel hotel = new Hotel();

        reservation.setId(1);
        reservation.setUser(user);
        reservation.setHotel(hotel);

        assertEquals(reservation.getId(), 1);
        assertEquals(reservation.getUser(), user);
        assertEquals(reservation.getHotel(), hotel);
    }
}
