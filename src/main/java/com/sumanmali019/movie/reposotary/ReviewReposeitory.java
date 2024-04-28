package com.sumanmali019.movie.reposotary;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sumanmali019.movie.model.Review;


@Repository
public interface ReviewReposeitory extends MongoRepository<Review, ObjectId>{

}
