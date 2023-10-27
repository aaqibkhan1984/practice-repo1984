package com.dru.care.app.bean;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component

public class InsertStudent {

		private String firstName;
	    private String lastName;
	    private String gender;
	    private String address;
	    private String email;
	    private String phone;
	    private String major;
	    private String enrollmentStatus;
	    private Double gpa;
	    private Integer totalMArks;
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
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
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
		public String getMajor() {
			return major;
		}
		public void setMajor(String major) {
			this.major = major;
		}
		public String getEnrollmentStatus() {
			return enrollmentStatus;
		}
		public void setEnrollmentStatus(String enrollmentStatus) {
			this.enrollmentStatus = enrollmentStatus;
		}
		public Double getGpa() {
			return gpa;
		}
		public void setGpa(Double gpa) {
			this.gpa = gpa;
		}
		public Integer getTotalMArks() {
			return totalMArks;
		}
		public void setTotalMArks(Integer totalMArks) {
			this.totalMArks = totalMArks;
		}
	
	
}
