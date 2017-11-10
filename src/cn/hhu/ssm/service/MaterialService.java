package cn.hhu.ssm.service;

import cn.hhu.ssm.pojo.Material;

/**
 * 定义材料服务接口
 * @author 金培源
 *
 */
public interface MaterialService {
  Boolean addMaterial(Material material) throws Exception;
}
