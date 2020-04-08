/**
 * \brief Класс отеля
 * Данный класс используется для отображения информации об отеле
 * <p>
 * \param id  уникальный id номер для каждого отеля
 * \param name название отеля
 * \param stars количество звезд отеля
 * \param distanceToCenter расстояние до центра
 * \param phoneNumber телефонный номер отеля
 * \param service класс сервисов
 * \param rooms список номеров отеля
 */
package hotel;

import java.util.List;

public class Hotel {
    private int id;
    private String name;
    private int stars;
    private String distanceToCenter;
    private String phoneNumber;
    private Service service;
    private List<Room> rooms;

    public Hotel() {
    }

    public Hotel(int id, String name, int stars, String distanceToCenter, String phoneNumber, Service service, List<Room> rooms) {
        this.id = id;
        this.name = name;
        this.stars = stars;
        this.distanceToCenter = distanceToCenter;
        this.phoneNumber = phoneNumber;
        this.service = service;
        this.rooms = rooms;
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

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getDistanceToCenter() {
        return distanceToCenter;
    }

    public void setDistanceToCenter(String distanceToCenter) {
        this.distanceToCenter = distanceToCenter;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }
}
