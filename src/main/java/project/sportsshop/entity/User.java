package project.sportsshop.entity;

import lombok.*;
import project.sportsshop.dto.UserFormDto;

import javax.persistence.*;

//import org.springframework.security.crypto.password.PasswordEncoder;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="user")
@Getter
@Setter
public class User {

    @Id
    @Column(name="user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String name;

    @Column
    private String email;
    @Column
    private String password;
    @Column
    private String address;

    public static User createUser(UserFormDto userFormDto /*, asswordEncoder passwordEncoder*/){
        User user = new User();
        user.setName(userFormDto.getName());
        user.setEmail(userFormDto.getEmail());
        user.setAddress(userFormDto.getAddress());
        //String password = passwordEncoder.encode(userFormDto.getPassword());
        //user.setPassword(password);
        return user;
    }
}
