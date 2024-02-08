package net.javaguides.springboot.controller;




public class HomeLoanData {

	
	private long homeLoanCustomerId;
	
	private double homeLoanAmount;
	
	private int homeLoanDuration;
	
	private double homeLoanInterest;
	
	private int homeLoanInstallments;

	private double homeLoanMonthlyAmount;
	
    private double homeLoanMonthlyInterest;
	
	private double homeLoanEMI;
	
	private double homeLoanTotalPay;
	
	private double homeLoanPrinciplePay;//Total amount paid till now
	
	private double homeLoanPrincipleBalance;//Total balance left

	
	public double getHomeLoanMonthlyAmount() {
		return homeLoanMonthlyAmount;
	}

	public void setHomeLoanMonthlyAmount(double homeLoanMonthlyAmount) {
		this.homeLoanMonthlyAmount = homeLoanMonthlyAmount;
	}

	public double getHomeLoanMonthlyInterest() {
		return homeLoanMonthlyInterest;
	}

	public void setHomeLoanMonthlyInterest(double homeLoanMonthlyInterest) {
		this.homeLoanMonthlyInterest = homeLoanMonthlyInterest;
	}

	public double getHomeLoanEMI() {
		return homeLoanEMI;
	}

	public void setHomeLoanEMI(double homeLoanEMI) {
		this.homeLoanEMI = homeLoanEMI;
	}

	public double getHomeLoanTotalPay() {
		return homeLoanTotalPay;
	}

	public void setHomeLoanTotalPay(double homeLoanTotalPay) {
		this.homeLoanTotalPay = homeLoanTotalPay;
	}

	public double getHomeLoanPrinciplePay() {
		return homeLoanPrinciplePay;
	}

	public void setHomeLoanPrinciplePay(double homeLoanPrinciplePay) {
		this.homeLoanPrinciplePay = homeLoanPrinciplePay;
	}

	public double getHomeLoanPrincipleBalance() {
		return homeLoanPrincipleBalance;
	}

	public void setHomeLoanPrincipleBalance(double homeLoanPrincipleBalance) {
		this.homeLoanPrincipleBalance = homeLoanPrincipleBalance;
	}

	public long getHomeLoanCustomerId() {
		return homeLoanCustomerId;
	}

	public void setHomeLoanCustomerId(long homeLoanCustomerId) {
		this.homeLoanCustomerId = homeLoanCustomerId;
	}

	public double getHomeLoanAmount() {
		return homeLoanAmount;
	}

	public void setHomeLoanAmount(double homeLoanAmount) {
		this.homeLoanAmount = homeLoanAmount;
	}

	public int getHomeLoanDuration() {
		return homeLoanDuration;
	}

	public void setHomeLoanDuration(int homeLoanDuration) {
		this.homeLoanDuration = homeLoanDuration;
	}

	public double getHomeLoanInterest() {
		return homeLoanInterest;
	}

	public void setHomeLoanInterest(double homeLoanInterest) {
		this.homeLoanInterest = homeLoanInterest;
	}

	public int getHomeLoanInstallments() {
		return homeLoanInstallments;
	}

	public void setHomeLoanInstallments(int homeLoanInstallments) {
		this.homeLoanInstallments = homeLoanInstallments;
	}
	
	

}
