package project.sportsshop.entity;

import lombok.Data;
import lombok.ToString;
import project.sportsshop.dto.UserFormDto;

import javax.persistence.*;

//import org.springframework.security.crypto.password.PasswordEncoder;


@ToString
@Entity
@Table(name="user_id")
@Data
public class User {

    @Id
    @Column(name="user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String name;

    @Column(unique = true)
    private String email;
    private String password;
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
