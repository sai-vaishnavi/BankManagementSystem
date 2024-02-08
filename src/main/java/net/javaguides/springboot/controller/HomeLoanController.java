package net.javaguides.springboot.controller;


import java.text.ParseException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import net.javaguides.springboot.model.Customer;
import net.javaguides.springboot.model.HomeLoan;
import net.javaguides.springboot.repository.CustomerRepository;
import net.javaguides.springboot.repository.HomeLoanRepository;

@RestController
@RequestMapping(value = "api/hloan")
public class HomeLoanController {
  
	
	@Autowired
	HomeLoanRepository homeLoanRepository;
	
	@Autowired
	CustomerRepository customerRepository;
	
	@PostMapping("/save")
	public String save(@RequestBody String data) throws ParseException{
	
		Gson gson = new Gson();
		
		HomeLoanData homeLoanData = gson.fromJson(data, HomeLoanData.class);
		
		Optional<Customer> customerHL = customerRepository.findById(homeLoanData.getHomeLoanCustomerId());
		
		HomeLoan homeLoan = new HomeLoan();
		homeLoan.setHomeLoanCustomerId(homeLoanData.getHomeLoanCustomerId());
		homeLoan.setCustomerHL(customerHL.get());
		homeLoan.setHomeLoanDuration(homeLoanData.getHomeLoanDuration());
		homeLoan.setHomeLoanAmount(homeLoanData.getHomeLoanAmount());
		homeLoan.setHomeLoanInterest(homeLoanData.getHomeLoanInterest());
		
		int inst=12*homeLoanData.getHomeLoanDuration();
		homeLoanData.setHomeLoanInstallments(inst);
		homeLoan.setHomeLoanInstallments(homeLoanData.getHomeLoanInstallments());
		
		double m=homeLoanData.getHomeLoanAmount()/inst;
		homeLoanData.setHomeLoanMonthlyAmount(m);
		homeLoan.setHomeLoanMonthlyAmount(homeLoanData.getHomeLoanMonthlyAmount());
		
		double mi=homeLoanData.getHomeLoanMonthlyAmount()*homeLoanData.getHomeLoanInterest()*0.01;
		homeLoanData.setHomeLoanMonthlyInterest(mi);
		homeLoan.setHomeLoanMonthlyInterest(homeLoanData.getHomeLoanMonthlyInterest());
		
		double glEMI=homeLoanData.getHomeLoanMonthlyInterest() + homeLoanData.getHomeLoanMonthlyAmount();
		homeLoanData.setHomeLoanEMI(glEMI);
		homeLoan.setHomeLoanEMI(homeLoanData.getHomeLoanEMI());
		
		double tt=homeLoanData.getHomeLoanEMI()*homeLoanData.getHomeLoanInstallments();
		homeLoanData.setHomeLoanTotalPay(tt);
		homeLoan.setHomeLoanTotalPay(homeLoanData.getHomeLoanTotalPay());
		
		homeLoanData.setHomeLoanPrinciplePay(0);
		homeLoan.setHomeLoanPrinciplePay(homeLoanData.getHomeLoanPrinciplePay());
		
		homeLoanData.setHomeLoanPrincipleBalance(homeLoanData.getHomeLoanTotalPay());
		homeLoan.setHomeLoanPrincipleBalance(homeLoanData.getHomeLoanPrincipleBalance());
		
		homeLoanRepository.save(homeLoan);
		return homeLoan.getHomeLoanPrincipleBalance()+"";
	}
	
	
	
}
