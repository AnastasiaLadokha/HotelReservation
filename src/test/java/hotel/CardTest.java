package hotel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    @Test
    public void createCardObjectTest(){
        Card card = new Card();
        card.setId(1);
        card.setNumber(1234);
        card.setUser(new User());

        assertEquals(card.getId(), 1);
        assertEquals(card.getNumber(), 1234);
        assertEquals(card.getUser(), new User());
    }
}