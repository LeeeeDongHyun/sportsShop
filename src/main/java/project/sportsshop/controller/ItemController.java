package project.sportsshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import project.sportsshop.entity.Item;
import project.sportsshop.repository.ItemRepository;
import project.sportsshop.service.ItemService;

import java.util.List;


@Controller
public class ItemController {

    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private  ItemService itemService;

    @GetMapping("/Buy")
    public String Buy(Model model){
        //모든 item가져오기
        List<Item> allItemViewList = itemRepository.findAll();
        System.out.println("adfasdfadfad");
        System.out.println(allItemViewList);
        System.out.println("aldfksalkdflakdf");
        //가져온 item 묶음을 뷰로 전달
        model.addAttribute("itemList",allItemViewList );
        return "/Buy/Buy";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable int id, Model model){
        System.out.println("id= " + id);
        Item itemEntity = itemRepository.findById(id).orElse(null);
        System.out.println(itemEntity);
        model.addAttribute("item",itemEntity);

        return "/Buy/ItemBuy";
    }

}
