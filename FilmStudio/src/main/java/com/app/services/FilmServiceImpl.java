package com.app.services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.DTOs.FilmReqDTO;
import com.app.DTOs.FilmUpdationDTO;
import com.app.entities.Film;
import com.app.entities.Producer;
import com.app.exceptions.ResourceNotFoundException;
import com.app.repository.FilmRepoIF;
import com.app.repository.ProducerRepoIF;

@Service
@Transactional
public class FilmServiceImpl implements FilmServiceIF {

	@Autowired
	private FilmRepoIF filmRepoInstance;
	
	@Autowired
	private ModelMapper mapper;
	
	@Autowired
	private ProducerRepoIF producerRepoInstance;
	
	
	@Override
	public List<Film> getAllFilms() {
		
		List<Film> filmList = filmRepoInstance.findAll();
		
		return filmList;
	}

	@Override
	public Film insertNewFilm(FilmReqDTO filmreqDTO) {
		
		Integer pID = filmreqDTO.getPID();
		
		Producer foundproducer = producerRepoInstance.findById(pID)
				.orElseThrow(() -> new ResourceNotFoundException("Invalid Producer ID, Boss !"));
		
		Film newFilm = mapper.map(filmreqDTO, Film.class);
		
		foundproducer.addFilm(newFilm);
		
		filmRepoInstance.save(newFilm);
		
		return newFilm;
	}

	@Override
	public Film updateFilm(FilmUpdationDTO filmupdationDTO) {
		
		Integer filmID = filmupdationDTO.getId();
		
		
		Film filmToUpdate = filmRepoInstance.findById(filmID)
		.orElseThrow(() -> new ResourceNotFoundException("Invalid Film ID, Boss ! "));
		
		filmToUpdate.setFName(filmupdationDTO.getFName());
		filmToUpdate.setTicket(filmupdationDTO.getTicket());
		filmToUpdate.setRating(filmupdationDTO.getRating());
		filmToUpdate.setReleaseDate(filmupdationDTO.getReleaseDate());
		
		Film updatedFilm = filmRepoInstance.save(filmToUpdate);
		
		return updatedFilm;
	}

	@Override
	public String deleteFilm(Integer filmID) {
		
		String msg = "Film Deletion Failed Miserably, Boss !";
		boolean existStatus = filmRepoInstance.existsById(filmID);
		
		if(existStatus) {
			
			filmRepoInstance.deleteById(filmID);
			msg = "Film Deleted Succesfully, Boss !";
		}
		
		return msg;
	}
	
	

}
