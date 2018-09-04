package com.febonos.school;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class DairyPK implements Serializable {
	// This annotation makes the date saved just the yyyy-MM-dd format.
	// Not the time and millis
	@Temporal(TemporalType.DATE)
	protected Date entryDate;
	protected String grade;
	protected String section;
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Date getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}
	
	/*@Override
	public String toString() {
		SimpleDateFormat dtFormat = new SimpleDateFormat("yyyy-MM-dd");
		String format = dtFormat.format(entryDate);
		return "?findByDairyPkEntryDateAndDairyPkGradeAndDairyPkSectionAndDairyPkSubject?date=" + format + "&grade=" + grade + "&section=" + section + "&subject=" + subject; 
	}*/
	
}