package project.sportsshop.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "orders")
@Data
public class Order {

    @Id
    @GeneratedValue
    @Column(name = "order_id")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true )
    private List<OrderItem> orderItems = new ArrayList<>();

    public void addOrderItem(OrderItem orderItem) {
        orderItems.add(orderItem);
        orderItem.setOrder(this);
    }

    public static Order createOrder(User user, List<OrderItem> orderItemList) {
        Order order = new Order();
        order.setUser(user);
        for (OrderItem orderItem : orderItemList) {
            order.addOrderItem(orderItem);
        }
        return order;
    }

    public static Order createOrder(User user) {
        Order order = new Order();
        order.setUser(user);
        return order;
    }

    public int getTotalPrice(){

        int totalPrice =0 ;
        for(OrderItem orderItem : orderItems){

            totalPrice += orderItem.getTotalPrice();
        }
        return totalPrice;
    }

   /* public void cancelOrder(){
        this.order      주문삭제 버튼
    }*/
}
