package fr.ensma.lisi.librarycontentrestwebservice;

import lombok.Data;

public @Data class Joke {
	private int id = 0;
	private String joke = "";
	private String categories[] = {"nerdy","explicit"};
	
}
