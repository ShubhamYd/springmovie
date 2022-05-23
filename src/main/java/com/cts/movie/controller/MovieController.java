package com.cts.movie.controller;

import com.cts.movie.model.MovieModel;
import com.cts.movie.service.MovieService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieController {
    
    private MovieService movieService;

    @PostMapping("/")
    public String insertMovie(@RequestBody MovieModel model){

        this.movieService.createMovie(model);

        return "Data Stored Successfully";

    }

}
