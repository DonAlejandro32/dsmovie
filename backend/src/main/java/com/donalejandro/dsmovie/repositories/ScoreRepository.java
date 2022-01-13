package com.donalejandro.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.donalejandro.dsmovie.entities.Score;
import com.donalejandro.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
	
	
}
