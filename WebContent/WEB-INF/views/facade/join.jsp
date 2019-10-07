<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="../common/head.jsp"/>	
<div>1</div>
<div>
</div>
<div>3</div>
<div>4</div>
	<div id ="join_wrapper">
	<form id="join_form" >

	<div class="join_inner_form" >
	<div>empNo </div><div><input type="text" name="empno" class="join_input" id="empno"></div>	
	<div>eName </div><div><input type="password" name="ename" class="join_input" id="ename"></div>	
	<div>job </div><div><input type="text" name="job" class="join_input"></div>	
	<div>MGR</div><div><input type="text" name="mgr"class="join_input"></div>	
	<div>hireDate</div><div><input type="text" name="hiredate" class="join_input"></div>	
	<div>보너스 </div><div><input type="text" name="comm" class="join_input"></div>	
	<div>deptNo </div><div><input type="text" name="deptno" class="join_input" id="deptno"></div>	
		<input type="hidden" name="action" value="join"> 
		<input type="hidden" name="page" value="main">
	<div id="submit_form"><input type="button" value="회원가입"  id="join_submit">
	<input type="button" value="뒤로가기"  id="back_page">
	</div>
	</div>	
	</form> 
	</div>

<div>6</div>
<div>7</div>
<div>9</div>
<script>
	app.init('${ctx}');
</script>
<jsp:include page="../common/foot.jsp"/>
</html>