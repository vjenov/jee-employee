<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../common/head.jsp"/>	
<div>1</div>
<div>안녕하세요  ${user.ename} 님! 반갑습니다. </div>
<div>3</div>
<div>4</div>
<div>
${user.empno}, ${user.ename}, ${user.job}, ${user.mgr}, ${user.hiredate}, ${user.sal}, ${user.comm}, ${user.deptno};
 </div>
<div>6</div>
<div>7</div>
<div>8</div>
<div>9</div>



<script>
app.init('${ctx}');
</script>
	<jsp:include page="../common/foot.jsp"/>	
</html>