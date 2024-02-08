package net.javaguides.springboot.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import net.javaguides.springboot.model.Customer;
import net.javaguides.springboot.repository.CustomerRepository;

@RestController
@RequestMapping(value = "api/cust")
public class CustomerController {
	
	@Autowired
	CustomerRepository customerRepository;
	
	@PostMapping("/save")
	public String save(@RequestBody String data) throws ParseException{
		
		Gson gson = new Gson();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		CustomerData customerData = gson.fromJson(data, CustomerData.class);
		
		Customer customer = new Customer();
		customer.setAadhaarNo(customerData.getAadhaarNo());
		customer.setAccountNo("FP" + new Date().getTime());
		customer.setAddress(customerData.getAddress());
		customer.setDateOfBirth(dateFormat.parse(customerData.getDateOfBirth()));
		customer.setEmail(customerData.getEmail());
		customer.setFirstName(customerData.getFirstName());
		customer.setLastName(customerData.getLastName());
		customer.setPanCardNo(customerData.getPanCardNo());
		customer.setPhoneNo(customerData.getPhoneNo());
		
		customerRepository.save(customer);
		return customer.getAccountNo();
	}
	
	
	@GetMapping("/getAllCust")
	private List<CustomerData> getAllCust(){
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		List<CustomerData> customerDatas = new ArrayList<CustomerData>();
		List<Customer> customers = customerRepository.findAll();
		CustomerData cdata = null; 
		for(Customer data:customers){
			cdata = new CustomerData();
			cdata.setAadhaarNo(data.getAadhaarNo());
			cdata.setAddress(data.getAddress());
			cdata.setDateOfBirth(dateFormat.format(data.getDateOfBirth()));
			cdata.setEmail(data.getEmail());
			cdata.setFirstName(data.getFirstName());
			cdata.setLastName(data.getLastName());
			cdata.setPanCardNo(data.getPanCardNo());
			cdata.setPhoneNo(data.getPhoneNo());
			customerDatas.add(cdata);
			
		}
		return customerDatas;
	}
	
	
	
	@GetMapping("/")
	public String viewHomePage(Model model)
	{System.out.println("Hhhhhhhhhhhhhhhh..................");
		return "index";
	}
	@GetMapping("/login")
	public String login(Model model)
	{
		 //User user= userService.getUserByAccountNo(AccountNo);
		System.out.println("Hhhhhhhhhhhhhhhh..................");
	return "Register";
		}
}
