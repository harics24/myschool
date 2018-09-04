package com.febonos.school;


import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
public class Dairy {
	@EmbeddedId
	private DairyPK dairyPk;
	private String classWork;
	private String homeWork;
	
	public DairyPK getDairyPk() {
		return dairyPk;
	}
	public void setDairyPk(DairyPK dairyPk) {
		this.dairyPk = dairyPk;
	}
	
	
	@Transient
	public String getSubject() {
		return dairyPk.getSubject();
	}
	
	@Transient
	public String getClassName() {
		return dairyPk.getGrade() + " - " + dairyPk.getSection();
	}

	public void setClassWork(String classWork) {
		this.classWork = classWork;
	}
	public String getHomeWork() {
		return homeWork;
	}
	public void setHomeWork(String homeWork) {
		this.homeWork = homeWork;
	}
}