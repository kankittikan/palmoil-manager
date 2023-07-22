package org.shiba.palmoilapi.controllers;

import org.shiba.palmoilapi.orderjpa.OrderEntity;
import org.shiba.palmoilapi.orderjpa.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {
    @Autowired
    private OrderService service;

    public MainController() {
    }
    @PostMapping("order/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody OrderEntity order) {
        service.addOrder(order);
    }

    @GetMapping("order")
    public List<OrderEntity> getList() {
        return service.getList();
    }

    @DeleteMapping("order/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id) {
        service.delete(id);
    }
}
