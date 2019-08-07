/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: StuMapper.java 
 * @Prject: a1
 * @Package: lzc.mapper 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2019年8月2日 下午7:11:07 
 * @version: V1.0   
 */
package lzc.mapper;

import java.util.List;

import lzc.entity.Student;

/** 
 * @ClassName: StuMapper 
 * @Description: TODO
 * @author: lenovo
 * @date: 2019年8月2日 下午7:11:07  
 */
public interface StuMapper {

	/** 
	 * @Title: list 
	 * @Description: TODO
	 * @return
	 * @return: List<Student>
	 */
	List<Student> list();

}
