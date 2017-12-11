package cn.hhu.ssm.mapper;

import cn.hhu.ssm.pojo.Student;
import cn.hhu.ssm.pojo.StudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentMapper {
    int countByExample(StudentExample example);

    int deleteByExample(StudentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    List<Student> selectByExample(StudentExample example);

    Student selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
    //根据用户名密码查询用户
    Student isExit(Student student) throws Exception;
    //根据学生姓名和学号查询用户
    Student selectStuByNameNum(Student student) throws Exception;
    //根据id修改密码
    int modifyPassword(Student student) throws Exception;
    //查询所有的学生信息
    List<Student> selectAllStudent() throws Exception;
    //首次登陆添加邮箱,根据id修改学生信息
    Boolean insertEmail(Student student) throws Exception; 
}