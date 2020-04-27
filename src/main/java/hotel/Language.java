package hotel;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * \brief Класс языка страницы
 * Данный класс используется для изменения языка информации на странице
 */

@Data
@Builder
@NoArgsConstructor
public class Language {
    private int id;
    private String name;

}
