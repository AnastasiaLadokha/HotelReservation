package hotel;

import hotel.model.Service;
import org.junit.Test;

import static org.junit.Assert.*;

public class ServiceTest {
    @Test
    public void createServiceObjectTest(){
        Service service = Service.builder().build();

        service.setId(1);
        service.setInternet(true);
        service.setBar(false);
        service.setParking(true);
        service.setPool(false);
        service.setRestaurant(true);
        service.setSpa(false);

        assertEquals(service.getId(), 1);
        assertFalse(service.isBar());
        assertTrue(service.isInternet());
        assertTrue(service.isParking());
        assertFalse(service.isPool());
        assertTrue(service.isRestaurant());
        assertFalse(service.isSpa());
    }
}
