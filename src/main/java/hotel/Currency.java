/**
 * \brief Класс валюты
 * Данный класс используется для отображения цены в заданой валюте
 */
package hotel;

public class Currency {
    private int id;
    private String name;
    private float value;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public Currency(int id, String name, float value) {
        this.id = id;
        this.name = name;
        this.value = value;
    }
}
