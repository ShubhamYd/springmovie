package com.cts.movie.repository;

import com.cts.movie.model.MovieModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface MovieRepo extends JpaRepository<MovieModel,Integer>{

}
