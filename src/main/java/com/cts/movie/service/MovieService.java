package com.cts.movie.service;

import com.cts.movie.model.MovieModel;
import com.cts.movie.repository.MovieRepo;

import org.springframework.stereotype.Service;

@Service
public class MovieService {
    
    private MovieRepo movieRepo;


    public void createMovie(MovieModel model){

        this.movieRepo.save(model);

    }

}
