package com.order.client.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.order.client.model.Order;
import com.order.client.repository.OrderRepository;

@Controller
public class OrderController {
	
	@Autowired
	private OrderRepository repository;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Order> findAllOrders() {
		return repository.findAll();
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public void saveOrderInApplication(@RequestBody Order order){
		repository.save(order);
	}
	
	@RequestMapping(value = "/", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public void update(@RequestBody Order order) {
		repository.saveAndFlush(order);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void delete(@RequestBody BigDecimal id) {
		repository.delete(id);
	}
}
