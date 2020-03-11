package com.cpk.entities;

import java.io.Serializable;

public class Patient implements Serializable{
	protected String uniqueIdentifyNumber;
	protected String mobileNo;
	protected String patientName;
	protected String gender;
	protected String email_address;
	public String getUniqueIdentifyNumber() {
		return uniqueIdentifyNumber;
	}
	public void setUniqueIdentifyNumber(String uniqueIdentifyNumber) {
		this.uniqueIdentifyNumber = uniqueIdentifyNumber;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail_address() {
		return email_address;
	}
	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}
	@Override
	public String toString() {
		return "Patient [uniqueIdentifyNumber=" + uniqueIdentifyNumber + ", mobileNo=" + mobileNo + ", patientName="
				+ patientName + ", gender=" + gender + ", email_address=" + email_address + "]";
	}
	
	

}
