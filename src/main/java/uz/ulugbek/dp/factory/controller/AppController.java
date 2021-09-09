package uz.ulugbek.dp.factory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uz.ulugbek.dp.factory.builder.Contact;
import uz.ulugbek.dp.factory.builder.ContactBuilder;
import uz.ulugbek.dp.factory.dto.Pet;
import uz.ulugbek.dp.factory.services.PetFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Ulug'bek Ro'zimboyev  <ulugbekrozimboyev@gmail.com>
 * Date: 9/9/2021 11:20 PM
 */
@RestController
@RequestMapping("/")
public class AppController {

    @Autowired
    private PetFactory petFactory;

    @PostMapping("adoptPet/{type}/{name}")
    public Pet adoptPet(@PathVariable String type, @PathVariable String name){
        Pet pet = this.petFactory.createPet(type);
        pet.setName(name);

        return pet;
    }

    @GetMapping("presidents")
    public List<Contact> getPresidents(){
        List<Contact> contacts = new ArrayList<>();

        Contact contact = new Contact();
        contact.setFirsname("George");
        contact.setLastname("Washington");
        contacts.add(contact);

        contacts.add(new Contact("John", "Adams", null));

        contacts.add(new ContactBuilder().setFirsname("Thomas").setLastname("Jefferson").buildContact());

        return contacts;
    }

}
