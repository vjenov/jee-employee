package com.employee.web.daos;

import com.employee.web.domains.EmployeeBean;

public interface EmployeeDao {
	public EmployeeBean login(EmployeeBean param);
	public int insertEmployee(EmployeeBean param);
}
