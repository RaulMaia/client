package com.order.client.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.order.client.model.Orders;

public interface OrderRepository extends JpaRepository<Orders, BigDecimal>{
	
	@Query("SELECT o FROM Orders o WHERE o.preco BETWEEN :preco AND :preco2 ORDER BY o.preco")
	List<Orders> findByPrice(@Param("preco") BigDecimal preco,@Param("preco2") BigDecimal preco2);

}
