package com.practice.SpringBootFifth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.practice.SpringBootFifth.bean.Movie;
import com.practice.SpringBootFifth.service.MovieService;

@RestController
public class MovieController {
	
	@Autowired
	private MovieService movieService;
	
	@RequestMapping("/movies")
	public List<Movie> getAllMovies()
	{
		return movieService.getAllMovies();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/movies")
	public void addMovie(@RequestBody Movie movie)
	{
		movieService.addMovie(movie);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/movies/{id}")
	public void updateMovie(@PathVariable String id, @RequestBody Movie movie)
	{
		movieService.updateMovie(id, movie);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/movies/{id}")
	public void deleteMovie(@PathVariable String id)
	{
		movieService.deleteMovie(id);
	}
	
}
