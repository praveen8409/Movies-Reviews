package com.praveen.movies.service;

import com.praveen.movies.model.Movie;
import com.praveen.movies.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies(){

      return  movieRepository.findAll();
    }
}
