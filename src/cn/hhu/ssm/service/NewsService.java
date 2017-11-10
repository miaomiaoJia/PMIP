package cn.hhu.ssm.service;

import cn.hhu.ssm.pojo.News;

public interface NewsService {
  public Boolean addNews(News news) throws Exception;
  
  public Boolean editNews(News news) throws Exception;
  
  public News selectNewsByStudent_Id(int student_id) throws Exception;
}
