/**
 * \brief Класс номера отеля
 * Данный класс отвечает за информацию про номер отеля
 *
 * \param id  уникальный id номер для каждого номера
 * \param number номер комнаты
 * \param type тип комнаты
 * \param price цена за комнату
 *
 */
package hotel;

public class Room {
    private int id;
    private int number;
    private String type;
    private int price;

    public Room(){

    }

    public Room(int id, int number, String type, int price) {
        this.id = id;
        this.number = number;
        this.type = type;
        this.price = price;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
