/**
 *  \brief Класс резерва
 *
 * Данный класс используется для создания резерва номера в отеле
 * \param id уникальный номер резерва
 * \param user класс пользователя, который хочет сделать резерв
 * \param hotel класс отеля, в котором нужно сделать резерв
 *
 */
package hotel;

public class Reservation {
    private int id;
    private User user;
    private Hotel hotel;

    public Reservation(int id, User user, Hotel hotel) {
        this.id = id;
        this.user = user;
        this.hotel = hotel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    /**
     * Создает резерв на основе данных
     * @param reservation данные про отель
     */

    public void makeReservation(Reservation reservation){

    }

}
