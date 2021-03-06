package com.nastia.hotel;

import com.nastia.hotel.model.Card;
import com.nastia.hotel.model.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    @Test
    public void createCardObjectTest(){
        Card card = Card.builder().build();
        Card card1 = Card.builder().id(1L).number(10).build();
        User user = User.builder().build();
        card.setId(1L);
        card.setNumber(1234);
        card.setUser(user);

        assertEquals(card1.getId(), new Long(1));
        assertEquals(card.getNumber(), 1234);
        assertEquals(card.getUser(), user);
    }
}

