package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.Customer;
import net.javaguides.springboot.model.HomeLoanTransaction;

@Repository
public interface HomeLoanTransactionRepository  extends JpaRepository<HomeLoanTransaction,Long>{

}
