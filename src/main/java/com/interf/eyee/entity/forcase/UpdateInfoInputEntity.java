package main.java.com.interf.eyee.entity.forcase;

import main.java.com.interf.eyee.entity.InputEntity;

/**
 * @author Ksewen
 *
 */
public class UpdateInfoInputEntity extends InputEntity {
	private String username;
	private String imageurl;
	private Integer sex;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getImageurl() {
		return imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

}
