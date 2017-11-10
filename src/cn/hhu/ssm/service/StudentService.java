package cn.hhu.ssm.service;

import cn.hhu.ssm.pojo.Student;

public interface StudentService {
    //根据用户名密码查询学生信息
	Student isExit(Student student) throws Exception;
	
	//添加学生信息
	Boolean addStudent(Student student) throws Exception;
	
	//修改密码
	Boolean  modifyPassword(Student student) throws Exception;
}
