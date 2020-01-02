package org.railwayspringboot.model;

public class Employee {

	private Integer empid;                 // Text comment 
	private String empfirstName;
	private String emplastName;
	private String empemail;
	
	public Employee() {
		
	}
	
	public Employee(Integer empid, String empfirstName, String emplastName, String empemail) {
		super();
		this.empid = empid;
		this.empfirstName = empfirstName;
		this.emplastName = emplastName;
		this.empemail = empemail;
	}

	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getEmpfirstName() {
		return empfirstName;
	}
	public void setEmpfirstName(String empfirstName) {
		this.empfirstName = empfirstName;
	}
	public String getEmplastName() {
		return emplastName;
	}
	public void setEmplastName(String emplastName) {
		this.emplastName = emplastName;
	}
	public String getEmpemail() {
		return empemail;
	}
	public void setEmpemail(String empemail) {
		this.empemail = empemail;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empfirstName=" + empfirstName + ", emplastName=" + emplastName
				+ ", empemail=" + empemail + "]";
	}
	
	
}
