package com.masai.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;






@RestController
public class ControllerMain {

	

		@GetMapping("/booksdetail")
		public List<Books> getAllBooks() {
			
			
			List<Books> list = new ArrayList<>();
			
			try(Connection conn = ConnectionUtil.provideConnection()) {
				
				PreparedStatement ps = conn.prepareStatement("SELECT * FROM books");
				
				ResultSet x = ps.executeQuery();
				
				Books em = new Books();
				
				while(x.next()) {
					
					em.setBook_Id(x.getInt(1));
					em.setName(x.getString(2));
					em.setAuthor(x.getString(3));
					em.setPrice(x.getInt(4));
					list.add(em);
				}
				
			} catch (SQLException e) {
				
				System.out.println(e.getMessage());
				return null;
			}
			
			return list;
			
		}
		
		@PostMapping("/books")
		public String insertBooks(@RequestBody Books e) {
			
			
			Connection c = ConnectionUtil.provideConnection();
			if(c!=null)	System.out.println("Connection establised");
			else {
				System.out.println("Not established");
			}
			
			String s = "Not Inserted";
			
			
			try(Connection conn =ConnectionUtil.provideConnection()) {
				
				PreparedStatement ps = conn.prepareStatement("INSERT INTO books VALUES(?, ?, ?, ?)");
				
				ps.setInt(1, e.getBook_Id());
				ps.setString(2, e.getName());
				ps.setString(3, e.getAuthor());
				ps.setInt(4, e.getPrice());
				
				
				int x = ps.executeUpdate();
				
				if(x>0) s="inseted....";
				
			} catch (Exception e2) {
				s = e2.getMessage();
			}
			
			return s;
		}
		
		@GetMapping
		public Books getBooksById(@PathVariable("id") int eid) {
			 
			Books em = new Books();
			
			try(Connection conn = ConnectionUtil.provideConnection()) {
				
				PreparedStatement ps = conn.prepareStatement("SELECT * FROM books WHERE eid = ?");
				
				ps.setInt(1, eid);
				
				ResultSet x = ps.executeQuery();
				
				if(x.next()) {
					em.setBook_Id(x.getInt(1));
					em.setName(x.getString(2));
					em.setAuthor(x.getString(3));
					em.setPrice(x.getInt(4));
				}else
					em = null;
				
				
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			
			
			return em;
		}
		
		
		@DeleteMapping("/delete")
		public String deleteBooksById(@PathVariable("id") int eid) {
			
			String s = "not delete";
			
			try(Connection conn = ConnectionUtil.provideConnection()) {
				
				PreparedStatement ps = conn.prepareStatement("DELETE FROM books WHERE eid = ?");
				
				ps.setInt(1, eid);
				
				int x = ps.executeUpdate();
				
				if(x>0) s="deleted....";
				
			} catch (Exception e2) {
				s = e2.getMessage();
			}
				
			
			
			
			return s;
		}
	

}
