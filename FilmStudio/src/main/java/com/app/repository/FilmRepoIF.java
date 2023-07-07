package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Film;

public interface FilmRepoIF extends JpaRepository<Film, Integer> {

}
