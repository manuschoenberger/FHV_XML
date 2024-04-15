package exercise.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "northwind.categorie")
public class Categorie {

	private int categoryId;
	private String categoryName;
	private String description;
	private String picture;
	
	private List<Product> products;
	
	@Id
	@Column(name = "category_id")
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	@Column(name = "category_name")
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Column(name = "description")
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "picture")
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}

	@OneToMany(mappedBy = "category", fetch = FetchType.EAGER)
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	@Override
	public String toString() {
		return "Categorie [Category - ID = " + categoryId + ", Category Name = " + categoryName + "]";
	}

}
