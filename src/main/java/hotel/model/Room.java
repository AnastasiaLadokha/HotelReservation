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
package hotel.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Room {
    private int id;
    private int number;
    private String type;
    private int price;


}
