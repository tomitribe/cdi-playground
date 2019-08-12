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
		mySqldataSource.setPassword("<password>");
		mySqldataSource.setUser("<user>");
		mySqldataSource.setURL("jdbc:mysql://localhost:3306/<database-name>?serverTimezone=UTC");
		
		return mySqldataSource;
	}
}
