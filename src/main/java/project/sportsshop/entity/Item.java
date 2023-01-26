package project.sportsshop.entity;

import lombok.*;
import project.sportsshop.dto.ItemFormDto;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "item")
@ToString
@Getter
public class Item {

    @Column(name="item_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;   //상품 코드

    @Column( nullable = false, length =50)
    private String itemNm; //상품명

    @Column(nullable = false)
    private int price;

    @Column
    private String imgUrl;





    public void updateItem(ItemFormDto itemFormDto){
        this.itemNm = itemFormDto.getItemNm();
        this.price = itemFormDto.getPrice();
    }


}
