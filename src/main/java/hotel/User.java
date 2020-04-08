package hotel;

import java.util.List;

/**
 * \brief Класс пользователя
 *
 * Данный класс используется при создании пользователя и при резервировании номера в отеле. Использует
 * такие параметры:
 * \param id  уникальный id номер для каждого пользователя
 * \param name имя пользователя
 * \param surname фамилия пользователя
 * \param email email пользователя
 * \param  cards карты пользователя
 *
 */

public class User {
    private int id;
    private String name;
    private String surname;
    private String email;
    private List<Card> cards;

    public User(){
    }

    public User(int id, String name, String surname, String email, List<Card> cards) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.cards = cards;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
}
