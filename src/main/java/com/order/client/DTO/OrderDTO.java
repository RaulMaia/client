package com.order.client.DTO;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderDTO {
	
	@JsonProperty("id")
	private BigDecimal id;
	@JsonProperty("quant")
	private BigDecimal quant;
	@JsonProperty("subtotal")
	private BigDecimal subtotal;
	@JsonProperty("iduser")
	private BigDecimal iduser;
	@JsonProperty("idproduto")
	private BigDecimal idproduto;
	@JsonProperty("preco")
	private BigDecimal preco;
	public BigDecimal getId() {
		return id;
	}
	public void setId(BigDecimal id) {
		this.id = id;
	}
	public BigDecimal getQuant() {
		return quant;
	}
	public void setQuant(BigDecimal quant) {
		this.quant = quant;
	}
	public BigDecimal getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}
	public BigDecimal getIduser() {
		return iduser;
	}
	public void setIduser(BigDecimal iduser) {
		this.iduser = iduser;
	}
	public BigDecimal getIdproduto() {
		return idproduto;
	}
	public void setIdproduto(BigDecimal idproduto) {
		this.idproduto = idproduto;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	
	

}
