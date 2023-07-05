package com.app.Entities;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="studentdetails")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "password")
@JsonIgnoreType
public class Student extends BaseEntity {
	
	//first name , last name , email , course title,score obtained.
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private String password;
	
	@ManyToOne
	private Course title;
	
	private Integer score;
	

}
