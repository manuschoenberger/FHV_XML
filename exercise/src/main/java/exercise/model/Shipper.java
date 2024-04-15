package exercise.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "northwind.shipper")
public class Shipper {

	private int shipperId;
	private String companyName;
	private String phone;
	
	private List<Orders> orders;

    @Id
	@Column(name = "shipper_id")
	public int getShipperId() {
		return shipperId;
	}
	public void setShipperId(int shipperId) {
		this.shipperId = shipperId;
	}

	@Column(name = "company_name")
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Column(name = "phone")
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	@OneToMany(mappedBy = "shipper", fetch = FetchType.EAGER)
	public List<Orders> getOrders() {
		return orders;
	}
	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Shipper [Shipper - ID = " + shipperId + ", Company Name = " + companyName + "]";
	}

}
