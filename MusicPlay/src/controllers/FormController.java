package controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;


import beans.User;
import dao.UserDataAccessService;

/*
 * Vien Nguyen
 * CST361, Controller class
 * This class will receive requests and redirect the processing.
 */

@ManagedBean
@ViewScoped
public class FormController {

	@Inject
	UserDataAccessService u;

	public String userLogin(User user) {
		boolean login = u.login(user);
		if (login) {
			FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("user", user);
			return "TestResponse.xhtml";
		} else {
			return "LoginFail.xhtml";
		}
	}

}
