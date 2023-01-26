package project.sportsshop.service;

import org.springframework.stereotype.Service;
import project.sportsshop.dto.OrderDto;
import project.sportsshop.entity.Item;
import project.sportsshop.entity.Order;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

@Transactional
@Service
public class OrderService {

     /*   public int order(OrderDto orderDto, String email){

            Item item = itemRepository.findById(orderDto.getItemId())
                    .orElseThrow(EntityNotFoundException::);

                Order order = new Order(order);
            return order.getId();
        }
*/
}
