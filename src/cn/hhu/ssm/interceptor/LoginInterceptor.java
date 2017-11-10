package cn.hhu.ssm.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import cn.hhu.ssm.pojo.Manager;
import cn.hhu.ssm.pojo.Student;

public class LoginInterceptor implements HandlerInterceptor{
    //handel方法执行之后
	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}
    //进入handel方法,返回模型和视图之前
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub
		
	}
    //handel方法执行之前
	//登录认证
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object arg2) throws Exception {
		String url = request.getRequestURI();
		if(url.indexOf("login.action")>0)
		{
			return true;
		}
		HttpSession session = request.getSession();
		
		Student student = (Student) session.getAttribute("student");
		
		Manager manager = (Manager) session.getAttribute("manager");
		
		if(student==null && manager==null)
		{
			response.sendRedirect(request.getContextPath()+"/login.jsp");
			return false;
		}else{
			return true;
		}
	}
}
