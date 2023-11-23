package com.tuespot.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tuespot.demo.Entity.EmployeeAssets;

@Repository
public interface EmployeeAssestsRepository extends JpaRepository<EmployeeAssets, Long>{

}
