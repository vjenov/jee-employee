package com.employee.web.command;

import javax.servlet.http.HttpServletRequest;
import com.employee.web.enums.Action;

public class Commander {

	public static Command directive(HttpServletRequest request) {
		Command cmd = new Command();
		System.out.println("커맨더 액션값 ::: " + request.getParameter("action"));
		switch (Action.valueOf(request.getParameter("action").toUpperCase())) {
		case MOVE:  cmd = new MoveCommand(request);
			break;
		case LOGIN: cmd = new LoginCommand(request);
			break;
		case JOIN: cmd = new JoinCommand(request);
			break;
		default :
		break;
		}
		return cmd;
	}
}