package com.SpringifyMongo.repository;

import com.SpringifyMongo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    //cannot do CRUD operations without extending the mongo repository
    @Query(" {' userProfile.email ' : ?0} ")
    public User findByEmail(String email);
}
