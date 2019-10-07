package com.employee.web.command;

import javax.servlet.http.HttpServletRequest;

import com.employee.web.domains.EmployeeBean;
import com.employee.web.serviceImpls.EmployeeServiceImpl;

public class LoginCommand extends Command{
	
	public LoginCommand(HttpServletRequest request) {
		setRequest(request);
		setAction(request.getParameter("action"));
		setDomain(request.getServletPath().substring(1,request.getServletPath().indexOf(".")));
		setPage(request.getParameter("page"));
		execute();
	}
	
	@Override
	public void execute() {
		EmployeeBean user = EmployeeServiceImpl.getInstance().login(request);
		System.out.println("로그인커맨드 접속" + user);
		if(user==null) {
			request.setAttribute("page", "login");
		}else {
			setDomain("employee");
			setPage("main");
		}
		request.getSession().setAttribute("user", (user ==null) ? "" : user);
		super.execute(getDomain(),getPage());
	}
	
}