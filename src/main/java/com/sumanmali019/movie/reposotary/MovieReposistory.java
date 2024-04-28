package com.sumanmali019.movie.reposotary;

import org.springframework.data.mongodb.repository.MongoRepository;


import org.bson.types.ObjectId;
import org.springframework.stereotype.Repository;

import com.sumanmali019.movie.model.Movie;

import java.util.Optional;


@Repository
public interface MovieReposistory extends MongoRepository<Movie, ObjectId> {


      Optional<Movie>findByImdbId(String imdbId);
}
