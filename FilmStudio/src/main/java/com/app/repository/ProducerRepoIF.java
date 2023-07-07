package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Producer;

public interface ProducerRepoIF extends JpaRepository<Producer, Integer>{

}
