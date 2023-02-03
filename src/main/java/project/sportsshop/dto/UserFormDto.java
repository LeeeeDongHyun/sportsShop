package project.sportsshop.dto;


import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;


@Getter
@Setter
public class UserFormDto {

    @NotBlank(message = "아이디는 필수 입력 값입니다.")
    private String id;

    @NotBlank(message = "이름은 필수 입력 값입니다.")
    private String name;

    @NotEmpty(message ="이름은 필수 입력 값입니다.")
    @Email(message = "이메일 형식으로 입력해주세요.")
    private String email;

    @NotEmpty(message = "비밀번호는 필수 입력 값입니다.")
    private String password;

    @NotEmpty(message = "비밀번호 확인은 필수 항목입니다.")
    private String password2;



    @NotEmpty(message = "주소는 필수 입력 값입니다.")
    private String address;


    private String number;



}
