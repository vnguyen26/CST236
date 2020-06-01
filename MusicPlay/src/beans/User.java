package beans;

import java.security.Principal;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
/*
 * Vien Nguyen
 * CST361
 * This class is a User model.
 */
@ManagedBean
@ViewScoped
public class User {
	//User name
	@NotNull(message = "You have to enter your username!")
	@Size(min = 4, max = 15)
	String username = "";
	//Password
	@NotNull(message = "Enter your password!")
	@Size(min = 4, max = 15)
	String password = "";

	public User() {
		username = "Enter Username";
		password = "Enter Password";
	}
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
