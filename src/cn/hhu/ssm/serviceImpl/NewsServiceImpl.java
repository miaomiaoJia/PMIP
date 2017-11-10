package cn.hhu.ssm.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import cn.hhu.ssm.mapper.NewsMapper;
import cn.hhu.ssm.pojo.News;
import cn.hhu.ssm.service.NewsService;

public class NewsServiceImpl implements NewsService{
	@Autowired
    private NewsMapper newsMapper;
	@Override
	public Boolean addNews(News news) throws Exception {
		try{
		newsMapper.insert(news);
		return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	@Override
	public Boolean editNews(News news) throws Exception {
		int counter = newsMapper.updateByPrimaryKey(news);
		if(counter>0)
		{
			return true;
		}else{
			return false;
		}
	}
	@Override
	public News selectNewsByStudent_Id(int student_id) throws Exception {
		return newsMapper.selectNewsByStudent_Id(student_id);
	}
}
