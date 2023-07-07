package com.app.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Past;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@JsonIgnoreType
public class Film extends BaseEntity {

	@Column(unique = true)
	private String fName;
	
	private double ticket;
	
	@Past
	private LocalDate releaseDate;
	
	@Enumerated(EnumType.STRING)
	private Rating rating;
	
	@ManyToOne
	private Producer producer;

	
	public Film(String fName, double ticket, @Past LocalDate releaseDate, Rating rating) {
		super();
		this.fName = fName;
		this.ticket = ticket;
		this.releaseDate = releaseDate;
		this.rating = rating;
	}
	
	
	
}
