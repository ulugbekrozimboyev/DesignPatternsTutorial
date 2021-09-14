package uz.ulugbek.dp.structuralpatterns.decorator;

import java.math.BigDecimal;

/**
 * Author: Ulug'bek Ro'zimboyev  <ulugbekrozimboyev@gmail.com>
 * Date: 9/13/2021 1:51 PM
 */
public abstract class Pizza {

    protected String description;

    public String getDescription() {
        return description;
    }

    public abstract BigDecimal getCost();
}
