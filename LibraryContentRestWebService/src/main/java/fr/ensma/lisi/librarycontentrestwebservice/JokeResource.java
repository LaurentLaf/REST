package fr.ensma.lisi.librarycontentrestwebservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/joke")
public class JokeResource {
	
	@Path("/")
	@GET
	@Produces("application/json")
	public JokeResponse getJoke() {
		Joke joke1 = new Joke();
		joke1.setId(1);
		joke1.setJoke("Blague numéro 1");
		
		Joke joke2 = new Joke();
		joke2.setId(1);
		joke2.setJoke("Blague numéro 2");
		
		Joke joke[]= new Joke[2];
		joke[0]=joke1;
		joke[1]=joke2;
		
		JokeResponse reponseJoke1 = new JokeResponse();
		reponseJoke1.setType("success");
		reponseJoke1.setJoke(joke);
		
		return reponseJoke1;
	}

}
