/**
 * \brief Класс валюты
 * Данный класс используется для отображения цены в заданой валюте
 */
package hotel;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class Currency {
    private int id;
    private String name;
    private double value;

}
