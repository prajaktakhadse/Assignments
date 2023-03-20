package hibernatedaoapp1;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.utility.HB_Util;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
	List<Employee> hbemp = new ArrayList<>();
	
	try(Connection conn = HB_Util.provideConnection()){
		
		
	}catch(SQLException e) {
		
	}
	
	
	return hbemp;
	}

}
