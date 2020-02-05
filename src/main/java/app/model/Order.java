package app.model;

import java.util.List;

public class Order {
	private String orderId;
	private List<Product> products;
	private Receipient receipient;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Receipient getReceipient() {
		return receipient;
	}

	public void setReceipient(Receipient receipient) {
		this.receipient = receipient;
	}
}
