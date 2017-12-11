package cn.hhu.ssm.mapper;

import cn.hhu.ssm.pojo.Material;
import cn.hhu.ssm.pojo.MaterialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaterialMapper {
    int countByExample(MaterialExample example);

    int deleteByExample(MaterialExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Material record);

    int insertSelective(Material record);

    List<Material> selectByExample(MaterialExample example);

    Material selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Material record, @Param("example") MaterialExample example);

    int updateByExample(@Param("record") Material record, @Param("example") MaterialExample example);

    int updateByPrimaryKeySelective(Material record);

    int updateByPrimaryKey(Material record);
    //根据学生id查询该学生的所有材料
    List<Material> selectByStudentId(Integer id) throws Exception;
    
    //根据材料的id查询材料
    Material selectById(Integer id) throws Exception;
    
}