package com.app.Entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

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
@ToString
@JsonIgnoreType
public class Course extends BaseEntity {

	//course title(unique) , start date , end date , fees , min score
	@Column(unique = true)
	private String cTitle;
	
	private LocalDate startDate;
	
	private LocalDate endDate;
	
	private Integer fees;
	
	private Integer minScore;
	
	@OneToMany(mappedBy = "title",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<Student> studentList = new ArrayList<>();
}
