package tn.polytech.ordersservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.polytech.ordersservice.entities.Orders;
import tn.polytech.ordersservice.services.CancelOrderServiceImpl;
import tn.polytech.ordersservice.services.CreateOrderServiceImpl;
import tn.polytech.ordersservice.services.ReviseOrderServiceImpl;

@RestController
@RequestMapping("/orders")
public class OrdersController {

    private final CancelOrderServiceImpl cancelOrderServiceImpl;
    private final CreateOrderServiceImpl createOrderServiceImpl;
    private final ReviseOrderServiceImpl reviseOrderServiceImpl;


    @Autowired
    public OrdersController(CancelOrderServiceImpl cancelOrderServiceImpl,CreateOrderServiceImpl createOrderServiceImpl, ReviseOrderServiceImpl reviseOrderServiceImpl) {
        this.cancelOrderServiceImpl = cancelOrderServiceImpl;
        this.createOrderServiceImpl = createOrderServiceImpl;
        this.reviseOrderServiceImpl = reviseOrderServiceImpl;
    }

    @PostMapping("/create")
    public Orders createOrder(@RequestBody Orders order) {
        return createOrderServiceImpl.createOrder(order);
    }

    @PostMapping("/cancel/{orderId}")
    public Orders cancelOrder(@PathVariable Long orderId) {
        return cancelOrderServiceImpl.cancelOrder(orderId);
    }

    @PostMapping("/revise/{orderId}")
    public Orders reviseOrder(@PathVariable Long orderId, @RequestBody Orders updatedOrder) {
        return reviseOrderServiceImpl.reviseOrder(orderId, updatedOrder);
    }
}