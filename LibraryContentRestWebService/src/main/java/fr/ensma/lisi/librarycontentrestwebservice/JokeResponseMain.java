package fr.ensma.lisi.librarycontentrestwebservice;

public class JokeResponseMain {

	public static void main(String[] args) {
		Joke joke1 = new Joke();
		joke1.setId(1);
		joke1.setJoke("Blague numéro 1");
		
		System.out.println(joke1);
		
		Joke joke2 = new Joke();
		joke2.setId(1);
		joke2.setJoke("Blague numéro 2");
		
		System.out.println(joke2);
		
		Joke joke[]= new Joke[2];
		joke[0]=joke1;
		joke[1]=joke2;
		
		JokeResponse reponseJoke1 = new JokeResponse();
		reponseJoke1.setType("success");
		reponseJoke1.setJoke(joke);
		
		System.out.println(reponseJoke1);
		
	}

}
