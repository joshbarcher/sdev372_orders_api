package sdev.greenriver.edu.ordersapi.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sdev.greenriver.edu.ordersapi.entities.UserOrder;
import sdev.greenriver.edu.ordersapi.service.OrderService;

import java.util.List;

@RestController
@RequestMapping("order")
public class OrderController
{
    private OrderService service;

    public OrderController(OrderService service)
    {
        this.service = service;
    }

    @GetMapping("")
    public ResponseEntity<List<UserOrder>> orders()
    {
        return new ResponseEntity<>(service.getOrders(), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Object> order(@PathVariable int id)
    {
        if (!service.orderExists(id))
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
    }
}
