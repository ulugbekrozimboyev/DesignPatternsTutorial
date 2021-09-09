package uz.ulugbek.dp.factory.builder;

/**
 * Author: Ulug'bek Ro'zimboyev  <ulugbekrozimboyev@gmail.com>
 * Date: 9/9/2021 11:48 PM
 */
public class ContactBuilder {

    private String firsname;
    private String lastname;
    private String emailAddress;

    public ContactBuilder setFirsname(String firsname) {
        this.firsname = firsname;
        return this;
    }

    public ContactBuilder setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public ContactBuilder setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    public Contact buildContact(){
        return new Contact(firsname, lastname, emailAddress);
    }
}
