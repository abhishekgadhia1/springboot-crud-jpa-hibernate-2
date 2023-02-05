package com.practice.SpringBootFifth.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.SpringBootFifth.bean.Movie;
import com.practice.SpringBootFifth.repository.MovieRepository;

@Service
public class MovieService {

	@Autowired
	public MovieRepository movieRepo;
	
	public List<Movie> getAllMovies()
	{
		List<Movie> movies = new ArrayList<>();
		movieRepo.findAll().forEach(movies :: add);
		return movies;
	}

	public void addMovie(Movie movie) {
		movieRepo.save(movie);
		
	}

	public void updateMovie(String id, Movie movie) {
		movieRepo.save(movie);
		
	}

	public void deleteMovie(String id) {
		movieRepo.deleteById(id);
		
	}
}