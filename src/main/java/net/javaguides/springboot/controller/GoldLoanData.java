package net.javaguides.springboot.controller;




public class GoldLoanData {

	
	private long goldLoanCustomerId;
	
	private double goldLoanAmount;
	
	private int goldLoanDuration;
	
	private double goldLoanInterest;
	
	private int goldLoanInstallments;

	private double goldLoanMonthlyAmount;
	
    private double goldLoanMonthlyInterest;
	
	private double goldLoanEMI;
	
	private double goldLoanTotalPay;
	
	private double goldLoanPrinciplePay;//Total amount paid till now
	
	private double goldLoanPrincipleBalance;//Total balance left

	
	public double getGoldLoanMonthlyAmount() {
		return goldLoanMonthlyAmount;
	}

	public void setGoldLoanMonthlyAmount(double goldLoanMonthlyAmount) {
		this.goldLoanMonthlyAmount = goldLoanMonthlyAmount;
	}

	public double getGoldLoanMonthlyInterest() {
		return goldLoanMonthlyInterest;
	}

	public void setGoldLoanMonthlyInterest(double goldLoanMonthlyInterest) {
		this.goldLoanMonthlyInterest = goldLoanMonthlyInterest;
	}

	public double getGoldLoanEMI() {
		return goldLoanEMI;
	}

	public void setGoldLoanEMI(double goldLoanEMI) {
		this.goldLoanEMI = goldLoanEMI;
	}

	public double getGoldLoanTotalPay() {
		return goldLoanTotalPay;
	}

	public void setGoldLoanTotalPay(double goldLoanTotalPay) {
		this.goldLoanTotalPay = goldLoanTotalPay;
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

	public long getGoldLoanCustomerId() {
		return goldLoanCustomerId;
	}

	public void setGoldLoanCustomerId(long goldLoanCustomerId) {
		this.goldLoanCustomerId = goldLoanCustomerId;
	}

	public double getGoldLoanAmount() {
		return goldLoanAmount;
	}

	public void setGoldLoanAmount(double goldLoanAmount) {
		this.goldLoanAmount = goldLoanAmount;
	}

	public int getGoldLoanDuration() {
		return goldLoanDuration;
	}

	public void setGoldLoanDuration(int goldLoanDuration) {
		this.goldLoanDuration = goldLoanDuration;
	}

	public double getGoldLoanInterest() {
		return goldLoanInterest;
	}

	public void setGoldLoanInterest(double goldLoanInterest) {
		this.goldLoanInterest = goldLoanInterest;
	}

	public int getGoldLoanInstallments() {
		return goldLoanInstallments;
	}

	public void setGoldLoanInstallments(int goldLoanInstallments) {
		this.goldLoanInstallments = goldLoanInstallments;
	}
	
	

}
