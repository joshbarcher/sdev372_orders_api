package sdev.greenriver.edu.ordersapi.service;

import org.springframework.stereotype.Service;
import sdev.greenriver.edu.ordersapi.entities.UserOrder;
import sdev.greenriver.edu.ordersapi.repositories.IOrdersRepository;

import java.util.List;

@Service
public class OrderService
{
    private IOrdersRepository repo;

    public OrderService(IOrdersRepository repo)
    {
        this.repo = repo;
    }

    public List<UserOrder> getOrders()
    {
        return repo.findAll();
    }

    public UserOrder getById(int id)
    {
        return repo.findById(id).get();
    }

    public boolean orderExists(int id)
    {
        return repo.findById(id).isPresent();
    }
}
