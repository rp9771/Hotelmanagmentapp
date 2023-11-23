package com.tuespot.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tuespot.demo.Entity.SalaryDetails;

public interface SalaryDetailsRepository extends JpaRepository<SalaryDetails,Long> {

	SalaryDetails save(SalaryDetails salaryDetails);

}
