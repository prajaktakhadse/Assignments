
package com.dao;
//4th page.............
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.exceptions.EmployeeException;
import com.model.Employee;
import com.utility.DBUtil;

public class EmployeeDaoImpl implements EmployeeDao{
    
	
	//1st_method
	@Override
	public String saveEmployeeDetails(Employee employee) {
		// TODO Auto-generated method stub
		String message = "Not inserted........";
		
		try(Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("insert into employee values(?,?,?,?)");
			
			ps.setInt(1, employee.getEmpid());
			ps.setString(2,employee.getName());
			ps.setString(3,employee.getAddress());
			ps.setInt(4,employee.getSalary());
			
			
			int x = ps.executeUpdate();
			
			if(x>0) {
				message = "Record Inserted Successfully..!";
			}
			
			
		}catch(SQLException e) {
			message = e.getMessage();
		}
		return message;
	}

	//2nd_method
	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		// TODO Auto-generated method stub
		Employee emp = null;
		
		try(Connection conn  = DBUtil.provideConnection()){
			PreparedStatement ebi = conn.prepareStatement("Select * from Employee where empId = ?");
			ebi.setInt(1, empId);
			
			ResultSet rsebi = ebi.executeQuery();
			
			if(rsebi.next()) {
				 emp = new Employee();
				 
				 emp.setEmpid(rsebi.getInt("empId"));
				 emp.setName(rsebi.getString("name"));
				 emp.setAddress(rsebi.getNString("address"));
				 emp.setSalary(rsebi.getInt("salary"));
			}else {
				throw new EmployeeException("Employee not full with empId: " + empId);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
			throw new EmployeeException(e.getMessage());
		}
		
		return emp;
	}
	
	
	//3rd_method...
	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> lemp = new ArrayList<>();
		
     
        	try (Connection conn =  DBUtil.provideConnection()){
				PreparedStatement psall =  conn.prepareStatement("select * from employee");
				
					ResultSet set = psall.executeQuery();
					
					while(set.next()) {
						int aid = set.getInt("empId");
						String aname = set.getString("name");
						String aladd = set.getString("address");
						int asal = set.getInt("salary");
						
						Employee employee = new Employee(aid,aname,aladd,asal);
						
			              lemp.add(employee);
					}
						
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return lemp;
    }
	
	
	//4th_method...
	@Override
	public String deleteEmployee(int empId) throws EmployeeException {
		// TODO Auto-generated method stub
		String message = "not deleted............";

		
		try(Connection conn = DBUtil.provideConnection()) {
			PreparedStatement psdelt = conn.prepareStatement("delete  from employee where empId = ?");
			
			psdelt.setInt(1, empId);
			int x = psdelt.executeUpdate();
			if(x>0) {
				message = "record deleted successfully";
			}else {
				throw new EmployeeException("Employee does not exist with ID :"+empId);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			message = e.getMessage();
		}
		return message;
		
		
	}
}
