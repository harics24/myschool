package com.febonos.school;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RepositoryRestController
public class StudentsController {
	
	@Autowired
	private StudentRepository studentRepo;
	
	@Autowired
	private DairyRepository dairyRepo;
	
	@RequestMapping (value="/students/names", method=RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getNames() {
		List<String> fullNames = new ArrayList<>();
		studentRepo.findAll().forEach(x -> fullNames.add(x.getFirstName() +  " " + x.getLastName()));
		return ResponseEntity.ok(fullNames);
	}
	
	
	@RequestMapping (value="/dairy/message", method=RequestMethod.GET)
	public @ResponseBody List<Dairy> getMessages(@RequestParam Date day, String grade, String section) {
		return dairyRepo.findByDairyPkEntryDateAndDairyPkGradeAndDairyPkSection(day, grade, section);
	}
}
