package hotel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LanguageTest {

    @Test
    public void createLanguageObjectTest() {
        Language language = new Language();

        language.setId(1);
        language.setName("English");

        assertEquals(language.getId(), 1);
        assertEquals(language.getName(), "English");
    }
}
