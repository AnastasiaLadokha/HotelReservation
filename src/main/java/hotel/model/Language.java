package hotel.model;

import lombok.Builder;
import lombok.Data;

/**
 * \brief Класс языка страницы
 * Данный класс используется для изменения языка информации на странице
 */

@Data
@Builder
public class Language {
    private int id;
    private String name;

}
