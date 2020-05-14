package com.sandipgole.Hibernate.repositories;

import com.sandipgole.Hibernate.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {
}
