package org.shiba.palmoilapi.orderjpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface OrderRepo extends CrudRepository<OrderEntity, Integer> {
}
