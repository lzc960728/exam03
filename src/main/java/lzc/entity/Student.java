/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: Student.java 
 * @Prject: a1
 * @Package: lzc.entity 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2019年8月2日 下午7:00:59 
 * @version: V1.0   
 */
package lzc.entity;

/** 
 * @ClassName: Student 
 * @Description: TODO
 * @author: lenovo
 * @date: 2019年8月2日 下午7:00:59  
 */
public class Student {

	private Integer sid;
	private String sname;
	private Integer age;
	private String hobby;
	private String sex;
	private Integer cid;
	private Integer kid;
	private Integer[] kids;
	private String cname;
	private String kname;
	
	public Integer getKid() {
		return kid;
	}
	public void setKid(Integer kid) {
		this.kid = kid;
	}
	public Integer[] getKids() {
		return kids;
	}
	public void setKids(Integer[] kids) {
		this.kids = kids;
	}
	public String getKname() {
		return kname;
	}
	public void setKname(String kname) {
		this.kname = kname;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	
	
}
