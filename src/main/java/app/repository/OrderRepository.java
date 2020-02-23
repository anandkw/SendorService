package app.repository;

import app.model.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
@Transactional
public interface OrderRepository extends CrudRepository<Order, String> {
}
