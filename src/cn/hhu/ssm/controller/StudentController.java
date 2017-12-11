package cn.hhu.ssm.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.hhu.ssm.mapper.NewsMapper;
import cn.hhu.ssm.pojo.News;
import cn.hhu.ssm.pojo.Student;
import cn.hhu.ssm.service.NewsService;
import cn.hhu.ssm.service.StudentService;
import cn.hhu.ssm.utils.EmailUtil;
import cn.hhu.ssm.utils.VerifyCodeUtil;

@Controller
@RequestMapping(value="/student")
public class StudentController {
	@Autowired
	private NewsService newsService;
	@Autowired
    private StudentService studentService;
	//登录
	@RequestMapping(value="/login")
	public String login(HttpServletRequest request,@RequestParam(value="username") String studentname,String password) throws Exception{
		 Student student = new  Student();
		 student.setStudentname(studentname);
		 student.setPassword(password);
		 Student result = studentService.isExit(student);
		 if(result==null)
		 {
			 //用户不存在
			 //保存错误信息
			 //返回登录页面
			 request.setAttribute("msg", "用户不存在！");
			 return "/login.jsp";
		 } 
		 //状态冻结,可能出现空指针异常,查询结果必须是student类型的对象
		 if(result.getState()==1)
		 {
			 request.setAttribute("msg", "状态冻结！");
			 return "/login.jsp";
		 }
		 if(result.getEmail()  == null){
			 request.setAttribute("msg", "首次登陆，请输入邮箱地址！！！");
			 request.getSession().setAttribute("student", result);
			 return "/email.jsp";
		 }
		 //登陆成功
		 request.getSession().setAttribute("student", result);
		 return "/index.jsp";
	}
	
	//首次登陆添加邮箱记录
	@RequestMapping(value = "/firstLogin")
	public String firstLogin(HttpSession session,String email) throws Exception{
		Student student = (Student)session.getAttribute("student");
		student.setEmail(email);
		studentService.insertEmail(student);
		session.setAttribute("student", student);
		return "/index.jsp";
	}
	
	//跳转到个人中心主页
	@RequestMapping(value="/personalInformation")
	public String personalInformation(HttpSession session) throws Exception{
	     Student student = (Student) session.getAttribute("student");
	     return "/personalinfo.jsp";
	}
	
	//退出当前登录
	@RequestMapping(value="/quit")
	public String quit(HttpServletRequest request) throws Exception{
		request.getSession().invalidate();
		return "/login.jsp";
	}
	
	//查看消息记录
	@RequestMapping(value="/news")
	public String news() throws Exception{
		System.out.println();
		return "/news.jsp";
	}
	//跳转到修改密码的页面
	@RequestMapping(value="toPassword")
	public String toPassword(HttpSession session) throws Exception{
		Student student = (Student)session.getAttribute("student");
		//生成验证码
		VerifyCodeUtil verifyCodeUtil = new VerifyCodeUtil();
		String verifyCode = verifyCodeUtil.getVerifyCode();
		session.setAttribute("verifyCode", verifyCode);		
		//发送验证码
		EmailUtil emailUtil = new EmailUtil();
		emailUtil.sendEmail(student.getEmail(), verifyCode);
		Date date = new Date();
		session.setAttribute("date", date);
		return "/modifyPassword.jsp";		
	}
	//修改密码
	@RequestMapping(value="/modifyPassword")
	public String modifyPassword(HttpSession session,String password,String verifyCode) throws Exception{
		Student student = (Student) session.getAttribute("student");
		String verifyCode1 = (String) session.getAttribute("verifyCode");
		Date date = (Date) session.getAttribute("date");
		Date date1 = new  Date();
		//设置验证码的有效时间为5分钟
		if(verifyCode.equals(verifyCode1) && ((date1.getTime()-date.getTime())/1000/60)<=5){
			student.setPassword(password);
			studentService.modifyPassword(student);
			return "/success.jsp";
		}else{
			//销毁验证码
			session.removeAttribute("verifyCode");
			return "/modifyPassword.jsp";
		}
	}
	//查看我的消息记录
	@RequestMapping(value="/seeNews")
	public String seeNews(HttpServletRequest request) throws Exception{
		   Student student = (Student) request.getSession().getAttribute("student");
		   News news1 = newsService.selectNewsByStudent_Id(student.getId());
		   //标为已读
		   news1.setNewsstate(1);
		   news1.setStudentId(student.getId());
		   request.setAttribute("news1", news1);
		   newsService.editNews(news1);
		   return "/showNews.jsp";
	}
}
