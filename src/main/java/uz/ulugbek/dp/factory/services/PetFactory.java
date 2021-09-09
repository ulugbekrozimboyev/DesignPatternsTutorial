package uz.ulugbek.dp.factory.services;

import org.springframework.stereotype.Component;
import uz.ulugbek.dp.factory.dto.Cat;
import uz.ulugbek.dp.factory.dto.Dog;
import uz.ulugbek.dp.factory.dto.Pet;

/**
 * Author: Ulug'bek Ro'zimboyev  <ulugbekrozimboyev@gmail.com>
 * Date: 9/9/2021 11:12 PM
 */
@Component
public class PetFactory {

    public Pet createPet(String type){
        switch (type.toLowerCase()) {
            case "dog" : return new Dog();
            case "cat" : return new Cat();
            default: throw new UnsupportedOperationException("unknown type of animals");
        }
    }

}
