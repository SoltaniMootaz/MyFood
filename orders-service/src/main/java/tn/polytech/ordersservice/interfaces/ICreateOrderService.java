package tn.polytech.ordersservice.interfaces;

import tn.polytech.ordersservice.entities.Orders;

public interface ICreateOrderService {
    Orders createOrder(Orders order);

}