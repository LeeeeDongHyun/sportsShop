//package project.sportsshop.entity;
//
//import lombok.Data;
//
//import javax.persistence.*;
//
//@Data
//@Entity
//public class OrderItem {
//
//    @Id@GeneratedValue
//    @Column(name = "order_item_id")
//    private int id;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "item_id")
//    private Item item;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "order_id")
//    private Order order;
//
//    private int orderPrice;
//
//    private int count;
//
//    public static OrderItem createOrderItem(Item item, int count){
//
//        OrderItem orderItem = new OrderItem();
//        orderItem.setItem(item);
//        orderItem.setCount(count);
//        orderItem.setOrderPrice(item.getPrice());
//
//        return orderItem;
//
//
//    }
//    public int getTotalPrice(){
//        return orderPrice*count;
//    }
//
//    public static OrderItem createOrderItem;
//
//
//}
