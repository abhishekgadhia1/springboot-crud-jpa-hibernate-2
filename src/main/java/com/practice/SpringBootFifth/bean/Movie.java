package com.practice.SpringBootFifth.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Movie1")
public class Movie {

	@Id
	private String id;
	private String name;
	
	public Movie()
	{
		super();
	}
	
	public Movie(String id, String name)
	{
		super();
		this.id = id;
		this.name = name;
	}
	
	public String getId()
	{
		return id;
	}
	
	public void setId(String id)
	{
		this.id = id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	
}
