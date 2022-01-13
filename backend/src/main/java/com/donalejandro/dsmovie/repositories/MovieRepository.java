package com.donalejandro.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.donalejandro.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
	
}
