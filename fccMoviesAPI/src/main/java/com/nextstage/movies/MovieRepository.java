package com.nextstage.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

// data access layer for api (talks to db and gets data)
@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
  Optional<Movie> findMovieByImdbId(String imdbId);
}
