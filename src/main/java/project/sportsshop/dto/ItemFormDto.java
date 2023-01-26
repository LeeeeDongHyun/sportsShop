package project.sportsshop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;
import project.sportsshop.entity.Item;

import java.util.ArrayList;
import java.util.List;

@Getter
@ToString
@AllArgsConstructor
public class  ItemFormDto {

    private  int id;

    private String itemNm;

    private Integer price;

    private String itemUrl;

    private List<ItemFormDto> itemDtoList = new ArrayList<>();

   // private static ModelMapper modelMapper = new ModelMapper();

   /* public Item createItem(){

        return modelMapper.map(this,Item.class);
    }
    public static ItemFormDto of(Item item){

        return modelMapper.map(item, ItemFormDto.class);
    } */
    public Item toEntity() {
        return new Item(id,itemNm,price,itemUrl);
    }
}
