package cn.hhu.ssm.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.PageContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.embedded.OutputStreamFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import cn.hhu.ssm.pojo.Material;
import cn.hhu.ssm.pojo.Student;
import cn.hhu.ssm.service.MaterialService;
import cn.hhu.ssm.service.StudentService;


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
	@Autowired
	private StudentService studentService;
    //文件上传
	@RequestMapping(value="/uploadFile")
	public String uploadFile(HttpServletRequest request,MultipartFile uploadFile,String studentname,String studentnumber) throws Exception{
	if(uploadFile==null){
		request.setAttribute("uploadResult","您还未添加文件哦 0.0");
	    return "/uploadResult.jsp";
	}else{
		Student student = new Student();
		student.setStudentname(studentname);
		student.setStudentnumber(studentnumber);
		Student student1 = studentService.selectStuByNameNum(student);
		if(student1 == null){
			request.setAttribute("uploadResult", "请确认您所输入的学生！！！");
		    return "/uploadResult.jsp";
	}else{
		//得到文件的全名称
		String allName=uploadFile.getOriginalFilename();
		Material material = new Material();
		//文件存储路径
		String basePath="E:/pic";
		File file=new File(basePath);  
	    if (!file.exists()) {  
	        file.mkdirs();  
	    }  
	    File file2=new File(basePath,allName);  
	    if (!file2.exists()) {  
	        try {  
	            file2.createNewFile();  
	        } catch (IOException e) {  
	            // TODO Auto-generated catch block  
	            e.printStackTrace();  
	        }  
	    }  
		//filename即为文件类别，直接由前端传递过来
		uploadFile.transferTo(file2);
		material.setMaterialname(allName);
		material.setMaterialurl(basePath);//保存材料路径
		material.setState(0);//标为未读
		material.setStudentId(student1.getId());
		materialService.addMaterial(material);
		request.getSession().setAttribute("material", material);
		request.setAttribute("uploadResult","上传成功");
		return "/uploadResult.jsp";
				}
			}
	}
	//查询某一个学生的所有的材料
	@RequestMapping(value="/showAllMaterial")
	public String showAllMaterial(HttpSession session,HttpServletRequest request) throws Exception{
		Student student = (Student)session.getAttribute("student");
		List<Material> MaterialList = materialService.selectByStudentId(student.getId());
		request.setAttribute("MaterialList", MaterialList);
		return "/showAllMaterial.jsp";
	}
	//文件下载
	@RequestMapping(value="/download") 
	public String download(HttpServletRequest request,  
	        HttpServletResponse response,Integer id) throws Exception {  
	    // 得到要下载的文件名  
		response.setCharacterEncoding("UTF-8");  //防止中文乱码
		Material material = materialService.selectById(id);
	    String fileName = material.getMaterialname(); 
	    FileInputStream in = null;
	    OutputStream os = null;
	    try {  
	        // 获得保存在数据库中的文件保存路径 
	        String fileUrl = material.getMaterialurl();
	        //获取所要下载文件的绝对路径
	        String fullFileName = fileUrl + "/"+fileName;
	        response.setHeader("content-disposition", "attachment;filename="  
	                + URLEncoder.encode(fileName, "UTF-8"));
	        // 读取要下载的文件，保存到文件输入流  
	        in = new FileInputStream(fullFileName);  
	        os = response.getOutputStream();
	        // 创建输出流 ,向文件中写数据
	            byte[] b=new byte[1024];//每次写入的大小  
	            int i=0;  
	            while((i=in.read(b))>0){  
	                os.write(b,0,i);  
	            }  
	        }catch(Exception e){  
	            e.printStackTrace();  
	        }finally{  
	            in.close();  
	            os.close();  
	        } 
	    request.setAttribute("msg", "下载成功！！！");
	    return "/success.jsp";
	} 
}
