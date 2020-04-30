package com.nastia.hotel.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * \brief Класс пользователя
 *
 * Данный класс используется при создании пользователя и при резервировании номера в отеле. Использует
 * такие параметры:
 * \param id  уникальный id номер для каждого пользователя
 * \param name имя пользователя
 * \param surname фамилия пользователя
 * \param email email пользователя
 * \param  cards карты пользователя
 *
 */
@Data
@Builder
public class User {
    private int id;
    private String name;
    private String surname;
    private String email;
    private List<Card> cards;

}
