package com.app.DTOs;

import java.time.LocalDate;

import com.app.entities.Rating;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class FilmUpdationDTO {
	
	private Integer id;
	
	private String fName;

	private double ticket;

	private LocalDate releaseDate;

	private Rating rating;

	private Integer pID;
}
