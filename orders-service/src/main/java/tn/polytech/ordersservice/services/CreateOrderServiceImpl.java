package tn.polytech.ordersservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.polytech.ordersservice.entities.Orders;
import tn.polytech.ordersservice.interfaces.ICreateOrderService;
import tn.polytech.ordersservice.repositories.OrdersRepository;

@Service
public class CreateOrderServiceImpl implements ICreateOrderService {

    private final OrdersRepository ordersRepository;

    @Autowired
    public CreateOrderServiceImpl(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    @Override
    public Orders createOrder(Orders order) {
        return ordersRepository.save(order);
    }
}