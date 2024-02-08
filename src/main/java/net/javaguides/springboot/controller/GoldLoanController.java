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
import net.javaguides.springboot.model.GoldLoan;
import net.javaguides.springboot.repository.CustomerRepository;
import net.javaguides.springboot.repository.GoldLoanRepository;

@RestController
@RequestMapping(value = "api/gloan")
public class GoldLoanController {
  
	
	@Autowired
	GoldLoanRepository goldLoanRepository;
	
	@Autowired
	CustomerRepository customerRepository;
	
	@PostMapping("/save")
	public String save(@RequestBody String data) throws ParseException{
	
		Gson gson = new Gson();
		
		GoldLoanData goldLoanData = gson.fromJson(data, GoldLoanData.class);
		
		Optional<Customer> customerGL = customerRepository.findById(goldLoanData.getGoldLoanCustomerId());
		
		GoldLoan goldLoan = new GoldLoan();
		goldLoan.setGoldLoanCustomerId(goldLoanData.getGoldLoanCustomerId());
		goldLoan.setCustomerGL(customerGL.get());
		goldLoan.setGoldLoanDuration(goldLoanData.getGoldLoanDuration());
		goldLoan.setGoldLoanAmount(goldLoanData.getGoldLoanAmount());
		goldLoan.setGoldLoanInterest(goldLoanData.getGoldLoanInterest());
		
		int inst=12*goldLoanData.getGoldLoanDuration();
		goldLoanData.setGoldLoanInstallments(inst);
		goldLoan.setGoldLoanInstallments(goldLoanData.getGoldLoanInstallments());
		
		double m=goldLoanData.getGoldLoanAmount()/inst;
		goldLoanData.setGoldLoanMonthlyAmount(m);
		goldLoan.setGoldLoanMonthlyAmount(goldLoanData.getGoldLoanMonthlyAmount());
		
		double mi=goldLoanData.getGoldLoanMonthlyAmount()*goldLoanData.getGoldLoanInterest()*0.01;
		goldLoanData.setGoldLoanMonthlyInterest(mi);
		goldLoan.setGoldLoanMonthlyInterest(goldLoanData.getGoldLoanMonthlyInterest());
		
		double glEMI=goldLoanData.getGoldLoanMonthlyInterest()+goldLoanData.getGoldLoanMonthlyAmount();
		goldLoanData.setGoldLoanEMI(glEMI);
		goldLoan.setGoldLoanEMI(goldLoanData.getGoldLoanEMI());
		
		double tt=goldLoanData.getGoldLoanEMI()*goldLoanData.getGoldLoanInstallments();
		goldLoanData.setGoldLoanTotalPay(tt);
		goldLoan.setGoldLoanTotalPay(goldLoanData.getGoldLoanTotalPay());
		
		goldLoanData.setGoldLoanPrinciplePay(0);
		goldLoan.setGoldLoanPrinciplePay(goldLoanData.getGoldLoanPrinciplePay());
		
		goldLoanData.setGoldLoanPrincipleBalance(goldLoanData.getGoldLoanTotalPay());
		goldLoan.setGoldLoanPrincipleBalance(goldLoanData.getGoldLoanPrincipleBalance());
		
		goldLoanRepository.save(goldLoan);
		return goldLoan.getGoldLoanCustomerId()+"";
	}
	
	
	
}
