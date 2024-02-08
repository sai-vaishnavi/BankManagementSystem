package net.javaguides.springboot.model;


import java.util.List;
import java.util.Optional;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="goldloan")
public class GoldLoan {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="gold_loan_id",nullable = false)
	private long goldLoanId;

	@Column(name="gold_loan_customer_id",nullable = false,insertable=false, updatable=false)
	private long goldLoanCustomerId;
	
	@Column(name="gold_loan_amount",nullable = false)
	private double goldLoanAmount;
	
	@Column(name="gold_loan_duration",nullable = false)
	private int goldLoanDuration;
	
	@Column(name="gold_loan_interest",nullable = false)
	private double goldLoanInterest;
	
	public List<GoldLoanTransaction> getGoldLoanTransaction() {
		return goldLoanTransaction;
	}

	public void setGoldLoanTransaction(List<GoldLoanTransaction> goldLoanTransaction) {
		this.goldLoanTransaction = goldLoanTransaction;
	}



	@Column(name="gold_loan_installments",nullable = false)
	private int goldLoanInstallments;

	
	 @OneToOne(fetch = FetchType.LAZY, optional = false)
	    @JoinColumn(name = "gold_loan_customer_id", nullable = false)
	    private Customer customerGL;
	
	 @OneToMany(mappedBy = "goldLoanGL", fetch = FetchType.LAZY,
	            cascade = CascadeType.ALL)
	    private List<GoldLoanTransaction> goldLoanTransaction;
	 public Customer getCustomerGL() {
			return customerGL;
		}

		public void setCustomerGL(Customer customerGL) {
			this.customerGL = customerGL;
		}
/*@OneToOne(mappedBy = "goldloan")
private User user;
public goldLoan()
{
	
}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}*/

	

	@Column(name="gold_loan_monthly_amount",nullable = false)
	private double goldLoanMonthlyAmount;
	
	@Column(name="gold_loan_monthly_interest",nullable = false)
	private double goldLoanMonthlyInterest;
	
	@Column(name="gold_loan_emi",nullable = false)//sum of lome_loan_monthly_pay and gold_loan_monthly_interest
	private double goldLoanEMI;
	
	@Column(name="gold_loan_total_pay",nullable = false)//sum of total EMI's
	private double goldLoanTotalPay;
	
	@Column(name="gold_loan_principle_pay",nullable = false)
	private double goldLoanPrinciplePay;//Total amount paid till now
	
	@Column(name="gold_loan_principle_balance",nullable = false)
	private double goldLoanPrincipleBalance;//Total balance left

	public long getGoldLoanId() {
		return goldLoanId;
	}

	public void setGoldLoanId(long goldLoanId) {
		this.goldLoanId = goldLoanId;
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
 
	
}
