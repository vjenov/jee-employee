<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div>1</div>
<div>
	<h2> 로그인</h2>
</div>
<div>3</div>
<div>4</div>
	<form id="login_form"  >
	<div class="input_form">
	<div id="login_item1">deptNo <input type="text" name="deptno" class="input_text" id="deptno"></div>	
	<div id="login_item3">empNo<input type="text" name="empno" class="input_text" id="empno"></div>	
	<div id="login_item4">password <input type="password" name="ename" class="input_text" id="ename"></div>	
	<input type="hidden" name="action" value="login">
	<input type="hidden" name="page" value="main">
	</div>	
	</form> 
<div>6</div>
<div>7</div>
<div>
<div id="login_item2"><input type="button" value="로그인"  id="login_btn"></div>
	<h3 id="join_a"><a href="#" id="a_join">회원가입</a>	</h3>
</div>
<div>9</div>

<script>
	app.init('${ctx}');
</script>
