package cn.itcast.ssh.web.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

import cn.itcast.ssh.domain.User;
import cn.itcast.ssh.utils.SessionContext;

public class LoginInterceptor implements Interceptor {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		
		User user = SessionContext.get();
		String actionName = invocation.getProxy().getActionName();
		if (!"login".equals(actionName)) {
			if (user==null) {
				return "login";
			}
		}		
		return invocation.invoke();
	}

}
