	package com.Std.DAO;
	
	import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.Std.Model.MyModel;
import com.Std.utility.AdminDBConnection;
	
	public class MyDao {
	     String status = "Failure";
	     public List<MyModel> getAllDetails() {
	         List<MyModel> li = new ArrayList<>();
	         
	         try {
	             Connection con = AdminDBConnection.connect();
	             
	             PreparedStatement ps = con.prepareStatement("SELECT * FROM userlogin");
	             ResultSet rs = ps.executeQuery();
	             while (rs.next()) {
	             	MyModel mp=new MyModel();
	             	mp.setUsername(rs.getString("username"));
	             	mp.setPassword(rs.getString("password"));
	             	mp.setEmail(rs.getString("email"));
	             	mp.setPhonenumber(rs.getString("phonenumber"));
	             	li.add(mp);
	                System.out.println(li);
	             }
	             
	         } catch (Exception e) {
	             System.out.println(e);
	         }
	         
	         return li; 
	     }

	    
//	    public String updateData(MyModel m) {
//	    	status = "Failure";
//			try {
//				System.out.println("Update Controller");
//				Connection con = AdminDBConnection.connect();
//				PreparedStatement ps = con.prepareStatement("UPDATE userlogin SET password=?, email=?, phonenumber=? WHERE username=?");
//				ps.setString(1, m.getPassword());
//				ps.setString(2, m.getEmail());
//				ps.setString(3, m.getPhonenumber());
//				ps.setString(4, m.getUsername());
//				int p = ps.executeUpdate();
//				if(p>0) {
//					status = "Success";
//				}else {
//					System.out.println("failure at update");
//					return status ;
//				}
//			}catch(Exception e) {
//				System.out.println(e);
//			}
//			return status;
//		}
	
	
	    
	    public String insertData(MyModel m) {
			try {
				Connection con = AdminDBConnection.connect();
				PreparedStatement ps = con.prepareStatement("insert into userlogin(username,password,email,phonenumber) values(?,?,?,?)");
				ps.setString(1, m.getUsername());
				ps.setString(2, m.getPassword());
				ps.setString(3, m.getEmail());
				ps.setString(4, m.getPhonenumber());
				int n = ps.executeUpdate();
				if(n>0) {
					status = "Success";
				}else {
					status = "Failure";
				}
			}catch(Exception e) {
				System.out.println(e);
			}
			return status;
		}
	    
	    public String deleteStudent(MyModel m) {
			try {
				Connection con = AdminDBConnection.connect();
				PreparedStatement st = con.prepareStatement("delete from userlogin where username=?");
				st.setString(1, m.getUsername());
				int n = st.executeUpdate();
				if (n > 0) {
					System.out.println(n + ":  row(s) Deleted successfully");
					status = "Success";
				} else {
					System.out.println("Something went Wrong!!! at deletion");
				}
				con.close();
	
			} catch (Exception e) {
				System.out.println(e);
			}
			return status;
		}
	}