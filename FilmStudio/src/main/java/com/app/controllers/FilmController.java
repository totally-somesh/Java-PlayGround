package com.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.DTOs.FilmReqDTO;
import com.app.DTOs.FilmUpdationDTO;
import com.app.entities.Film;
import com.app.services.FilmServiceIF;

@RestController
@RequestMapping("/films")
@CrossOrigin(origins = "http://localhost:3000")
public class FilmController {
	
	@Autowired
	private FilmServiceIF filmServiceInstance;
	
	@GetMapping
	public List<Film> getFilmList(){
		
		List<Film> ListOfFilm = filmServiceInstance.getAllFilms();
		
		return ListOfFilm;
	}
	
	@PostMapping("/newfilm")
	public Film addNewFilm(@RequestBody FilmReqDTO filmreqDTO) {
		
		Film newFilm = filmServiceInstance.insertNewFilm(filmreqDTO);
		
		return newFilm;		
	}
	
	@PutMapping("/updatefilm")
	public Film updateFilm(@RequestBody FilmUpdationDTO filmupdationDTO) {
		
		Film updatedFilm = filmServiceInstance.updateFilm(filmupdationDTO);
		
		return updatedFilm;
	}
	
	@DeleteMapping("/deletefilm/{filmID}")
	public String deleteFilm(@PathVariable Integer filmID) {
		
		String msg = filmServiceInstance.deleteFilm(filmID);
		
		return msg;		
	}

}
