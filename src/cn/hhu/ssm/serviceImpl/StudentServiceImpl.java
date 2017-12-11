package cn.hhu.ssm.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import cn.hhu.ssm.mapper.StudentMapper;
import cn.hhu.ssm.pojo.Student;
import cn.hhu.ssm.service.StudentService;

public class StudentServiceImpl implements StudentService{
	@Autowired
    private  StudentMapper studentMapper;

	@Override
	public Boolean addStudent(Student student) throws Exception {
		try{
		studentMapper.insert(student);
		return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
    //判断用户是否存在
	@Override
	public Student isExit(Student student) throws Exception {
		Student stu = studentMapper.isExit(student);
		if(stu==null){
			return null;
		}else{
			return stu;
		}
	}
	@Override
	public Boolean modifyPassword(Student student) throws Exception {
		int result = studentMapper.modifyPassword(student);
		if(result==1){
			return true;
		}else{
			return false;
		}
	}
	@Override
	public Boolean insertEmail(Student student) throws Exception {
		return studentMapper.insertEmail(student);
	}
	@Override
	public Student selectStuByNameNum(Student student) throws Exception {
		return studentMapper.selectStuByNameNum(student);
	}
}
