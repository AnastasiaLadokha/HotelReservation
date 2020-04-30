package com.nastia.hotel;

import com.nastia.hotel.model.Hotel;
import com.nastia.hotel.model.Room;
import com.nastia.hotel.model.Service;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    @Test
    public void createHotelObjectTest() {
        Hotel hotel = Hotel.builder().build();

        hotel.setId(1);
        hotel.setName("A-travel");
        hotel.setDistanceToCenter("1км");
        hotel.setPhoneNumber("+380-93-777-11-11");
        List<Room> rooms = new ArrayList<>();
        rooms.add(Room.builder().build());
        hotel.setRooms(rooms);
        Service service = Service.builder().build();
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
