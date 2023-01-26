package project.sportsshop.dto;

import lombok.Data;


import javax.validation.constraints.NotNull;

@Data
public class OrderDto {

    @NotNull(message = "상품 아이디는 필수 입력 값입니다.")
    private int itemId;

    private int count;



}
