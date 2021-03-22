package com.helth.and.insurance.ar.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import lombok.Data;

@Entity
@Data
@Table(name = "APPLICATIONREGISTARION")
public class ApplicationRegistarion {
	@Id
	@GenericGenerator(name = "application_registration", strategy = "com.helth.and.insurance.ar.gen.ApplicationNumberGenerater")
	@GeneratedValue(generator = "application_registration")
	private String applNo;
	private String firstName;
	private String LastName;
	private String gender;
	private String mobile;
	private String email;
	private String dateofBirth;

}
