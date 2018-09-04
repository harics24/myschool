package com.febonos.school;


import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.format.annotation.DateTimeFormat;

@RepositoryRestResource(collectionResourceRel = "dairy2", path = "dairy2")
public interface DairyRepository extends JpaRepository<Dairy, DairyPK> {
	List<Dairy> findByDairyPkSubject(@Param("subject") String subject);
	List<Dairy> findByDairyPkEntryDate(@DateTimeFormat(pattern = "yyyy-MM-dd")  @Param("date") Date date);
	List<Dairy> findByDairyPkEntryDateAndDairyPkGradeAndDairyPkSectionAndDairyPkSubject(
			@DateTimeFormat(pattern = "yyyy-MM-dd")  @Param("date") Date date, 
			@Param("grade") String grade,
			@Param("section") String section,
			@Param("subject") String subject
			);
	List<Dairy> findByDairyPkEntryDateAndDairyPkGradeAndDairyPkSection(
			@DateTimeFormat(pattern = "yyyy-MM-dd")  @Param("date") Date date, 
			@Param("grade") String grade,
			@Param("section") String section
			);
}