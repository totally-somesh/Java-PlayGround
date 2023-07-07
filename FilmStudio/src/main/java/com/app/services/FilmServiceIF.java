package com.app.services;

import java.util.List;

import com.app.DTOs.FilmReqDTO;
import com.app.DTOs.FilmUpdationDTO;
import com.app.entities.Film;

public interface FilmServiceIF {
	
	List<Film> getAllFilms();
	
	Film insertNewFilm(FilmReqDTO filmreqDTO);

	Film updateFilm(FilmUpdationDTO filmupdationDTO);
	
	String deleteFilm(Integer filmID);
	
}
