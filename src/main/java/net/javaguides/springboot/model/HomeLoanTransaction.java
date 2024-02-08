package net.javaguides.springboot.model;


import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="homeloantransaction")
public class HomeLoanTransaction {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="home_loan_transaction_id",nullable = false)
    private long homeLoanTransactionId;
	
	@Column(name="home_loan_id",nullable = false,insertable=false, updatable=false)
	private long homeLoanId;
	
	@Column(name="home_loan_transaction_time",nullable = false)
	private Date homeLoanTrasactionTime;
	
	@Column(name="home_loan_amount_paid",nullable = false)
	private double homeLoanAmountPaid;
	
	
	@Column(name="home_loan_principle_pay",nullable = false)
	private double homeLoanPrinciplePay;//Total amount paid till now
	
	@Column(name="home_loan_principle_balance",nullable = false)
	private double homeLoanPrincipleBalance;//Total balance left

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "home_loan_id", nullable = false)
    private HomeLoan homeLoanHL;

	
	public HomeLoan getHomeLoanHL() {
		return homeLoanHL;
	}

	public void setHomeLoanHL(HomeLoan homeLoanHL) {
		this.homeLoanHL = homeLoanHL;
	}

	public long getHomeLoanTransactionId() {
		return homeLoanTransactionId;
	}

	public void setHomeLoanTransactionId(long homeLoanTransactionId) {
		this.homeLoanTransactionId = homeLoanTransactionId;
	}

	public long getHomeLoanId() {
		return homeLoanId;
	}

	public void setHomeLoanId(long homeLoanId) {
		this.homeLoanId = homeLoanId;
	}

	public Date getHomeLoanTrasactionTime() {
		return homeLoanTrasactionTime;
	}

	public void setHomeLoanTrasactionTime(Date homeLoanTrasactionTime) {
		this.homeLoanTrasactionTime = homeLoanTrasactionTime;
	}

	public double getHomeLoanAmountPaid() {
		return homeLoanAmountPaid;
	}

	public void setHomeLoanAmountPaid(double homeLoanAmountPaid) {
		this.homeLoanAmountPaid = homeLoanAmountPaid;
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
	
	
}
