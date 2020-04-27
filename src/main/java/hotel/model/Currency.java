/**
 * \brief Класс валюты
 * Данный класс используется для отображения цены в заданой валюте
 */
package hotel.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Currency {
    private int id;
    private String name;
    private double value;

}
