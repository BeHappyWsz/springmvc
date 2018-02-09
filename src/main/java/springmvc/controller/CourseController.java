package springmvc.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import springmvc.dao.Des;
import springmvc.entity.Course;
import springmvc.service.CourseService;
/**
 * springmvc������
 * @author wsz
 * 2018��2��9��
 */
@Controller
@RequestMapping("/test")
public class CourseController {

	@Autowired 
	private CourseService courseService;
	
	@Des("������")
	@ResponseBody
	@RequestMapping("/hello")
	public String hello(String str) {
		courseService.test(str);
		return "index";
	}
	
	@Des("ת��")
	@ResponseBody
	@RequestMapping("/dispatcher")
	public String dispatcher(String str) {
		courseService.test(str);
		return "redirect/forward:***";
	}
	
	@Des("���ܶ���")
	@ResponseBody
	@RequestMapping("/model")
	public String model(@ModelAttribute Course course) {
		return "course";
	}
	
	@Des("��ȡhttp��Ϣ")
	@ResponseBody
	@RequestMapping("/http")
	public void http(HttpServletRequest request,HttpServletResponse response) {
		System.out.println(request);
		System.out.println(response);
	}
	
	@Des("�ϴ��ļ�")
	@ResponseBody
	@RequestMapping("/upload")
	public String upload(MultipartFile file) throws IOException {
		if(!file.isEmpty()) {
			//����λ��
			File f = new File("c:\\springmvc\\file");
			FileUtils.copyInputStreamToFile(file.getInputStream(), f);
		}
		return "success";
	}
}
