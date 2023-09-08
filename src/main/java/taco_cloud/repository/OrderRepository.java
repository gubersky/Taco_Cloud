package taco_cloud.repository;

import org.springframework.data.repository.CrudRepository;

import taco_cloud.dto.TacoOrder;

import java.util.List;


public interface OrderRepository extends CrudRepository<TacoOrder, Long> {

    List<TacoOrder> findByDeliveryZip(String deliveryZip);
}
