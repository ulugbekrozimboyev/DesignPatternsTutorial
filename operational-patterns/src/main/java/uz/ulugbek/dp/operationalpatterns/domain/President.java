package uz.ulugbek.dp.operationalpatterns.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

/**
 * Author: Ulug'bek Ro'zimboyev  <ulugbekrozimboyev@gmail.com>
 * Date: 9/15/2021 9:48 AM
 */
@Data
@Entity
@Table(name = "PRESIDENT")
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class President {

    @Id
    @GeneratedValue
    @Column(name = "PRESIDENT_ID")
    private Long id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "EMAIL_ADDRESS")
    private String emailAddress;

}
