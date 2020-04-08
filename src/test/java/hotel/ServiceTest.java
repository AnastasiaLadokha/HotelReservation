package hotel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ServiceTest {
    @Test
    public void createServiceObjectTest(){
        Service service = new Service();

        service.setId(1);
        service.setInternet(true);
        service.setBar(false);
        service.setParking(true);
        service.setPool(false);
        service.setRestaurant(true);
        service.setSpa(false);

        assertEquals(service.getId(), 1);
        assertEquals(service.isBar(), false);
        assertEquals(service.isInternet(), true);
        assertEquals(service.isParking(), true);
        assertEquals(service.isPool(), false);
        assertEquals(service.isRestaurant(), true);
        assertEquals(service.isSpa(), false);
    }
}
