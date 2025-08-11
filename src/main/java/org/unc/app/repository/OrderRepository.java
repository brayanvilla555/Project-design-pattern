package org.unc.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.unc.app.model.entity.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long>{
}
