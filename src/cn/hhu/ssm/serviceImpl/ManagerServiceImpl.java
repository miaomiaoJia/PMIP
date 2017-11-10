package cn.hhu.ssm.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.hhu.ssm.mapper.ManagerMapper;
import cn.hhu.ssm.mapper.StudentMapper;
import cn.hhu.ssm.pojo.Manager;
import cn.hhu.ssm.pojo.Student;
import cn.hhu.ssm.service.ManagerService;

public class ManagerServiceImpl implements ManagerService{
	@Autowired
    private StudentMapper studentMapper;
	@Autowired
	private ManagerMapper managerMapper;
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
	@Override
	public Boolean isExit(Manager manager) throws Exception {
		Manager m = managerMapper.isExit(manager);
		if(m==null)
		{
			return false;
		}else{
			return true;
		}
	}
	@Override
	public List<Student> selectAllStudent() throws Exception {
		return studentMapper.selectAllStudent();
	}
}
