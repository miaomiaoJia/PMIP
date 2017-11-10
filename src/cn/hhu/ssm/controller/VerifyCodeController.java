package cn.hhu.ssm.controller;

import java.awt.image.BufferedImage;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.cf.tools.VerifyCode;

/**
 * 定义验证码控制类
 * @author 金培源
 *
 */
public class VerifyCodeController {
	@RequestMapping(value="/getVerifyCode")
	@ResponseBody
	public void getVerifyCode(HttpServletRequest request,HttpServletResponse response) throws Exception{
		
		//创建验证码对象
		VerifyCode vc=new VerifyCode();
		//得到验证码对象
		BufferedImage image=vc.getImage();
		//得到验证码
		String verifyCode=vc.getText();
		
		//保存验证码信息
		request.getSession().setAttribute("verifyCode", verifyCode);
		 response.setContentType("image/png");
		//输出到客户端
		vc.createImage(image, response.getOutputStream());
		
	}
}
