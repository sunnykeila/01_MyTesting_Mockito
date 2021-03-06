package com.example.repository;

import com.example.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Integer> {

    List<User> findAllByLastNameLike(String lastName);
}
