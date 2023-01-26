package project.sportsshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import project.sportsshop.entity.Item;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public interface ItemRepository extends JpaRepository<Item, Integer> {

@Override
ArrayList<Item> findAll();


}
