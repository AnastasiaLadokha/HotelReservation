package hotel;

import hotel.model.Card;
import hotel.model.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class UserTest {
    @Test
    public void createUserObjectTest(){
        User user = User.builder().build();

        user.setId(1);
        user.setName("Максим");
        user.setEmail("sssss@gmail.com");
        user.setSurname("Петров");

        List<Card> cards = new ArrayList<>();
        cards.add(Card.builder().build());
        user.setCards(cards);

        assertEquals(user.getId(),1);
        assertEquals(user.getName(),"Максим");
        assertEquals(user.getEmail(),"sssss@gmail.com");
        assertEquals(user.getSurname(),"Петров");
        assertEquals(user.getCards(),cards);
    }
}
