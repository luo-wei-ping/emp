package com.yidu.pojo;

import java.util.Date;

/**
 * 实体类
 *
 * @author 罗伟平
 * @2019年1月4日
 * @下午6:19:54
 * @version 1.0
 */
public class Employees {
	private Integer employeeId     ;
	private String firstName      ;
	private String lastName       ;
	private String email          ;
	private String phoneNumber    ;
	private Date hireDate       ;
	private String jobId          ;
	private Integer salary         ;
	private Integer commissionPct  ;
	private Integer managerId      ;
	private Integer departmentId   ;
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public Integer getCommissionPct() {
		return commissionPct;
	}
	public void setCommissionPct(Integer commissionPct) {
		this.commissionPct = commissionPct;
	}
	public Integer getManagerId() {
		return managerId;
	}
	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	@Override
	public String toString() {
		return "Employees [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", phoneNumber=" + phoneNumber + ", hireDate=" + hireDate + ", jobId=" + jobId
				+ ", salary=" + salary + ", commissionPct=" + commissionPct + ", managerId=" + managerId
				+ ", departmentId=" + departmentId + "]";
	}
	
}
