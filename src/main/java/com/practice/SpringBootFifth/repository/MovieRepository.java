package com.practice.SpringBootFifth.repository;

import org.springframework.data.repository.CrudRepository;

import com.practice.SpringBootFifth.bean.Movie;

public interface MovieRepository extends CrudRepository<Movie, String> {

}
