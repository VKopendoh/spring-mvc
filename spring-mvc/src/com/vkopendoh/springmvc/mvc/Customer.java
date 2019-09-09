package com.vkopendoh.springmvc.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.vkopendoh.springmvc.mvc.validation.CourseCode;

public class Customer {
	private String firstName;
	
	@NotNull(message = "is required")
	@Size(min=1, message = "is required")
	private String lastName;
	
	//for check NotNull we can't use primitive type int instead it we should use wrapper Integer
	@NotNull(message = "is required")
	@Min(value=0, message="must be >= 0")
	@Max(value=10, message="must be <= 10")
	private Integer freePasses;
	
	@Pattern(regexp = "^[0-9]{6}", message = "Must be 6 digits in the postal code")
	private String postalCode;
	
	@CourseCode
	private String courseCode;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	

}
