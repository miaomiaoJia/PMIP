package cn.hhu.ssm.service;

import java.util.List;

import cn.hhu.ssm.pojo.Material;

/**
 * 定义材料服务接口
 * @author 金培源
 *
 */
public interface MaterialService {
	//添加材料的信息
  Boolean addMaterial(Material material) throws Exception;
  
   //查询对应学生所有的材料
  List<Material> selectByStudentId(Integer student_id) throws Exception;
  
  //根据材料id查询材料
  Material selectById(Integer id) throws Exception;
}
