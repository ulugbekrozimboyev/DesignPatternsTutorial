package uz.ulugbek.dp.factory.dto;

/**
 * Author: Ulug'bek Ro'zimboyev  <ulugbekrozimboyev@gmail.com>
 * Date: 9/9/2021 11:18 PM
 */
public class Cat implements Pet {

    private String name;
    private final String type = "dog";

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public boolean isHungry() {
        return false;
    }

    @Override
    public void feed() {

    }
}
