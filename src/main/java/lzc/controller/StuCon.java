/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: StuCon.java 
 * @Prject: a1
 * @Package: lzc.controller 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2019年8月2日 下午7:08:45 
 * @version: V1.0   
 */
package lzc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lzc.entity.Student;
import lzc.service.StuServier;

/** 
 * @ClassName: StuCon 
 * @Description: TODO
 * @author: lenovo
 * @date: 2019年8月2日 下午7:08:45  
 */
@Controller
public class StuCon {

	
	@Autowired
	StuServier s;
	
	@RequestMapping("list")
	public String list(Model model) {
		
		List<Student> list = s.list();
		model.addAttribute("list", list);
		return "list";
		
		
	}
}
