package com.employee.web.domains;

import java.io.Serializable;

import lombok.Data;
@Data
public class EmployeeBean implements Serializable{
	private static final long serialVersionUID= 1L;
	
	private String empno, ename, job, mgr, hiredate, sal, comm, deptno;
	
}
