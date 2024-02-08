package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.Customer;
import net.javaguides.springboot.model.GoldLoan;
@Repository
public interface GoldLoanRepository extends JpaRepository<GoldLoan,Long>  {

}
