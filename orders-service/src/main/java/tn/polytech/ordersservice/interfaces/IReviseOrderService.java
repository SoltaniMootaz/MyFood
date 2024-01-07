package tn.polytech.ordersservice.interfaces;

import tn.polytech.ordersservice.entities.Orders;

public interface IReviseOrderService {
    Orders reviseOrder(Long orderId, Orders updatedOrder);
}
