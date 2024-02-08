package net.javaguides.springboot.controller;


import java.text.ParseException;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import net.javaguides.springboot.model.Customer;
import net.javaguides.springboot.model.HomeLoan;
import net.javaguides.springboot.model.HomeLoanTransaction;
import net.javaguides.springboot.model.HomeLoan;
import net.javaguides.springboot.repository.CustomerRepository;
import net.javaguides.springboot.repository.HomeLoanRepository;
import net.javaguides.springboot.repository.HomeLoanTransactionRepository;

@RestController
@RequestMapping(value = "api/hloantrans")
public class HomeLoanTransactionController {
  
	
	@Autowired
	HomeLoanRepository homeLoanRepository;
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	HomeLoanTransactionRepository homeLoanTransactionRepository;
	
	@PostMapping("/save")
	public String save(@RequestBody String data) throws ParseException{
	
		Gson gson = new Gson();
		
		HomeLoanTransactionData homeLoanTransactionData = gson.fromJson(data, HomeLoanTransactionData.class);
		HomeLoan homeLoan=new HomeLoan();
		HomeLoanData homeLoanData=new HomeLoanData();
		//Optional<Customer> customerGL = customerRepository.findById(HomeLoanData.getHomeLoanCustomerId());
		Optional<HomeLoan> homeLoanHL=homeLoanRepository.findById(homeLoanTransactionData.getHomeLoanId());
		HomeLoanTransaction homeLoanTransaction=new HomeLoanTransaction();
		homeLoanTransaction.setHomeLoanId(homeLoanTransactionData.getHomeLoanId());
		homeLoanTransaction.setHomeLoanHL(homeLoanHL.get());
		homeLoanTransaction.setHomeLoanAmountPaid(homeLoanTransactionData.getHomeLoanAmountPaid());
		double pp=homeLoan.getHomeLoanPrinciplePay()+homeLoanTransactionData.getHomeLoanAmountPaid();
		double pb=homeLoan.getHomeLoanPrincipleBalance()-homeLoanTransactionData.getHomeLoanAmountPaid();
		homeLoanTransaction.setHomeLoanPrinciplePay(pp);
		homeLoanTransaction.setHomeLoanPrincipleBalance(pb);
		homeLoan.setHomeLoanPrinciplePay(pb);
		homeLoan.setHomeLoanPrincipleBalance(pb);
		homeLoanData.setHomeLoanPrinciplePay(pb);
		homeLoanData.setHomeLoanPrincipleBalance(pb);
		homeLoanTransaction.setHomeLoanTrasactionTime(new Date());
		homeLoanRepository.save(homeLoan);
		homeLoanTransactionRepository.save(homeLoanTransaction);
		return homeLoanTransaction.getHomeLoanPrincipleBalance()+"";
	}
	
	
	
}
