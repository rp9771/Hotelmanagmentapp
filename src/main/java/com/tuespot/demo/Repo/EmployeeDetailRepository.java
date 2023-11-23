package com.tuespot.demo.Repo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tuespot.demo.Entity.EmployeeDetails;
import com.tuespot.demo.service.EmployeeDetailService;

@Repository
public interface EmployeeDetailRepository extends JpaRepository<EmployeeDetails,Long>{

	

}