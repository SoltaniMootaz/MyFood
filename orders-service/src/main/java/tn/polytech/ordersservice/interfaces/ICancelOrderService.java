package tn.polytech.ordersservice.interfaces;

import tn.polytech.ordersservice.entities.Orders;

public interface ICancelOrderService {
    Orders cancelOrder(Long orderId);

}
