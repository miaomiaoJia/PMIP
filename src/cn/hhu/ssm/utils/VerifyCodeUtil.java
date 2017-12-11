package cn.hhu.ssm.utils;
/**
 * 纯数字验证码生成
 * @author 金培源
 *
 */
public class VerifyCodeUtil {
	//默认构造函数
	public VerifyCodeUtil(){
		
	}
	//生成6位验证码
    public static String getVerifyCode(){
    	String num = "";
    	for(int i = 0;i < 6;i ++){
    		num = num + (int)(Math.floor(Math.random()*9+1));
    	}
    	return num;
    }
}
