package cn.hhu.ssm.service;

import java.util.List;

import cn.hhu.ssm.pojo.Manager;
import cn.hhu.ssm.pojo.Student;

public interface ManagerService {
	//添加学生信息
  Boolean addStudent(Student student) throws Exception;
  
  //根据用户名密码查询用户
  Boolean isExit(Manager manager) throws Exception;
  
  //查询所有的学生信息
  List<Student> selectAllStudent() throws Exception;
}
