package cn.hhu.ssm.utils;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

/**
 * 发送邮件的工具类
 * @author 金培源
 *
 */
public class EmailUtil {
	//email为用户输入的邮箱地址(数据库中的邮箱地址)
	//verifyCode为生成类生成的验证码
   public static void sendEmail(String email,String verifyCode) throws AddressException, MessagingException{
	   
	   Properties prop = new Properties();
		prop.setProperty("mail.host", "smtp.163.com");
	    prop.setProperty("mail.smtp.auth", "true");
	    //设置邮箱的端口为465,通用的邮箱端口
	    final String smtpPort = "465";
       prop.setProperty("mail.smtp.port", smtpPort);
       prop.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
       prop.setProperty("mail.smtp.socketFactory.fallback", "false");
       prop.setProperty("mail.smtp.socketFactory.port", smtpPort);
		
		Authenticator auth = new Authenticator() {
			public PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("jpy1798776596", "jpy1798776596");
			}
		};
		
		Session session = Session.getDefaultInstance(prop, auth);
		
		session.setDebug(true);
		
		MimeMessage msg = new MimeMessage(session);

		msg.setFrom(new InternetAddress("jpy1798776596@163.com"));
		//user.getEmail(),目标邮箱地址
		msg.addRecipients(RecipientType.TO, email);
		//向邮件中添加验证码信息
		//生成验证码
		msg.setSubject("本次使用的验证码为：");
		msg.setText(verifyCode, "utf-8");
		//发送邮件
		Transport.send(msg);
		
   }
}
