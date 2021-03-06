package fr.istic.taa.jaxrs;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.jboss.resteasy.plugins.server.undertow.UndertowJaxrsServer;

import fr.istic.taa.jaxrs.domain.Film;
import fr.istic.taa.jaxrs.domain.Planet;
import io.undertow.Undertow;

/**
 * RESTfull microservice, based on JAX-RS and JBoss Undertow
 *
 */
public class RestServer {

    private static final Logger logger = Logger.getLogger(RestServer.class.getName());

    public static List<Film> films = new ArrayList<Film>();
    public static List<Planet> planets = new ArrayList<Planet>();
    
    public static void main( String[] args ) {

       
    	
        UndertowJaxrsServer ut = new UndertowJaxrsServer();
        StatusEndpoint sep = new StatusEndpoint();
        TestApplication ta = new TestApplication();

        ut.deploy(ta);

        ut.start(
                Undertow.builder()
                        .addHttpListener(8080, "localhost")

        );
        
        initialisation();
                

        logger.info("JAX-RS based micro-service running!");
    }



	private static void initialisation() {
		
				Film f1 = new Film("A New Hope", 4, "1977-05-25");
				Film f2 =new Film("The Empire Strikes Back", 5, "1980-05-17");  
				Film f3 =new Film("Return of the Jedi", 6, "1983-05-25");  
				Film f4 =new Film("The Phantom Menace", 1, "1999-05-19");  
				Film f5 =new Film("Attack of the Clones", 2, "2002-05-16"); 
				Film f6 =new Film("Revenge of the Sith", 3, "2005-05-19");  
				Film f7 =new Film("Le retour de Vivien ; The slapper-man", 8, "2016-09-09");  
				Film f8 =new Film("The Force Awakens", 7, "2015-12-11");  
				films.add(f1);films.add(f2);
				films.add(f3);films.add(f4);
				films.add(f5);films.add(f6);
				films.add(f7);films.add(f8);
				
				
				
				
				
				
				 Planet p1 =  new Planet("Coruscant", 12240, 92448200);
				 Planet p2 =  new Planet("Tatooine", 15000, 3782);
				 Planet p3 =  new Planet("Mustafar", 4000, 10);
				 Planet p4 =  new Planet("Mandalore", 7800, 8700); 
				 Planet p5 =  new Planet("Naboo", 12400, 547850);
				 Planet p6 =  new Planet("Alderaan", 0, 0);
				
				
	}
}
