package com.bridgelabz.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {

	@Value("${college.name}")
	private String collegeName;

	@Autowired
	private Principal principal;

	@Autowired
	@Qualifier("scienceTeacher")
	private Teacher teacher;

	/*
	 * public College(Principal principal) { this.principal = principal; }
	 */

	/*
	 * public void setPrincipal(Principal principal) { this.principal = principal;
	 * System.out.println("AM USING setPrincipal METHOD"); }
	 * 
	 * public void setTeacher(Teacher teacher) { this.teacher = teacher; }
	 */

	public void test() {
		principal.principalInfo();
		teacher.teach();
		System.out.println("My College name is : " + collegeName);
		System.out.println("The Testing is happening and Working Good !!! ");
	}

}
