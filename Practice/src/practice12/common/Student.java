/*
 * Student.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice12.common;

/**
 * 受講生の情報を格納します
 * @author Rhizome
 *
 */
public class Student {
	/** 受講生ID */
	private int studentId;

	/** 受講生氏名 */
	private String studentName;

	/** 会社名 */
	private String companyName;

	/** 教室名 */
	private String className;

	/** メールアドレス */
	private String mail;

	/** パスワード */
	private String password;

	public void setStudentId(int num) {

		this.studentId = num;

	}

	public int getStudentId() {

		return studentId;

	}

	public void setStudentName(String str) {

		this.studentName = str;

	}

	public String getStudentName() {

		return studentName;

	}

	public void setCompanyName(String str) {

		this.companyName = str;

	}

	public String getCompanyName() {

		return companyName;

	}

	public void setClassName(String str) {

		this.className = str;

	}

	public String getClassName() {

		return className;

	}

	public void setMail(String str) {

		this.mail = str;

	}

	public String getMail() {

		return mail;

	}

	public void setPassword(String str) {

		this.password = str;

	}

	public String getPassword() {

		return password;

	}




}
