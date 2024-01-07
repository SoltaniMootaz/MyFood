package tn.polytech.ordersservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.polytech.ordersservice.interfaces.IReviseOrderService;
import tn.polytech.ordersservice.repositories.OrdersRepository;
import tn.polytech.ordersservice.entities.Orders;

@Service
public class ReviseOrderServiceImpl  implements IReviseOrderService {

    private final OrdersRepository ordersRepository;

    @Autowired
    public ReviseOrderServiceImpl(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    @Override
    public Orders reviseOrder(Long orderId, Orders updatedOrder) {
        Orders existingOrder = ordersRepository.findById(orderId).orElse(null);

        if (existingOrder != null) {
            existingOrder.setState(updatedOrder.getState());
            existingOrder.setConsumerId(updatedOrder.getConsumerId());
            existingOrder.setRestaurantId(updatedOrder.getRestaurantId());
            return ordersRepository.save(existingOrder);
        }

        return null;
    }

}
