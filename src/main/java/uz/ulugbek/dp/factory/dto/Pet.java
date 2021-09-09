package uz.ulugbek.dp.factory.dto;

import java.util.List;

/**
 * Author: Ulug'bek Ro'zimboyev  <ulugbekrozimboyev@gmail.com>
 * Date: 9/9/2021 11:10 PM
 */
public interface Pet {

    void setName(String name);
    String getName();
    String getType();
    boolean isHungry();
    void feed();

}
