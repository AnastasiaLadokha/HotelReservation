package hotel;

import hotel.model.Room;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {
    @Test
    public void createRoomObjectTest(){
        Room room = Room.builder().build();

        room.setId(1);
        room.setNumber(10);
        room.setPrice(250);
        room.setType("Стандарт");

        assertEquals(room.getId(),1);
        assertEquals(room.getNumber(),10);
        assertEquals(room.getPrice(),250);
        assertEquals(room.getType(),"Стандарт");
    }
}
