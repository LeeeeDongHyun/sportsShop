package project.sportsshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.sportsshop.dto.ItemFormDto;
import project.sportsshop.entity.Item;
import project.sportsshop.repository.ItemRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public  List<Item> index() {
        return itemRepository.findAll();
    }

        public Item show(int id){
        return itemRepository.findById(id).orElse(null);
        }
}
