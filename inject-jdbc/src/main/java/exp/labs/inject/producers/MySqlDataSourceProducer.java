package exp.labs.inject.producers;

import javax.enterprise.inject.Default;
import javax.enterprise.inject.Produces;
import exp.labs.inject.annotations.MySqlJdbc;
import javax.sql.DataSource;
import com.mysql.cj.jdbc.MysqlDataSource;


public class MySqlDataSourceProducer {

	@Produces 
	@MySqlJdbc
	private DataSource produceDataSource() {
		// read properties from somewhere here
		
		MysqlDataSource mySqldataSource = new MysqlDataSource();
		mySqldataSource.setPassword("pluralsight");
		mySqldataSource.setUser("root");
		mySqldataSource.setURL("jdbc:mysql://localhost:3306/classicmodels?serverTimezone=UTC");
		
		return mySqldataSource;
	}
}
