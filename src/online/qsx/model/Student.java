package online.qsx.model;

import java.util.Date;

public class Student {
	private int studentNo;
	private String loginPwd;
	private String studentName;
	private int sex;
	private int gradeId;
	private String phone;
	private String address;
	private Date bornDate;
	private String Email;
	private String identityGard;

	public int getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}

	public String getLoginPwd() {
		return loginPwd;
	}

	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getGradeId() {
		return gradeId;
	}

	public void setGradeId(int gradeId) {
		this.gradeId = gradeId;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getBornDate() {
		return bornDate;
	}

	public void setBornDate(Date bornDate) {
		this.bornDate = bornDate;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getIdentityGard() {
		return identityGard;
	}

	public void setIdentityGard(String identityGard) {
		this.identityGard = identityGard;
	}

	public Student(int studentNo, String loginPwd, String studentName, int sex, int gradeId, String phone,
			String address, Date bornDate, String email, String identityGard) {
		super();
		this.studentNo = studentNo;
		this.loginPwd = loginPwd;
		this.studentName = studentName;
		this.sex = sex;
		this.gradeId = gradeId;
		this.phone = phone;
		this.address = address;
		this.bornDate = bornDate;
		Email = email;
		this.identityGard = identityGard;
	}

	public Student(String loginPwd, String studentName, int sex, int gradeId, String phone, String address,
			Date bornDate, String email, String identityGard) {
		super();
		this.loginPwd = loginPwd;
		this.studentName = studentName;
		this.sex = sex;
		this.gradeId = gradeId;
		this.phone = phone;
		this.address = address;
		this.bornDate = bornDate;
		Email = email;
		this.identityGard = identityGard;
	}

	public Student(int studentNo) {
		super();
		this.studentNo = studentNo;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [studentNo=" + studentNo + ", loginPwd=" + loginPwd + ", studentName=" + studentName + ", sex="
				+ sex + ", gradeId=" + gradeId + ", phone=" + phone + ", address=" + address + ", bornDate=" + bornDate
				+ ", Email=" + Email + ", identityGard=" + identityGard + "]";
	}
}
