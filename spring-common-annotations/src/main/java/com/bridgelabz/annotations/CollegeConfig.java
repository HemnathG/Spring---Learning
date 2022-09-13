package com.bridgelabz.annotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.bridgelabz.annotations")
@PropertySource("classpath:college-info.properties")
public class CollegeConfig {

	/*
	 * @Bean //for Constructor Injection public College collegeBean() { College
	 * college = new College(principalBean()); return college; }
	 */

	/*
	 * @Bean //for Setter Injection public College collegeBean() { College college =
	 * new College(); college.setPrincipal(principalBean());
	 * college.setTeacher(mathTeacherBean()); return college; }
	 * 
	 * @Bean public Principal principalBean() { return new Principal(); }
	 * 
	 * @Bean public Teacher mathTeacherBean() { return new MathTeacher(); }
	 */
}
