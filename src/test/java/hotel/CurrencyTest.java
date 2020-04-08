package hotel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CurrencyTest {
    @Test
    public void createCurrencyObjectTest(){

        Currency currency = new Currency();

        currency.setId(1);
        currency.setName("UAH");
        currency.setValue(27.55);

        assertEquals(currency.getId(), 1);
        assertEquals(currency.getName(), "UAH");
        assertEquals(currency.getValue(), 27.55,0.1);
    }
}
