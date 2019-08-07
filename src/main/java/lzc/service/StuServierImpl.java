/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: StuServierImpl.java 
 * @Prject: a1
 * @Package: lzc.service 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2019年8月2日 下午7:09:57 
 * @version: V1.0   
 */
package lzc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lzc.entity.Student;
import lzc.mapper.StuMapper;

/** 
 * @ClassName: StuServierImpl 
 * @Description: TODO
 * @author: lenovo
 * @date: 2019年8月2日 下午7:09:57  
 */
@Service
public class StuServierImpl implements StuServier {
	@Autowired
	StuMapper m;

	/* (non Javadoc) 
	 * @Title: list
	 * @Description: TODO
	 * @return 
	 * @see lzc.service.StuServier#list() 
	 */
	@Override
	public List<Student> list() {
		// TODO Auto-generated method stub
		return m.list();
	}

}
