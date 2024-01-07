package tn.polytech.ordersservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.polytech.ordersservice.entities.Orders;
import tn.polytech.ordersservice.interfaces.ICancelOrderService;
import tn.polytech.ordersservice.repositories.OrdersRepository;

@Service
public class CancelOrderServiceImpl implements ICancelOrderService {
    private final OrdersRepository ordersRepository;

    @Autowired
    public CancelOrderServiceImpl(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    @Override
    public Orders cancelOrder(Long orderId) {
        Orders existingOrder = ordersRepository.findById(orderId).orElse(null);

        if (existingOrder != null) {
            existingOrder.setState("canceled");
            return ordersRepository.save(existingOrder);
        }

        return null;
    }

}

