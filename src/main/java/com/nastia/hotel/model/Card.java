/**
 *\brief Класс карты
 * Данный класс используется для работы с картой
 * \param id  уникальный id номер для каждой карты
 * \param number номер карты
 * \param user пользователь, которому принадлежит данная карта
 */

package com.nastia.hotel.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Card {
    private Long id;
    private int number;
    private User user;
}
