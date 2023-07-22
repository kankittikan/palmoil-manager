package org.shiba.palmoilapi.orderjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class OrderService {
    @Autowired private OrderRepo repo;

    public void addOrder(OrderEntity order) {
        repo.save(order);
    }

    public void delete(Integer id) {
        repo.deleteById(id);
    }

    public List<OrderEntity> getList() {
        return (List<OrderEntity>) repo.findAll();
    }

    public OrderEntity findById(Integer id) throws OrderNotFoundException {
        Optional<OrderEntity> order = repo.findById(id);
        if(order.isPresent()) {
            return order.get();
        }
        throw new OrderNotFoundException("Could not find order");
    }



}
