package exercise.jpa.facade;

import java.util.List;

import exercise.model.Categorie;
import exercise.model.Customer;
import exercise.model.Employee;
import exercise.model.OrderDetail;
import exercise.model.Orders;
import exercise.model.Product;
import exercise.model.Shipper;
import exercise.model.Supplier;

public interface IDatabaseFacadeJPA {
	
	// INSERT + UPDATE (SAVE)
	public void save(Object value);
	
	// DELETE
	public void delete(Object value);
	
	// READ
	public List<Customer> getAllCustomers();
	public Customer getCustomerByID(int id);
	
	public List<Shipper> getAllShippers();
	public Shipper getShipperByID(int id);
	
	public List<Orders> getAllOrders();
	public Orders getOrdersByID(int id);
	
	public List<Employee> getAllEmployees();
	public Employee getEmployeeByID(int id);
	
	public List<OrderDetail> getAllOrderDetails();
	public OrderDetail getOrderDetailByID(int id);
	
	public List<Categorie> getAllCategories();
	public Categorie getCategorieByID(int id);
	
	public List<Supplier> getAllSuppliers();
	public Supplier getSupplierByID(int id);
	
	public List<Product> getAllProducts();
	public Product getProductByID(int id);
}
