package cn.hhu.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.hhu.ssm.pojo.News;
import cn.hhu.ssm.pojo.NewsExample;
import cn.hhu.ssm.pojo.Student;

public interface NewsMapper {
    int countByExample(NewsExample example);

    int deleteByExample(NewsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(News record);

    int insertSelective(News record);

    List<News> selectByExample(NewsExample example);

    News selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") News record, @Param("example") NewsExample example);

    int updateByExample(@Param("record") News record, @Param("example") NewsExample example);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKey(News record);
    
    News selectNewsByStudent_Id(int student_id) throws Exception;
    
    int editNews(News news) throws Exception;
}