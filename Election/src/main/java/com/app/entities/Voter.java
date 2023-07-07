package com.app.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "password")
public class Voter extends BaseEntity{
	
	
	private String voterName;
	
	private String city;
	
	@Column(unique = true)
	@Email
	private String email;
	
	@Min(18)
	private Integer age;
	
	@Pattern(regexp = "^(?=.*[0-9])(?=.*[@#$%&])[a-zA-Z0-9@#$%&]{5,10}$")
	private String password;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	@Past
	private LocalDate dob;
	
	private Boolean votingStatus;	

}
