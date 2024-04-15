package exercise.model;

import java.io.Serializable;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class OrderDetailExtID implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Orders orderId;
	private Product productId;
	
	public OrderDetailExtID() {}
	
	public OrderDetailExtID (Orders order, Product product) {
		orderId = order;
		productId = product;
	}

	public Orders getOrderId() {
		return orderId;
	}
	public void setOrderId(Orders orderId) {
		this.orderId = orderId;
	}

	public Product getProductId() {
		return productId;
	}
	public void setProductId(Product productId) {
		this.productId = productId;
	}
		
}
