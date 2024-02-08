package net.javaguides.springboot.model;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class  Customer{
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="customer_id")
private long customerId;


@Column(name = "account_no",nullable = false)
private String accountNo;

@Column(name = "first_name",nullable = false)
private String firstName;

@Column(name = "last_name",nullable = false)
private String lastName;

@Column(name = "aadhaar_no" , unique=true,nullable = false)
private String aadhaarNo;

@Column(name = "pan_card_no",unique=true,nullable = false)
private String panCardNo;

@Column(name = "phone_no",nullable = false)
private String  phoneNo;

@Column(name = "email",nullable = false)
private String email;

@Column(name = "address",nullable = false)
private String address;

@Column(name = "date_of_birth",nullable = false)
private Date dateOfBirth;


@OneToOne(mappedBy = "customerGL", fetch = FetchType.LAZY,
cascade = CascadeType.ALL)
private GoldLoan goldLoan;

@OneToOne(mappedBy = "customerHL", fetch = FetchType.LAZY,
cascade = CascadeType.ALL)
private HomeLoan homeLoan;

public HomeLoan getHomeLoan() {
	return homeLoan;
}

public void setHomeLoan(HomeLoan homeLoan) {
	this.homeLoan = homeLoan;
}

public GoldLoan getGoldLoan() {
	return goldLoan;
}

public void setGoldLoan(GoldLoan goldLoan) {
	this.goldLoan = goldLoan;
}


public long getCustomerId() {
	return customerId;
}

public void setCustomerId(long customerId) {
	this.customerId = customerId;
}

public String getAccountNo() {
	return accountNo;
}

public void setAccountNo(String accountNo) {
	this.accountNo = accountNo;
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

public String getAadhaarNo() {
	return aadhaarNo;
}

public void setAadhaarNo(String aadhaarNo) {
	this.aadhaarNo = aadhaarNo;
}

public String getPanCardNo() {
	return panCardNo;
}

public void setPanCardNo(String panCardNo) {
	this.panCardNo = panCardNo;
}

public String getPhoneNo() {
	return phoneNo;
}

public void setPhoneNo(String phoneNo) {
	this.phoneNo = phoneNo;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public Date getDateOfBirth() {
	return dateOfBirth;
}

public void setDateOfBirth(Date dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}

/*@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "gold_Loan_Id", referencedColumnName = "account_no")
private GoldLoan goldLoan;

@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "home_Loan_Id", referencedColumnName = "account_no")
private HomeLoan homeLoan;
*/
/*public GoldLoan getGoldLoan() {
	return goldLoan;
}

public void setGoldLoan(GoldLoan goldLoan) {
	this.goldLoan = goldLoan;
}

public HomeLoan getHomeLoan() {
	return homeLoan;
}

public void setHomeLoan(HomeLoan homeLoan) {
	this.homeLoan = homeLoan;
}
*/

}
