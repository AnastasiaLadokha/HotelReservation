/**
 *\brief Класс карты
 * Данный класс используется для работы с картой
 * \param id  уникальный id номер для каждой карты
 * \param number номер карты
 * \param user пользователь, которому принадлежит данная карта
 */
package hotel;

public class Card {
    private int id;
    private int number;
    private User user;
    public Card(){
    }

    public Card(int id, int number, User user) {
        this.id = id;
        this.number = number;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
