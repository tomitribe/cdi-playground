package exp.labs.inject.producers;

import javax.enterprise.inject.Produces;
import javax.sql.DataSource;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

import exp.labs.inject.annotations.MicrosoftJdbc;


public class SQLServerDataSourceProvider {
	
	@Produces 
	@MicrosoftJdbc
	private DataSource produceDataSource() {
		// read properties from somewhere here
		
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser("<user>");
        ds.setPassword("<password>");
        ds.setServerName("<server>");
        ds.setPortNumber(0000);
        ds.setDatabaseName("AdventureWorks");
        
        return ds;
	}

}
