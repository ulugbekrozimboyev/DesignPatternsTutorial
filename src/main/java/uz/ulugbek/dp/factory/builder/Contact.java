package uz.ulugbek.dp.factory.builder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author: Ulug'bek Ro'zimboyev  <ulugbekrozimboyev@gmail.com>
 * Date: 9/9/2021 11:42 PM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contact {

    private String firsname;
    private String lastname;
    private String emailAddress;
}
