package project.sportsshop.service;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.sportsshop.entity.User;
import project.sportsshop.repository.UserRepository;


import java.util.List;


@RequiredArgsConstructor
@Service
public class UserService {


        private final UserRepository userRepository;

        public User join(String id, String password, String name, String number, String address,String email){
                User user = new User();
                user.setId(id);
                user.setPassword(password);
                user.setName(name);
                user.setNumber(number);
                user.setAddress(address);
                user.setEmail(email);
                this.userRepository.save(user);
                return user;
        }




        public List<User> findAll(){
                return userRepository.findAll();
        }


//        @Override
//        public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
//                User user = sqlSession.selectOne("user.getUser", id);
//                if(user == null){
//                        throw new UsernameNotFoundException("해당유저를 찾을 수 없습니다.");
//                }
//                return user;
//        }
}
