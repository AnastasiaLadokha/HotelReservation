package hotel.model;

import lombok.Builder;
import lombok.Data;

/**
 * \brief Класс отвечающий за наличие сервисов в отеле
 * \param internet есть или нет интернет в отеле
 * \param bar есть или нет бар в отеле
 * \param restaurant есть или нет ресторан в отеле
 * \param spa есть или нет спа в отеле
 * \param pool есть или нет бассейн в отеле
 * \param parking есть или нет парковка в отеле
 */
@Data
@Builder
public class Service {
    private int id;
    private boolean internet;
    private boolean bar;
    private boolean restaurant;
    private boolean spa;
    private boolean pool;
    private boolean parking;

}
