package com.order.client.repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.order.client.model.Order;

public interface OrderRepository extends JpaRepository<Order, BigDecimal>{

}
