package exp.labs.inject.beans;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.inject.Inject;
import javax.sql.DataSource;

//import exp.labs.inject.annotations.MicrosoftJdbc;
import exp.labs.inject.annotations.MySqlJdbc;


public class JdbcBean{

	
	@Inject
	@MySqlJdbc
	private DataSource ds;
	
	public void run() {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try{
			
			conn = ds.getConnection();
			stmt = conn.createStatement();  
			rs = stmt.executeQuery("SELECT COUNT(*) FROM products;");

    		if(rs.next()) {
				int count = rs.getInt(1);
				System.out.println(" The Products table has " + count + " rows.");
			}
    		else{
    			System.out.println("Count query on products table failed");
    		}
    				   
		}catch (SQLException ex){
    		// handle any errors
    		System.out.println("SQLException: " + ex.getMessage());
		}
		finally {
    		try { if (rs != null) rs.close(); } catch (Exception e) {};
    		try { if (stmt != null) stmt.close(); } catch (Exception e) {};
    		try { if (conn != null) conn.close(); } catch (Exception e) {};
    	}
	}
	
	
}
