package uz.ulugbek.dp.factory.singleton;

/**
 * Author: Ulug'bek Ro'zimboyev  <ulugbekrozimboyev@gmail.com>
 * Date: 9/10/2021 11:06 AM
 */
public class SingA {

    private static SingA instance;

    private SingA(){
        super();
    }

    public static SingA getInstance(){
        if(instance == null) {
            synchronized (SingA.class) {
                instance = new SingA();
            }
        }

        return instance;
    }

}
