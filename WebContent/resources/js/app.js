var app=(()=>{
    return{
        init:(ctx)=>{
        	employeeService.login(ctx);
        	employeeService.moveJoin();
        	employeeJoin.join(ctx);

            $('#back_page').click(()=>{
            	alert('백페이지 이동');
            	location.assign("facade.do?action=move&page=login") 
            });
        }
    };
})();

var user=(()=>{
	var _empno, _ename, _job, _mgr, _hiredate, _sal, _comm, _deptno;
	var setDeptno = (deptno)=>{this._deptno = deptno;}
	var setEmpno = (empno) => {this._empno = empno;}
	var setEname = (ename) => {this._ename = ename;}
	var getDeptno = ()=>{return this._deptno;}
	var getEmpno = ()=>{return this._empno;}
	var getEname = ()=>{return this._ename;}
	return{
	setDeptno :  setDeptno,
	setEmpno : setEmpno,
	setEname : setEname,
	getDeptno : getDeptno,
	getEmpno : getEmpno,
	getEname : getEname
	};
})();
	
var employeeService = (()=>{
	return {
		login: (ctx)=>{
			$('#login_btn').click(()=>{
				if($('#deptno').val()===''){
					alert('deptno값이 없습니다');
				}else if($('#empno').val()===''){
					alert('empno값이 없습니다');
				}else if($('#ename').val()===''){
					alert('password값이 없습니다');
				}else{
					alert("입력한 정보: " + $('#deptno').val()+ " / "+$('#empno').val() + " / " +$('#ename').val());
					$('#login_form').attr('action', ctx+'/facade.do');
					$('#login_form').attr('method', 'POST');
					$('#login_form').submit();
				}
			});
		},
		moveJoin: ()=>{
	          $('#a_join').click(()=>{
	            	alert('회원가입 이동');
	            	location.assign("facade.do?action=move&page=join") 
	       });
		}
		
	};	
})();

var employeeJoin = (()=>{
	return {
		join: (ctx)=>{
			$('#join_submit').click(()=>{
				if($('#empno').val()===''){
					alert('empno값이 없습니다');
				}else if($('#ename').val()===''){
					alert('ename값이 없습니다');
				}else if($('#job').val()===''){
					alert('job값이 없습니다');
				}else if($('#mgr').val()===''){
					alert('mgr값이 없습니다');
				}else if($('#hiredate').val()===''){
					alert('hiredate값이 없습니다');
				}else if($('#sal').val()===''){
					alert('sal값이 없습니다');
				}else if($('#deptno').val()===''){
					alert('deptno값이 없습니다');
				}else{
					$('#join_form').attr('action', ctx+ '/facade.do?action=join' );
					$('#join_form').attr('method', 'POST' );
					$('#join_form').submit();
				}
			});
	}
};	
})();


