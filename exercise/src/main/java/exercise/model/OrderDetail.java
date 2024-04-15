package exercise.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.*;

@Entity
@IdClass(OrderDetailExtID.class)
@Table(name = "northwind.order_detail")
public class OrderDetail implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Orders orderId;
	private Product productId;
	private BigDecimal unitPrice;
	private int quantity;
	private BigDecimal discount;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "order_id")
	public Orders getOrderId() {
		return orderId;
	}
	public void setOrderId(Orders orderId) {
		this.orderId = orderId;
	}
	
    @Id
    @ManyToOne
    @JoinColumn(name = "product_id")
	public Product getProductId() {
		return productId;
	}
	public void setProductId(Product productId) {
		this.productId = productId;
	}
	
	@Column(name = "unit_price")
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	@Column(name = "quantity")
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
    @Column(name = "discount")
	public BigDecimal getDiscount() {
		return discount;
	}
	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

}
