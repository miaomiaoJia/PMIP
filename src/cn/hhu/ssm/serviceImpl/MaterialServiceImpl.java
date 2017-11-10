package cn.hhu.ssm.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import cn.hhu.ssm.mapper.MaterialMapper;
import cn.hhu.ssm.pojo.Material;
import cn.hhu.ssm.service.MaterialService;



public class MaterialServiceImpl implements MaterialService{
	@Autowired
	private MaterialMapper materialMapper;

	@Override
	public Boolean addMaterial(Material material) throws Exception {
		if(materialMapper.insert(material)>0){
			return true;
		}else{
			return false;
		}
	}

}
