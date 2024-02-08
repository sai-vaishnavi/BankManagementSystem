package net.javaguides.springboot.model;



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
@Table(name="goldloantransaction")
public class GoldLoanTransaction {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="gold_loan_transaction_id",nullable = false)
    private long goldLoanTransactionId;
	
	@Column(name="gold_loan_id",nullable = false,insertable=false, updatable=false)
	private long goldLoanId;
	
	@Column(name="gold_loan_transaction_time",nullable = false)
	private Date goldLoanTrasactionTime;
	
	@Column(name="gold_loan_amount_paid",nullable = false)
	private double goldLoanAmountPaid;
	
	
	@Column(name="gold_loan_principle_pay",nullable = false)
	private double goldLoanPrinciplePay;//Total amount paid till now
	
	@Column(name="gold_loan_principle_balance",nullable = false)
	private double goldLoanPrincipleBalance;//Total balance left

	
	
	public GoldLoan getGoldLoanGL() {
		return goldLoanGL;
	}

	public void setGoldLoanGL(GoldLoan goldLoanGL) {
		this.goldLoanGL = goldLoanGL;
	}

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "gold_loan_id", nullable = false)
    private GoldLoan goldLoanGL;
	
	public long getGoldLoanTransactionId() {
		return goldLoanTransactionId;
	}

	public void setGoldLoanTransactionId(long goldLoanTransactionId) {
		this.goldLoanTransactionId = goldLoanTransactionId;
	}

	public long getGoldLoanId() {
		return goldLoanId;
	}

	public void setGoldLoanId(long goldLoanId) {
		this.goldLoanId = goldLoanId;
	}

	public Date getGoldLoanTrasactionTime() {
		return goldLoanTrasactionTime;
	}

	public void setGoldLoanTrasactionTime(Date goldLoanTrasactionTime) {
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
