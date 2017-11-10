package cn.hhu.ssm.controller;

import java.io.File;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import cn.hhu.ssm.pojo.Material;
import cn.hhu.ssm.pojo.Student;
import cn.hhu.ssm.service.MaterialService;


/**
 * 材料控制器
 * @author 金培源
 *
 */
@Controller
@RequestMapping(value="material")
public class MaterialController {
	@Autowired
	private MaterialService materialService;
    //文件上传
	@RequestMapping(value="/uploadFile")
	public String uploadFile(HttpServletRequest request,MultipartFile uploadFile) throws Exception{
			if(uploadFile==null){
				request.setAttribute("uploadResult","您还未添加文件哦 0.0");
				return "/uploadResult.jsp";
			}else{
				//得到文件的全名称
				String allName=uploadFile.getOriginalFilename();
				Material material = new Material();
				//文件存储路径
				String basePath="E:\\pic";
				//重新定义文件名称路径
				String fileName=UUID.randomUUID()+allName.substring(allName.lastIndexOf("."));
				
				File file=new File(basePath+fileName);
				
				uploadFile.transferTo(file);
				Student student = (Student) request.getSession().getAttribute("student");
				material.setMaterialname(fileName);
				material.setMaterialurl(basePath);
				material.setState(0);
				material.setStudentId(student.getId());
				materialService.addMaterial(material);
				request.getSession().setAttribute("material", material);
				request.setAttribute("uploadResult","上传成功");
				return "/uploadResult.jsp";
			}
	}
	/*//文件下载
	@RequestMapping(value="/download") 
	public void downFile(HttpServletRequest request,  
	        HttpServletResponse response) {  
	    System.out.println("1");  
	    // 得到要下载的文件名  
	    String fileName = request.getParameter("filename");  
	    System.out.println("2");  
	    try {  
	        fileName = new String(fileName.getBytes("iso8859-1"), "UTF-8");  
	        System.out.println("3");  
	        // 获取上传文件的目录  
	        ServletContext sc = request.getSession().getServletContext();  
	        System.out.println("4");  
	        // 上传位置  
	        String fileSaveRootPath = sc.getRealPath("/img");   
	          
	        System.out.println(fileSaveRootPath + "\\" + fileName);  
	        // 得到要下载的文件  
	        File file = new File(fileSaveRootPath + "\\" + fileName);  
	          
	        // 如果文件不存在  
	        if (!file.exists()) {  
	            request.setAttribute("message", "您要下载的资源已被删除！！");  
	            System.out.println("您要下载的资源已被删除！！");  
	            return;  
	        }  
	        // 处理文件名  
	        String realname = fileName.substring(fileName.indexOf("_") + 1);  
	        // 设置响应头，控制浏览器下载该文件  
	        response.setHeader("content-disposition", "attachment;filename="  
	                + URLEncoder.encode(realname, "UTF-8"));  
	        // 读取要下载的文件，保存到文件输入流  
	        FileInputStream in = new FileInputStream(fileSaveRootPath + "\\" + fileName);  
	        // 创建输出流  
	        OutputStream out = response.getOutputStream();  
	        // 创建缓冲区  
	        byte buffer[] = new byte[1024];  
	        int len = 0;  
	        // 循环将输入流中的内容读取到缓冲区当中  
	        while ((len = in.read(buffer)) > 0) {  
	            // 输出缓冲区的内容到浏览器，实现文件下载  
	            out.write(buffer, 0, len);  
	        }  
	        // 关闭文件输入流  
	        in.close();  
	        // 关闭输出流  
	        out.close();  
	    } catch (Exception e) {  
	  
	    }  
	} */
}
