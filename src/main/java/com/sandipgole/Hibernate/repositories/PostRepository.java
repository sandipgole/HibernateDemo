package com.sandipgole.Hibernate.repositories;
import com.sandipgole.Hibernate.model.Post;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post,Integer> {
}
