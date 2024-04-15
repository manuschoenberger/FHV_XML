package seminar.DatabaseConnection;

import java.sql.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseConnectionTest {

	public static void main(String[] args) throws SQLException {
		try {
			Connection c = DriverManager.getConnection("jdbc:postgresql://elmo.hostingcenter.uclv.net:5432/itb_inf_2022_msc6334", "itb_inf_2022_msc6334", "PW_SCMa");			
		
			Statement stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM pers_proj.person ORDER BY lname");
			
			while (rs.next()) {
				System.out.println(rs.getString("lname"));
			}
			
			c.close();
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
