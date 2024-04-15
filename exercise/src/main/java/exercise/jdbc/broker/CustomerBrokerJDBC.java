package exercise.jdbc.broker;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import exercise.model.Customer;

public class CustomerBrokerJDBC extends BrokerBaseJDBC<Customer>  {

	@Override
	public List<Customer> getAll() throws SQLException {
		List<Customer> customers = new ArrayList<Customer>();
		Connection c = getConnection();
		
		try {
			Statement stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("select * from northwind.customer");
			
			while (rs.next()) {
				Customer cus = new Customer();
				
				cus.setCustomerId(rs.getInt("customer_id"));
				cus.setCompanyName(rs.getString("company_name"));
				cus.setCustomerCode(rs.getString("customer_code"));
				cus.setAddress(rs.getString("address"));
				
				if (rs.getString("city") != null) {
					cus.setCity(rs.getString("city"));
				}
				
				if (rs.getString("contact_name") != null) {
					cus.setContactName(rs.getString("contact_name"));
				}
				
				if (rs.getString("contact_title") != null) {
					cus.setContactTitle(rs.getString("contact_title"));
				}
				
				if (rs.getString("country") != null) {
					cus.setCountry(rs.getString("country"));
				}
				
				if (rs.getString("fax") != null) {
					cus.setFax(rs.getString("fax"));
				}
				
				if (rs.getString("phone") != null) {
					cus.setPhone(rs.getString("phone"));
				}
				
				if (rs.getString("postal_code") != null) {
					cus.setPostalCode(rs.getString("postal_code"));
				}
				
				if (rs.getString("region") != null) {
					cus.setRegion(rs.getString("region"));
				}
				
				customers.add(cus);
			}
			
			return customers;
			
		} catch (SQLException e) {
			throw(e);
		} finally {
			c.close();
		}
	}


	@Override
	public void insert(Customer value) throws SQLException {
		
		Connection c = getConnection();
		
		try {
			PreparedStatement stmt = c.prepareStatement("insert into northwind.customer (customer_id, customer_code, company_name, contact_name, contact_title, address, city, region, postal_code, country, phone, fax) "
					+ "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			
			stmt.setInt(1, value.getCustomerId());
			stmt.setString(2, value.getCustomerCode());
			stmt.setString(3, value.getCompanyName());
			stmt.setString(4, (value.getContactName() != null ? value.getContactName() : null));
			stmt.setString(5, (value.getContactTitle() != null ? value.getContactTitle() : null));
			stmt.setString(6, value.getAddress() != null ? value.getAddress() : null);
			stmt.setString(7, (value.getCity() != null ? value.getCity() : null));
			stmt.setString(8, (value.getRegion() != null ? value.getRegion() : null));
			stmt.setString(9, (value.getPostalCode() != null ? value.getPostalCode() : null));
			stmt.setString(10, (value.getCountry() != null ? value.getCountry() : null));
			stmt.setString(11, (value.getPhone() != null ? value.getPhone() : null));
			stmt.setString(12, (value.getFax() != null ? value.getFax() : null));

			stmt.toString();
			stmt.execute();
			
		} catch (SQLException e) {
			throw(e);
		} finally {
			c.close();
		}
		
	}

	@Override
	public void remove(Customer value) throws SQLException {
		
		Connection c = getConnection();
		int customerId = value.getCustomerId();
		
		try {
			PreparedStatement stmt = c.prepareStatement("delete from northwind.customer where customer_id = ?");
			stmt.setInt(1, customerId);
			stmt.executeUpdate();
		}
		catch (SQLException e) {
			throw(e);
		} finally {
			c.close();
		}
		
	}


	@Override
	public Customer getById(int id) throws SQLException {

		Connection c = getConnection();
		Customer cus = null;
		
		try {
			PreparedStatement stmt = c.prepareStatement("select * from northwind.customer where customer_id = ?");
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				cus = new Customer();
				
				cus.setCustomerId(rs.getInt("customer_id"));
				cus.setCompanyName(rs.getString("company_name"));
				cus.setCustomerCode(rs.getString("customer_code"));
				cus.setAddress(rs.getString("address"));
				
				if (rs.getString("city") != null) {
					cus.setCity(rs.getString("city"));
				}
				
				if (rs.getString("contact_name") != null) {
					cus.setContactName(rs.getString("contact_name"));
				}
				
				if (rs.getString("contact_title") != null) {
					cus.setContactTitle(rs.getString("contact_title"));
				}
				
				if (rs.getString("country") != null) {
					cus.setCountry(rs.getString("country"));
				}
				
				if (rs.getString("fax") != null) {
					cus.setFax(rs.getString("fax"));
				}
				
				if (rs.getString("phone") != null) {
					cus.setPhone(rs.getString("phone"));
				}
				
				if (rs.getString("postal_code") != null) {
					cus.setPostalCode(rs.getString("postal_code"));
				}
				
				if (rs.getString("region") != null) {
					cus.setRegion(rs.getString("region"));
				}
			}
			
		} catch (SQLException e) {
			throw(e);
		} finally {
			c.close();
		}
		
		return cus;
	}


	@Override
	public void update(Customer value) throws SQLException {

		Connection c = getConnection();
		
		try {
			PreparedStatement stmt = c.prepareStatement("update northwind.customer set customer_code = ?, company_name = ?, contact_name = ?, contact_title = ?, address = ?, city = ?, region = ?, postal_code = ?, country = ?, phone = ?, fax = ? where customer_id = ?");
			
			stmt.setString(1, value.getCustomerCode());
			stmt.setString(2, value.getCompanyName());
			stmt.setString(3, (value.getContactName() != null ? value.getContactName() : null));
			stmt.setString(4, (value.getContactTitle() != null ? value.getContactTitle() : null));
			stmt.setString(5, value.getAddress() != null ? value.getAddress() : null);
			stmt.setString(6, (value.getCity() != null ? value.getCity() : null));
			stmt.setString(7, (value.getRegion() != null ? value.getRegion() : null));
			stmt.setString(8, (value.getPostalCode() != null ? value.getPostalCode() : null));
			stmt.setString(9, (value.getCountry() != null ? value.getCountry() : null));
			stmt.setString(10, (value.getPhone() != null ? value.getPhone() : null));
			stmt.setString(11, (value.getFax() != null ? value.getFax() : null));		
			stmt.setInt(12, value.getCustomerId());
			
			stmt.executeUpdate();
		}
		catch (SQLException e) {
			throw(e);
		} finally {
			c.close();
		}
		
	}

}
