package ProgettoPO.ProgettoProgrammazione.exceptions;

public class PostIdException extends Exception{
	
	String errore = "Id del post non valido" ;
	
	public PostIdException(){
		super("Id del post non valido");
	};
	
	public String getErrore () {return errore;}
	
	

}
