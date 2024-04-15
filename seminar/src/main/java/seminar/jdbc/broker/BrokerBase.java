package seminar.jdbc.broker;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public abstract class BrokerBase<T> {
	
	public Connection getConnection() throws SQLException{
		Connection c = DriverManager.getConnection(
					"jdbc:postgresql://elmo.hostingcenter.uclv.net:5432/itb_inf_2022_msc6334",
					"itb_inf_2022_msc6334", "PW_SCMa");
		return c;
	}
	
	
	public abstract List<T> getAll() throws SQLException;
	
	public abstract void insert(T value) throws SQLException;
	
}