package uz.ulugbek.dp.structuralpatterns.adapter;

/**
 * Author: Ulug'bek Ro'zimboyev  <ulugbekrozimboyev@gmail.com>
 * Date: 9/13/2021 1:39 PM
 */
public class AppleAdapter implements Apple {

    private final Orange orange;

    public AppleAdapter(Orange orange) {
        super();
        this.orange = orange;
    }

    @Override
    public String getVariety() {
        return orange.getVariety();
    }

    @Override
    public void eat() {
        orange.peel();
        orange.eat();
    }
}
