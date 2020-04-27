package hotel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    @Test
    public void createCardObjectTest(){
        Card card = new Card();
        Card card1 = Card.builder().id(1).number(10).build();
        User user = new User();
        card.setId(1);
        card.setNumber(1234);
        card.setUser(user);

        assertEquals(card.getId(), 1);
        assertEquals(card.getNumber(), 1234);
        assertEquals(card.getUser(), user);
    }
}

