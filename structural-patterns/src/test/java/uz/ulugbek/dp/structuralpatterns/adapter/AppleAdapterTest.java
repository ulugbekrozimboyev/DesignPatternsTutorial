package uz.ulugbek.dp.structuralpatterns.adapter;

import org.junit.jupiter.api.Test;

/**
 * Author: Ulug'bek Ro'zimboyev  <ulugbekrozimboyev@gmail.com>
 * Date: 9/13/2021 1:44 PM
 */
public class AppleAdapterTest {

    @Test
    public void testAdapter(){
        Orange orange = new MoroOrange();
        Apple apple = new AppleAdapter(orange);
        System.out.println(apple.getVariety());
        apple.eat();
    }

}
