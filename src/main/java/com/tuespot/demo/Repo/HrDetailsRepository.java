package com.tuespot.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tuespot.demo.Entity.HrDetails;

public interface HrDetailsRepository  extends JpaRepository<HrDetails,Long>{

	HrDetails save(HrDetails hrDetails); 

}
