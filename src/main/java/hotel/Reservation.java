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

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class Reservation {
    private int id;
    private User user;
    private Hotel hotel;


    /**
     * Создает резерв на основе данных
     * @param reservation данные про отель
     */

    public void makeReservation(Reservation reservation){

    }

}
