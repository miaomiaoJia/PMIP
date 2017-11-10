package cn.hhu.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.hhu.ssm.pojo.News;
import cn.hhu.ssm.service.NewsService;
@Controller
@RequestMapping(value="/news")
public class NewsController {
	@Autowired
  private NewsService newsService;
	@RequestMapping(value="/addNews")
	public String addNews(News news) throws Exception{
		Boolean flag = newsService.addNews(news);
		if(flag==true){
			return "";
		}else{
			return "";
		}
	}
}
