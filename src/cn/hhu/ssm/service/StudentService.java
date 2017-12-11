package cn.hhu.ssm.service;

import cn.hhu.ssm.pojo.Student;

public interface StudentService {
    //根据用户名密码查询学生信息
	Student isExit(Student student) throws Exception;
	
	//根据用户名和学号查询用户
	Student selectStuByNameNum(Student student) throws Exception;
	
	//添加学生信息
	Boolean addStudent(Student student) throws Exception;
	
	//修改密码
	Boolean  modifyPassword(Student student) throws Exception;
	
	//添加邮箱记录
	Boolean insertEmail(Student student) throws Exception;
}
