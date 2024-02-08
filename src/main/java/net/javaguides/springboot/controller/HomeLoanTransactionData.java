package net.javaguides.springboot.controller;




import java.util.Date;


public class HomeLoanTransactionData {
	
	private long homeLoanId;
	
	private String homeLoanTrasactionTime;
	
	private double homeLoanAmountPaid;
	
	
	private double homeLoanPrinciplePay;//Total amount paid till now
	
	private double homeLoanPrincipleBalance;//Total balance left

	
	public long getHomeLoanId() {
		return homeLoanId;
	}

	public void setHomeLoanId(long homeLoanId) {
		this.homeLoanId = homeLoanId;
	}

	public String getHomeLoanTrasactionTime() {
		return homeLoanTrasactionTime;
	}

	public void setHomeLoanTrasactionTime(String HomeLoanTrasactionTime) {
		this.homeLoanTrasactionTime = HomeLoanTrasactionTime;
	}

	public double getHomeLoanAmountPaid() {
		return homeLoanAmountPaid;
	}

	public void setHomeLoanAmountPaid(double HomeLoanAmountPaid) {
		this.homeLoanAmountPaid = HomeLoanAmountPaid;
	}

	public double getHomeLoanPrinciplePay() {
		return homeLoanPrinciplePay;
	}

	public void setHomeLoanPrinciplePay(double HomeLoanPrinciplePay) {
		this.homeLoanPrinciplePay = HomeLoanPrinciplePay;
	}

	public double getHomeLoanPrincipleBalance() {
		return homeLoanPrincipleBalance;
	}

	public void setHomeLoanPrincipleBalance(double HomeLoanPrincipleBalance) {
		this.homeLoanPrincipleBalance = HomeLoanPrincipleBalance;
	}
	
	
}
