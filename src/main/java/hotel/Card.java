/**
 *\brief Класс карты
 * Данный класс используется для работы с картой
 * \param id  уникальный id номер для каждой карты
 * \param number номер карты
 * \param user пользователь, которому принадлежит данная карта
 */

package hotel;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class Card {
    private int id;
    private int number;
    private User user;
}
