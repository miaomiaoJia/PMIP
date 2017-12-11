package cn.hhu.ssm.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.faces.application.Application;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.hhu.ssm.mapper.NewsMapper;
import cn.hhu.ssm.pojo.Manager;
import cn.hhu.ssm.pojo.News;
import cn.hhu.ssm.pojo.Student;
import cn.hhu.ssm.service.ManagerService;
@Controller
@RequestMapping(value="/manager")
public class ManagerController {
	@Autowired
	private NewsMapper newsMapper;
	@Autowired
   private ManagerService managerService;
	//添加学生信息
   @RequestMapping(value="/addStudent")
   public String addStudent(Student student) throws Exception{
	   Boolean flag = managerService.addStudent(student);
		
		if(flag==true)
		{
			return  "/success.jsp";
		}
		else{
			return "/index.jsp";
		}
   }
   //管理员登录
   @RequestMapping(value="/login")
   public String login(HttpSession session,@RequestParam(value="username") String accountname,String password) throws Exception{
	      Manager manager = new Manager();
	      manager.setAccountname(accountname);
	      manager.setPassword(password);
	      boolean result = managerService.isExit(manager);
	      //登录成功
	      if(result==true){
	    	  session.setAttribute("manager", manager);
	    	  return "/managerIndex.jsp";
	      }else{
	    	  	
	    	  return "/login.jsp";
	      }
   }
   //查询所有的学生信息
   @RequestMapping(value="seeAllStudent")
   public String seeAllStudent(HttpServletRequest request) throws Exception{
	   List<Student> allStudent = managerService.selectAllStudent();
	   request.setAttribute("allStudent", allStudent);
	   return "/showAllStudent.jsp";
   }
   //发送消息给学生
   @RequestMapping(value="/sendNews")
   public String sendNews(HttpSession session,News news) throws Exception{
	   Student student = (Student) session.getAttribute("student");
	   news.setNewstime(new Date());
	   news.setStudentId(student.getId());
	   newsMapper.insert(news);
	   return "/success.jsp";
   }
}
