package com.sumanmali019.movie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.sumanmali019.movie.model.Movie;
import com.sumanmali019.movie.model.Review;
import com.sumanmali019.movie.reposotary.ReviewReposeitory;

@Service
public class ReviewService {

    @Autowired
    private ReviewReposeitory reviewReposeitory;

    @Autowired
    private MongoTemplate mongoTemplate;

    public Review createRevie(String reviewBody, String imdbId) {
        Review review = reviewReposeitory.insert(new Review(reviewBody));

        mongoTemplate.update(Movie.class).matching(Criteria.where("imdbId").is(imdbId))
                .apply(new Update().push("reviewIds").value(review)).first();

        return review;

    }
}
