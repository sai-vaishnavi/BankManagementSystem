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
@Table(name="homeloan")
public class HomeLoan {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="home_loan_id",nullable = false)
	private long homeLoanId;

	@Column(name="home_loan_customer_id",nullable = false,insertable=false, updatable=false)
	private long homeLoanCustomerId;
	
	@Column(name="home_loan_amount",nullable = false)
	private double homeLoanAmount;
	
	@Column(name="home_loan_duration",nullable = false)
	private int homeLoanDuration;
	
	@Column(name="home_loan_interest",nullable = false)
	private double homeLoanInterest;
	
	@Column(name="home_loan_installments",nullable = false)
	private int homeLoanInstallments;

	@OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "home_loan_customer_id", nullable = false)
    private Customer customerHL;
	
	 @OneToMany(mappedBy = "homeLoanHL", fetch = FetchType.LAZY,
	            cascade = CascadeType.ALL)
	    private List<HomeLoanTransaction> homeLoanTransaction;
	 
	public List<HomeLoanTransaction> getHomeLoanTransaction() {
		return homeLoanTransaction;
	}

	public void setHomeLoanTransaction(List<HomeLoanTransaction> homeLoanTransaction) {
		this.homeLoanTransaction = homeLoanTransaction;
	}

	public Customer getCustomerHL() {
		return customerHL;
	}

	public void setCustomerHL(Customer customerHL) {
		this.customerHL = customerHL;
	}
	
/*@OneToOne(mappedBy = "homeloan")
private User user;
public HomeLoan()
{
	
}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}*/

	

	@Column(name="home_loan_monthly_amount",nullable = false)
	private double homeLoanMonthlyAmount;
	
	@Column(name="home_loan_monthly_interest",nullable = false)
	private double homeLoanMonthlyInterest;
	
	@Column(name="home_loan_emi",nullable = false)//sum of lome_loan_monthly_pay and home_loan_monthly_interest
	private double homeLoanEMI;
	
	@Column(name="home_loan_total_pay",nullable = false)//sum of total EMI's
	private double homeLoanTotalPay;
	
	@Column(name="home_loan_principle_pay",nullable = false)
	private double homeLoanPrinciplePay;//Total amuunt paid till now
	
	@Column(name="home_loan_principle_balance",nullable = false)
	private double homeLoanPrincipleBalance;//Total balance left

	public long getHomeLoanId() {
		return homeLoanId;
	}

	public void setHomeLoanId(long homeLoanId) {
		this.homeLoanId = homeLoanId;
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
	
	

}
