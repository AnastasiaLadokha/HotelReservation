package hotel;

import java.util.List;

/**
 * \brief Класс отвечающий за наличие сервисов в отеле
 * \param internet есть или нет интернет в отеле
 * \param bar есть или нет бар в отеле
 * \param restaurant есть или нет ресторан в отеле
 * \param spa есть или нет спа в отеле
 * \param pool есть или нет бассейн в отеле
 * \param parking есть или нет парковка в отеле
 */

public class Service {
    private int id;
    private boolean internet;
    private boolean bar;
    private boolean restaurant;
    private boolean spa;
    private boolean pool;
    private boolean parking;

    public Service(int id, boolean internet, boolean bar, boolean restaurant, boolean spa, boolean pool, boolean parking) {
        this.id = id;
        this.internet = internet;
        this.bar = bar;
        this.restaurant = restaurant;
        this.spa = spa;
        this.pool = pool;
        this.parking = parking;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isInternet() {
        return internet;
    }

    public void setInternet(boolean internet) {
        this.internet = internet;
    }

    public boolean isBar() {
        return bar;
    }

    public void setBar(boolean bar) {
        this.bar = bar;
    }

    public boolean isRestaurant() {
        return restaurant;
    }

    public void setRestaurant(boolean restaurant) {
        this.restaurant = restaurant;
    }

    public boolean isSpa() {
        return spa;
    }

    public void setSpa(boolean spa) {
        this.spa = spa;
    }

    public boolean isPool() {
        return pool;
    }

    public void setPool(boolean pool) {
        this.pool = pool;
    }

    public boolean isParking() {
        return parking;
    }

    public void setParking(boolean parking) {
        this.parking = parking;
    }

}
