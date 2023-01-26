package project.sportsshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import project.sportsshop.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {




}
