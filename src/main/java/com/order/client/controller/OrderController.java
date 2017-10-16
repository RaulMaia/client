package com.order.client.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.order.client.model.Orders;
import com.order.client.repository.OrderRepository;

@RestController
public class OrderController {
	
	@Autowired
	OrderRepository repository;
	
	@RequestMapping(value = "/order/", method = RequestMethod.GET)
	public List<Orders> findAllOrders() {
		return this.repository.findAll();
	}
	
	@RequestMapping(value = "/order/{id}", method = RequestMethod.GET)
	public Orders findById(@PathVariable BigDecimal id) {
		return repository.findOne(id);
	}
	
	@RequestMapping(value = "/order/price/{preco}/{preco2}", method = RequestMethod.GET)
	public List<Orders> findByPrice(@PathVariable BigDecimal preco, @PathVariable BigDecimal preco2) {
		return repository.findByPrice(preco, preco2);
	}
	
	@RequestMapping(value = "/order/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public void saveOrderInApplication(@RequestBody Orders order){
		this.repository.save(order);
	}
	
	@RequestMapping(value = "/order/", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public void update(@RequestBody Orders order) {
		this.repository.saveAndFlush(order);
	}
	
	@RequestMapping(value = "/order/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable BigDecimal id) {
		repository.delete(id);
	}
}
