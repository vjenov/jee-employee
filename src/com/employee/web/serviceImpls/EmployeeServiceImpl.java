package com.employee.web.serviceImpls;

import javax.servlet.http.HttpServletRequest;

import com.employee.web.daoImpls.EmployeeDaoImpl;
import com.employee.web.domains.EmployeeBean;
import com.employee.web.services.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService{
	private static EmployeeServiceImpl instance = new EmployeeServiceImpl();
	private EmployeeServiceImpl () {}
	public static EmployeeServiceImpl getInstance() {return instance;}
	@Override
	public EmployeeBean login(HttpServletRequest request) {
		EmployeeBean param = new EmployeeBean();
		param.setDeptno(request.getParameter("deptno"));
		param.setEmpno(request.getParameter("empno"));
		param.setEname(request.getParameter("ename"));
		return EmployeeDaoImpl.getInstance().login(param);
	}


	@Override
	public int join(HttpServletRequest request) {
		EmployeeBean param = new EmployeeBean();
		param.setEmpno(request.getParameter("empno"));
		param.setEname(request.getParameter("ename"));
		param.setJob(request.getParameter("job"));
		param.setMgr(request.getParameter("mgr"));
		param.setHiredate(request.getParameter("hiredate"));
		param.setSal(request.getParameter("sal"));
		param.setComm(request.getParameter("comm"));
		param.setDeptno(request.getParameter("deptno"));
		
		System.out.println(param.toString()+"<<<<param");
		return EmployeeDaoImpl.getInstance().insertEmployee(param);
	}

}
