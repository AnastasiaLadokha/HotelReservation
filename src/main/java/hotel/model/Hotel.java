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
package hotel.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@Builder
public class Hotel {
    private int id;
    private String name;
    private int stars;
    private String distanceToCenter;
    private String phoneNumber;
    private Service service;
    private List<Room> rooms;

}
