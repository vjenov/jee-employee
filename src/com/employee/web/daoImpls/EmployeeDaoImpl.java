package com.employee.web.daoImpls;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.employee.web.daos.EmployeeDao;
import com.employee.web.domains.EmployeeBean;
import com.employee.web.factory.DatabaseFactory;
import com.employee.web.pool.Constants;

public class EmployeeDaoImpl implements EmployeeDao{
	private static EmployeeDaoImpl instance = new EmployeeDaoImpl();
	private EmployeeDaoImpl() {}
	public static EmployeeDaoImpl getInstance() {return instance;}
	@Override
	public EmployeeBean login(EmployeeBean param) {
		EmployeeBean result = new EmployeeBean();
		String sql = "SELECT *\r\n" + 
				"FROM EMP\r\n" + 
				"WHERE DEPTNO LIKE ? AND EMPNO LIKE ? AND ENAME LIKE ?";
		try {
			PreparedStatement pstmt = DatabaseFactory
					.createDatabase(Constants.VENDOR)
					.getConnection()
					.prepareStatement(sql);
			pstmt.setString(1, param.getDeptno().trim());
			pstmt.setString(2, param.getEmpno().trim());
			pstmt.setString(3, param.getEname().trim());
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				result.setEmpno(rs.getString("empno"));
				result.setEname(rs.getString("ename"));
				result.setJob(rs.getString("job"));
				result.setMgr(rs.getString("mgr"));
				result.setHiredate(rs.getString("hiredate"));
				result.setSal(rs.getString("sal"));
				result.setComm(rs.getString("comm"));
				result.setDeptno(rs.getString("deptno"));
				System.out.println(result.toString());
			}
	} catch (Exception e) {
		e.printStackTrace();
	}
	return result;
		
	}

	@Override
	public int insertEmployee(EmployeeBean param) {
		System.out.println("insertEmployee ::: " + param.toString());
		int rs =0;
		String sql = "INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)\r\n" + 
				"VALUES(?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement pstmt = DatabaseFactory
					.createDatabase(Constants.VENDOR)
					.getConnection()
					.prepareStatement(sql);
			pstmt.setString(1, param.getEmpno());
			pstmt.setString(2, param.getEname());
			pstmt.setString(3, param.getJob());
			pstmt.setString(4, param.getMgr());
			pstmt.setString(5, param.getHiredate());
			pstmt.setString(6, param.getSal());
			pstmt.setString(7, param.getComm());
			pstmt.setString(8, param.getDeptno());
			rs = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}

}
