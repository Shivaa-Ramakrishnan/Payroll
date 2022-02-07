package com.myfss.beans;


public class Employee {
	 String employeeId;
		String firstName;
		String lastName;
		String email;
		String phone;
		String date;
		String login_id;
		String position;
		String doj;
		String employee_grade;
		String team;
		String company_name;
		public Employee(String employeeId, String firstName, String lastName,
				String email, String phone, String date, String login_id,
				String position, String doj, String employee_grade,
				String team, String company_name) {
			super();
			this.employeeId = employeeId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.phone = phone;
			this.date = date;
			this.login_id = login_id;
			this.position = position;
			this.doj = doj;
			this.employee_grade = employee_grade;
			this.team = team;
			this.company_name = company_name;
		}
		@Override
		public String toString() {
			return "Employee [employeeId=" + employeeId + ", firstName="
					+ firstName + ", lastName=" + lastName + ", email=" + email
					+ ", phone=" + phone + ", date=" + date + ", login_id="
					+ login_id + ", position=" + position + ", doj=" + doj
					+ ", employee_grade=" + employee_grade + ", team=" + team
					+ ", company_name=" + company_name + "]";
		}
		public String getEmployeeId() {
			return employeeId;
		}
		public void setEmployeeId(String employeeId) {
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
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public String getLogin_id() {
			return login_id;
		}
		public void setLogin_id(String login_id) {
			this.login_id = login_id;
		}
		public String getPosition() {
			return position;
		}
		public void setPosition(String position) {
			this.position = position;
		}
		public String getDoj() {
			return doj;
		}
		public void setDoj(String doj) {
			this.doj = doj;
		}
		public String getEmployee_grade() {
			return employee_grade;
		}
		public void setEmployee_grade(String employee_grade) {
			this.employee_grade = employee_grade;
		}
		public String getTeam() {
			return team;
		}
		public void setTeam(String team) {
			this.team = team;
		}
		public String getCompany_name() {
			return company_name;
		}
		public void setCompany_name(String company_name) {
			this.company_name = company_name;
		}
}