package project.sportsshop.entity;

import lombok.*;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
import project.sportsshop.dto.UserFormDto;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

//import org.springframework.security.crypto.password.PasswordEncoder;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="user")
@Getter
@Setter
@Builder
public class User {

    @Id
    @Column(name="user_id")
    private String id;
    @Column
    private String password;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String number;

    @Column
    private String address;



    public User createUser(UserFormDto userFormDto){
        User user = new User();
        user.setId(userFormDto.getId());
        user.setPassword(password);
        user.setName(userFormDto.getName());
        user.setEmail(userFormDto.getEmail());
        user.setNumber(userFormDto.getNumber());
        user.setAddress(userFormDto.getAddress());

        return user;
    }


//    public User login(UserFormDto userFormDto){
//        User user = new User();
//        user.setId(userFormDto.getId());
//        user.setPassword(password);
//        return user;
//    }
}
