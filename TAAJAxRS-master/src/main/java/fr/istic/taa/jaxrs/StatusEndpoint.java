/**
 * JBoss, Home of Professional Open Source
 * Copyright Red Hat, Inc., and individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package fr.istic.taa.jaxrs;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import fr.istic.taa.jaxrs.domain.Film;
import fr.istic.taa.jaxrs.domain.People;
import fr.istic.taa.jaxrs.domain.Person;
import fr.istic.taa.jaxrs.domain.Planet;
import fr.istic.taa.jaxrs.domain.Spaceship;
import fr.istic.taa.jaxrs.domain.Specie;
import fr.istic.taa.jaxrs.domain.Vehicule;

@Path("/swapi")
public class StatusEndpoint {

	private static final Logger logger = Logger.getLogger(StatusEndpoint.class.getName());

	
	
	
			

	private Planet planets[] = { new Planet("Coruscant", 12240, 92448200), new Planet("Tatooine", 15000, 3782),
			new Planet("Mustafar", 4000, 10), new Planet("Mandalore", 7800, 8700), new Planet("Naboo", 12400, 547850),
			new Planet("Alderaan", 0, 0), };

	private Specie species[] = { new Specie("Human", "mammal", "sentient"),
			new Specie("Droid", "artificial", "sentient"), new Specie("Wookie", "mammal", "sentient"),
			new Specie("Ewok", "mammal", "sentient") };

	private Vehicule vehicules[] = { new Vehicule("TR", "TT", "24580"), new Vehicule("TB", "TT", "50000"),
			new Vehicule("LandSpeader", "KHT-450", "2000"), new Vehicule("Speader", "A210", "1500") };

	private Spaceship spaceships[] = { new Spaceship("X-wing", "1337", "20000 CR"),
			new Spaceship("DeathStar", "42", "9999999999999 CR"), new Spaceship("TIE Fighter", "3.5.1.2", "50 CR") };

	private People peoples[] = { new People("Dark Vador", "2.0m", "100kg"),
			new People("Obi Wan Kenobi", "1.75m", "75kg"), new People("Yoda", "0.5m", "40kg"),
			new People("Jabba", "2.5m", "400kg"), new People("Gary", "1.68m", "85kg") };

	@GET
	public Response getStatus() {

		return Response.status(Response.Status.OK).entity("JO").build();
	}

	@GET
	@Path("/test")
	public String helloWorld() {

		return "hello";
	}

	@GET
	@Path("/person")
	@Produces(MediaType.APPLICATION_JSON)
	public Person getPerson() {
		Person p = new Person();
		p.setName("test");
		p.setFirstName("t");
		return p;
	}

	@POST
	@Path("/person")
	@Consumes(MediaType.APPLICATION_JSON)
	public void addPerson(Person p) {
		System.err.println(p.getName());
	}

	
	/** People **/
	@POST
	@Path("/people")
	@Consumes(MediaType.APPLICATION_JSON)
	public void addPeople(People p){
		System.err.println(p.getName());
	}
	
	@GET
	@Path("/people/{id}/")
	@Produces(MediaType.APPLICATION_JSON)
	public People getPeople(@PathParam("id") String id) {
		return peoples[Integer.parseInt(id)];
	}
	
	/** Planet**/
	@POST
	@Path("/planet")
	@Consumes(MediaType.APPLICATION_JSON)
	public void addPlanet(Planet p){
		System.err.println(p.getName());
	}

	@GET
	@Path("/planet/{id}/")
	@Produces(MediaType.APPLICATION_JSON)
	public Planet getPlanet(@PathParam("id") String id) {
		return planets[Integer.parseInt(id)];
	}

	/** Vehicule **/
	
	@GET
	@Path("/vehicule/{id}/")
	@Produces(MediaType.APPLICATION_JSON)
	public Vehicule getVehicule(@PathParam("id") String id) {
		return vehicules[Integer.parseInt(id)];
	}
	
	@POST
	@Path("/vehicule")
	@Consumes(MediaType.APPLICATION_JSON)
	public void addVehicule(Vehicule v){
		System.err.println(v.getName());
	}
	
	/** Specie **/ 

	@GET
	@Path("/specie/{id}/")
	@Produces(MediaType.APPLICATION_JSON)
	public Specie getSpecie(@PathParam("id") String id) {
		return species[Integer.parseInt(id)];
	}
	
	@POST
	@Path("/specie")
	@Consumes(MediaType.APPLICATION_JSON)
	public void addSpecie(Specie s){
		System.err.println(s.getName());
	}

	
	/** Spaceship **/
	
	@GET
	@Path("/spaceship/{id}/")
	@Produces(MediaType.APPLICATION_JSON)
	public Spaceship getSpaceship(@PathParam("id") String id) {
		return spaceships[Integer.parseInt(id)];
	}
	
	@POST
	@Path("/spaceship")
	@Consumes(MediaType.APPLICATION_JSON)
	public void addSpaceship(Spaceship s){
		System.err.println(s.getName());
	}

	
	
	/** Film **/
	@GET
	@Path("/film/{id}/")
	@Produces(MediaType.APPLICATION_JSON)
	public Film getFilm(@PathParam("id") String id) {
		
		return RestServer.films.get(Integer.parseInt(id));
	}
	
	@POST
	@Path("/film")
	@Consumes(MediaType.APPLICATION_JSON)
	public void addFilm(Film f){
		RestServer.films.add(new Film(f.title,f.episode_id, f.created));
	}
	
	

}
