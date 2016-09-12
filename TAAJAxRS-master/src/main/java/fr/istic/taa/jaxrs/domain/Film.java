package fr.istic.taa.jaxrs.domain;

import java.util.List;

public class Film {
	
	
	
  public String title;
  public int episode_id;
  public String opening_crawl;
  public String director;
  public String producer;
  public String release_date;
  public List<People> characters;
  public List<Planet> planets;
  public List<Spaceship> starships;
  public List<Vehicule> vehicles;
  public List<Specie> species;
  public String created;
  public String edited;
  public Film url;
  
  
  
  public Film() {
	super();
  }

  public Film(String title, int episode_id, String release_date) {
	super();
	this.title = title;
	this.episode_id = episode_id;
	this.release_date = release_date;
  }
public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public int getEpisode_id() {
    return episode_id;
  }
  public void setEpisode_id(int episode_id) {
    this.episode_id = episode_id;
  }
  public String getOpening_crawl() {
    return opening_crawl;
  }
  public void setOpening_crawl(String opening_crawl) {
    this.opening_crawl = opening_crawl;
  }
  public String getDirector() {
    return director;
  }
  public void setDirector(String director) {
    this.director = director;
  }
  public String getProducer() {
    return producer;
  }
  public void setProducer(String producer) {
    this.producer = producer;
  }
  public String getRelease_date() {
    return release_date;
  }
  public void setRelease_date(String release_date) {
    this.release_date = release_date;
  }
  public List<People> getCharacters() {
    return characters;
  }
  public void setCharacters(List<People> characters) {
    this.characters = characters;
  }
 
  public List<Planet> getPlanets() {
	return planets;
  }
	public void setPlanets(List<Planet> planets) {
		this.planets = planets;
	}
	public List<Spaceship> getStarships() {
		return starships;
	}
	public void setStarships(List<Spaceship> starships) {
		this.starships = starships;
	}
	public List<Vehicule> getVehicles() {
		return vehicles;
	}
	public void setVehicles(List<Vehicule> vehicles) {
		this.vehicles = vehicles;
	}
	public List<Specie> getSpecies() {
		return species;
	}
	public void setSpecies(List<Specie> species) {
		this.species = species;
	}
	public String getCreated() {
	    return created;
	  }
  public void setCreated(String created) {
    this.created = created;
  }
  public String getEdited() {
    return edited;
  }
  public void setEdited(String edited) {
    this.edited = edited;
  }
  public Film getUrl() {
    return url;
  }
  public void setUrl(Film url) {
    this.url = url;
  }
}