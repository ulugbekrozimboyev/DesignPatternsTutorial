package uz.ulugbek.dp.structuralpatterns.adapter;

/**
 * Author: Ulug'bek Ro'zimboyev  <ulugbekrozimboyev@gmail.com>
 * Date: 9/13/2021 1:41 PM
 */
public class MoroOrange implements Orange {
    @Override
    public String getVariety() {
        return "Moro Blood Orange";
    }

    @Override
    public void eat() {
        System.out.println("Moro gets enjoyed");
    }

    @Override
    public void peel() {
        System.out.println("Moro gets peeled");
    }

    @Override
    public void juice() {
        System.out.println("Moro gets juiced");
    }
}
