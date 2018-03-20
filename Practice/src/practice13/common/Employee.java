package practice13.common;

public class Employee extends Person{

	private String departmentNm;
	private String departmentCnt;

	public void setDepartmentNm(String departmentNm) {

		this.departmentNm = departmentNm;

	}
	public String getDepartmentNm() {

		return this.departmentNm;

	}

	public void setDepartmentCnt(String departmentCnt) {

		this.departmentCnt = departmentCnt;

	}
	public String getDepartmentCnt() {

		return this.departmentCnt;

	}

}
