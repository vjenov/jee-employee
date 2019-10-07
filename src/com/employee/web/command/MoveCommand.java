package com.employee.web.command;

import javax.servlet.http.HttpServletRequest;


public class MoveCommand extends Command{

	public MoveCommand(HttpServletRequest request) {
		System.out.println("무브커맨드작동");
		setRequest(request);
		setAction(request.getParameter("action"));
		setDomain(request.getServletPath().substring(1,request.getServletPath().indexOf(".")));
		setPage(request.getParameter("page"));
        execute(getDomain(),getPage());
	}
}
