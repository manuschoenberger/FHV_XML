package exercise.model;

import java.math.BigDecimal;

import javax.persistence.*;

@Entity
@Table(name = "northwind.product")
public class Product {

	private int productId;
	private String productName;
	private Supplier supplier;
	private Categorie category;
	private String quantityPerUnit;
	private BigDecimal unitPrice;
	private int unitsInStock;
	private int unitsInOrder;
	private int reorderLevel;
	private char discontinued;

	@Id
	@Column(name = "product_id")
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}

	@Column(name = "product_name")
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	@ManyToOne
	@JoinColumn(name = "supplier_id")
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	@ManyToOne
	@JoinColumn(name = "category_id")
	public Categorie getCategory() {
		return category;
	}
	public void setCategory(Categorie category) {
		this.category = category;
	}

	@Column(name = "quantity_per_unit")
	public String getQuantityPerUnit() {
		return quantityPerUnit;
	}
	public void setQuantityPerUnit(String quantityPerUnit) {
		this.quantityPerUnit = quantityPerUnit;
	}

	@Column(name = "unit_price")
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	@Column(name = "units_in_stock")
	public int getUnitsInStock() {
		return unitsInStock;
	}
	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	@Column(name = "units_on_order")
	public int getUnitsInOrder() {
		return unitsInOrder;
	}
	public void setUnitsInOrder(int unitsInOrder) {
		this.unitsInOrder = unitsInOrder;
	}

	@Column(name = "reorder_level")
	public int getReorderLevel() {
		return reorderLevel;
	}
	public void setReorderLevel(int reorderLevel) {
		this.reorderLevel = reorderLevel;
	}

	@Column(name = "discontinued")
	public char getDiscontinued() {
		return discontinued;
	}
	public void setDiscontinued(char discontinued) {
		this.discontinued = discontinued;
	}
	
	@Override
	public String toString() {
		return "Product [Product - ID = " + productId + ", Product Name = " + productName + "]";
	}
	
}
