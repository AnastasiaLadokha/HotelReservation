package hotel;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    @Test
    public void createHotelObjectTest() {
        Hotel hotel = new Hotel();

        hotel.setId(1);
        hotel.setName("A-travel");
        hotel.setDistanceToCenter("1км");
        hotel.setPhoneNumber("+380-93-777-11-11");
        List<Room> rooms = new ArrayList<>();
        rooms.add(new Room());
        hotel.setRooms(rooms);
        Service service = new Service();
        hotel.setService(service);
        hotel.setStars(5);

        assertEquals(hotel.getId(),1);
        assertEquals(hotel.getDistanceToCenter(), "1км");
        assertEquals(hotel.getName(), "A-travel");
        assertEquals(hotel.getPhoneNumber(), "+380-93-777-11-11");
        assertEquals(hotel.getRooms(), rooms);
        assertEquals(hotel.getService(), service);
        assertEquals(hotel.getStars(), 5);
    }
}
