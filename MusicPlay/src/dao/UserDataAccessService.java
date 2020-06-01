package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;
import beans.User;

/*
 * Vien Nguyen
 * CST361
 * This is the UserDataAccessService implement.
 */

@Stateless
@Local(DataAccessInterface.class)
@LocalBean
@Alternative
public class UserDataAccessService implements DataAccessInterface<User> {
	//Connection details
	Connection conn = null;
	String url = "jdbc:postgresql://localhost:5432/postgres";
	String username = "postgres";
	String password = "Chihaiis02";

	@Override
	   // Login method
	public boolean login(User user) {
		
		boolean isLoginValid = false;
		if(user.getUsername().equals("vien") && user.getPassword().equals("123456")) {
			isLoginValid = true;
		}else {
			isLoginValid = false;
		}
		return isLoginValid;
	}
	//Create a new user method
	@Override
	public boolean create(User user) {
		
		boolean isUserCreated = false;
		String sql1 = "insert into public.account(username, password, email, created_on, last_login)"
                 + "values (?, ?, ?, ?, ?)";
			try {
				conn = DriverManager.getConnection(url, username, password);
	            PreparedStatement st = conn.prepareStatement(sql1);
	            st.setString(1,user.getUsername());
	            st.setString(2, user.getPassword());
	            st.setDate(4, new java.sql.Date(System.currentTimeMillis()));
	            st.setDate(5, new java.sql.Date(System.currentTimeMillis()));       
	            st.executeUpdate();             
	            conn.close();
	            isUserCreated = true;
	        }
			catch (SQLException e) {
	            e.printStackTrace();
	        }
			return isUserCreated;
	}

	@Override
	public boolean update(User user) {
		// Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(User user) {
		// Auto-generated method stub
		return false;
	}
	
	@Override
	public List<User> read(User t) {
		// TODO Auto-generated method stub
		return null;
	}

}
