package com.sumanmali019.movie.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumanmali019.movie.model.Movie;
import com.sumanmali019.movie.reposotary.MovieReposistory;

@Service
public class MovieService {

    @Autowired
    private MovieReposistory movieReposistory;

    public List<Movie> allMovies() {
        return movieReposistory.findAll();

    }

    public Optional<Movie> singleMovie(String imdbId) {
        return movieReposistory.findByImdbId(imdbId);
    }
}
