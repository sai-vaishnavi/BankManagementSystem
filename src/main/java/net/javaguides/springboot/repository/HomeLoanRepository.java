package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.Customer;
import net.javaguides.springboot.model.HomeLoan;

@Repository
public interface HomeLoanRepository extends  JpaRepository<HomeLoan,Long>{

}
