package com.employee.web.services;

import javax.servlet.http.HttpServletRequest;

import com.employee.web.domains.EmployeeBean;


public interface EmployeeService {
	public EmployeeBean login(HttpServletRequest request);
	public int join(HttpServletRequest request);
}
