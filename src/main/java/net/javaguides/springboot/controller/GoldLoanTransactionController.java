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
import net.javaguides.springboot.model.GoldLoan;
import net.javaguides.springboot.model.GoldLoanTransaction;
import net.javaguides.springboot.model.HomeLoan;
import net.javaguides.springboot.repository.CustomerRepository;
import net.javaguides.springboot.repository.GoldLoanRepository;
import net.javaguides.springboot.repository.GoldLoanTransactionRepository;

@RestController
@RequestMapping(value = "api/gloantrans")
public class GoldLoanTransactionController {
  
	
	@Autowired
	GoldLoanRepository goldLoanRepository;
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	GoldLoanTransactionRepository goldLoanTransactionRepository;
	
	@PostMapping("/save")
	public String save(@RequestBody String data) throws ParseException{
	
		Gson gson = new Gson();
		
		GoldLoanTransactionData goldLoanTransactionData = gson.fromJson(data, GoldLoanTransactionData.class);
		GoldLoanData goldLoanData;
		//Optional<Customer> customerGL = customerRepository.findById(goldLoanData.getGoldLoanCustomerId());
		Optional<GoldLoan> goldLoanGL=goldLoanRepository.findById(goldLoanTransactionData.getGoldLoanId());
		GoldLoanTransaction goldLoanTransaction=new GoldLoanTransaction();
		goldLoanTransaction.setGoldLoanId(goldLoanTransactionData.getGoldLoanId());
		goldLoanTransaction.setGoldLoanGL(goldLoanGL.get());
		goldLoanTransaction.setGoldLoanAmountPaid(goldLoanTransactionData.getGoldLoanAmountPaid());
		goldLoanTransaction.setGoldLoanPrinciplePay(goldLoanTransactionData.getGoldLoanPrinciplePay()+goldLoanTransactionData.getGoldLoanAmountPaid());
		goldLoanTransaction.setGoldLoanPrincipleBalance(goldLoanTransactionData.getGoldLoanPrincipleBalance()-goldLoanTransactionData.getGoldLoanAmountPaid());
		goldLoanTransaction.setGoldLoanTrasactionTime(new Date());
		goldLoanTransactionRepository.save(goldLoanTransaction);
		return goldLoanTransaction.getGoldLoanAmountPaid()+"";
	}
	
	
	
}
