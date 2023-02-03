package project.sportsshop.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import project.sportsshop.dto.UserFormDto;
import project.sportsshop.entity.User;
import project.sportsshop.repository.UserRepository;
import project.sportsshop.service.UserService;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;
import java.util.Map;

@Controller
@Slf4j
@RequiredArgsConstructor
public class UserController {


    @Autowired
    private  UserRepository userRepository;

    private final UserService userService;

//    @Autowired
//    private PasswordEncoder passwordEncoder;




    @GetMapping("/User/Login")
    public String login() {

        return "/User/Login";
    }

    @GetMapping("/User/Join")
    public String join(Model model){
        model.addAttribute("userFormDto", new UserFormDto());
        System.out.println("회원가입");
        return "/User/Join";
    }

    @PostMapping("/User/Join")
    public String join(@Valid UserFormDto userFormDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {

            return "/User/Join";

        }

        if(!userFormDto.getPassword().equals(userFormDto.getPassword2())){
            bindingResult.rejectValue("password2","passwordInCorrect",
                    "2개의 패스워드가 일치하지 않습니다.");
            return "/User/Join";
        }
        userService.join(userFormDto.getId(),
                userFormDto.getPassword(),
                userFormDto.getName(),
                userFormDto.getNumber(),
                userFormDto.getAddress(),
                userFormDto.getEmail());

        return "redirect:/User/Login";
        System.out.println(getId());
    }

    public String list(Model model){
        List<User> users = userService.findAll();
        model.addAttribute("users",users);
        return "User/userList";
    }

}
