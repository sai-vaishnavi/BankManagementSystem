package net.javaguides.springboot.controller;


public class GoldLoanTransactionData {
	
	private long goldLoanId;
	
	private String goldLoanTrasactionTime;
	
	private double goldLoanAmountPaid;
	
	
	private double goldLoanPrinciplePay;//Total amount paid till now
	
	private double goldLoanPrincipleBalance;//Total balance left

	
	public long getGoldLoanId() {
		return goldLoanId;
	}

	public void setGoldLoanId(long goldLoanId) {
		this.goldLoanId = goldLoanId;
	}

	public String getGoldLoanTrasactionTime() {
		return goldLoanTrasactionTime;
	}

	public void setGoldLoanTrasactionTime(String goldLoanTrasactionTime) {
		this.goldLoanTrasactionTime = goldLoanTrasactionTime;
	}

	public double getGoldLoanAmountPaid() {
		return goldLoanAmountPaid;
	}

	public void setGoldLoanAmountPaid(double goldLoanAmountPaid) {
		this.goldLoanAmountPaid = goldLoanAmountPaid;
	}

	public double getGoldLoanPrinciplePay() {
		return goldLoanPrinciplePay;
	}

	public void setGoldLoanPrinciplePay(double goldLoanPrinciplePay) {
		this.goldLoanPrinciplePay = goldLoanPrinciplePay;
	}

	public double getGoldLoanPrincipleBalance() {
		return goldLoanPrincipleBalance;
	}

	public void setGoldLoanPrincipleBalance(double goldLoanPrincipleBalance) {
		this.goldLoanPrincipleBalance = goldLoanPrincipleBalance;
	}
	
	
}
