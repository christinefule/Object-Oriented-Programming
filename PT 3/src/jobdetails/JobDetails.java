package jobdetails;

import java.sql.Connection; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.sql.Statement;
import oracle.jdbc.pool.OracleDataSource;

public class JobDetails {

	public static void main(String[] args) throws SQLException { 
		OracleDataSource ods = new OracleDataSource();
		ods.setURL("jdbc:oracle:thin:orcluser/jdbcuser@//localhost:1521/xepdb1"); 
		Connection conn = ods.getConnection();
	
		Statement stmt=conn.createStatement();
		Statement stmt1=conn.createStatement();
		Statement stmt2=conn.createStatement();
		
		// Execute a statement - DO THIS WITH AT LEAST 3 TABLES - provide screenshot
		ResultSet rset= stmt.executeQuery("Select job_id , job_title, min_salary, max_salary from jobs");
		ResultSet rset1= stmt1.executeQuery("Select region_id, country_name from countries");
		ResultSet rset2= stmt2.executeQuery("Select department_name , department_id, manager_id, location_id from departments");
		
		
		// Iterate through the result and print the employee names and ID 
		System.out.println("Job ID" + "\t\t\t" +"JOB Title"+"\t\t\t\t\t"+"Min Salary"+"\t\t\t\t"+ "Max Salary"); 
		System.out.println();
		while (rset.next())
		System.out.println(rset.getString(1) + "\t\t\t" +rset.getString(2) + "\t\t\t\t\t"+rset.getString(3) + "\t\t\t\t"+rset.getString(4));
		System.out.println("-----------------------------------------------------------------------------------------------------");
		//endwhile
		
		System.out.println();	
		// Iterate through the result and print 
			System.out.println("REGION ID" + "\t\t\t" +"COUNTRY NAME"); 
			System.out.println();
			while (rset1.next())
			System.out.println(rset1.getString(1) + "\t\t\t\t" +rset1.getString(2));
			System.out.println("-----------------------------------------------------------------------------------------------------");
				//endwhile		
				
				System.out.println();
				// Iterate through the result and print 
					System.out.println("DEPARTMENT NAME" + "\t\t" +"DEPARTMENT ID"+"\t\t\t"+"MANAGER ID"+"\t\t\t"+ "LOCATION ID"); 
					System.out.println();
					while (rset2.next())
					System.out.println(rset2.getString(1) + "\t\t" +rset2.getString(2) +"\t\t\t\t"+rset2.getString(3)+"\t\t\t\t"+rset2.getString(4));
					System.out.println("-----------------------------------------------------------------------------------------------------");
						//endwhile
				
				rset.close();
				stmt.close();
				rset1.close();
				stmt1.close();
				rset2.close();
				stmt2.close();
//close the resources 
}//end method main
}//end class JobDetails