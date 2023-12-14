package org.isetn.repository;

import java.util.List;

import org.isetn.entities.Absence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface AbsenceRepository extends JpaRepository<Absence , Long>{
	List<Absence> findByEtudiantId(Long etudiantId);
	
	//List<Absence> findByStartDateGreaterThanAndEndDateLessThan(Long startDate, Long endDate);
}
