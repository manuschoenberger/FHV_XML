package exercise.jpa.facade;

import java.util.List;

import exercise.jpa.broker.CustomerBrokerJPA;
import exercise.jpa.broker.OrdersBrokerJPA;
import exercise.jpa.broker.ShipperBrokerJPA;
import exercise.model.Categorie;
import exercise.model.Customer;
import exercise.model.Employee;
import exercise.model.OrderDetail;
import exercise.model.Orders;
import exercise.model.Product;
import exercise.model.Shipper;
import exercise.model.Supplier;

public class DatabaseFacadeJPA implements IDatabaseFacadeJPA {

	public void save(Object value) {
		if (value instanceof Customer) {
			CustomerBrokerJPA cb  = new CustomerBrokerJPA();
			cb.save((Customer) value);
		}
		
		if (value instanceof Shipper) {
			ShipperBrokerJPA sb  = new ShipperBrokerJPA();
			sb.save((Shipper) value);		
		}
		
		if (value instanceof Orders) {
			OrdersBrokerJPA ob  = new OrdersBrokerJPA();
			ob.save((Orders) value);		
		}
		
		if (value instanceof Employee) {
			// delegieren an EmployeeBroker analog zu obigen Broker 
		}
		
		if (value instanceof OrderDetail) {
			// delegieren an Order_DetailBroker analog zu obigen Broker  
		}
		
		if (value instanceof Categorie) {
			// delegieren an CategorieBroker analog zu obigen Broker  
		}
		
		if (value instanceof Supplier) {
			// delegieren an SupplierBroker analog zu obigen Broker  
		}
		
		if (value instanceof Product) {
			// delegieren an ProductBroker analog zu obigen Broker 
		}
		
	}

	public void delete(Object value) {
		if (value instanceof Customer) {
			CustomerBrokerJPA cb  = new CustomerBrokerJPA();
			cb.delete((Customer) value);
		}
		
		if (value instanceof Shipper) {
			ShipperBrokerJPA sb  = new ShipperBrokerJPA();
			sb.delete((Shipper) value);		
		}
		
		if (value instanceof Orders) {
			OrdersBrokerJPA ob  = new OrdersBrokerJPA();
			ob.delete((Orders) value);		
		}
		
		if (value instanceof Employee) {
			// delegieren an EmployeeBroker analog zu obigen Broker 
		}
		
		if (value instanceof OrderDetail) {
			// delegieren an Order_DetailBroker analog zu obigen Broker  
		}
		
		if (value instanceof Categorie) {
			// delegieren an CategorieBroker analog zu obigen Broker  
		}
		
		if (value instanceof Supplier) {
			// delegieren an SupplierBroker analog zu obigen Broker  
		}
		
		if (value instanceof Product) {
			// delegieren an ProductBroker analog zu obigen Broker 
		}
	}

	public List<Customer> getAllCustomers() {
		CustomerBrokerJPA cb = new CustomerBrokerJPA();
		List<Customer> customers = cb.getAll();
		
		return customers;
	}

	public Customer getCustomerByID(int id) {
		CustomerBrokerJPA cb = new CustomerBrokerJPA();
		Customer customer = cb.get(id);
		
		return customer;
	}

	public List<Shipper> getAllShippers() {
		ShipperBrokerJPA sb = new ShipperBrokerJPA();
		List<Shipper> shippers = sb.getAll();
		
		return shippers;
	}

	public Shipper getShipperByID(int id) {
		ShipperBrokerJPA sb = new ShipperBrokerJPA();
		Shipper shipper = sb.get(id);
		
		return shipper;
	}

	public List<Orders> getAllOrders() {
		OrdersBrokerJPA ob = new OrdersBrokerJPA();
		List<Orders> orders = ob.getAll();
		
		return orders;
	}

	public Orders getOrdersByID(int id) {
		OrdersBrokerJPA ob = new OrdersBrokerJPA();
		Orders order = ob.get(id);
		
		return order;
	}

	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	public Employee getEmployeeByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<OrderDetail> getAllOrderDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	public OrderDetail getOrderDetailByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Categorie> getAllCategories() {
		// TODO Auto-generated method stub
		return null;
	}

	public Categorie getCategorieByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Supplier> getAllSuppliers() {
		// TODO Auto-generated method stub
		return null;
	}

	public Supplier getSupplierByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	public Product getProductByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
