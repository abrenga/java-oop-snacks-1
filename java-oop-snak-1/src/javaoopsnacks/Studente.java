package javaoopsnacks;

public class Studente {
	private String nome;
	private String cognome;
	
	
	public Studente(String nome, String cognome) {
		this.nome = nome;
		this.cognome=cognome;
	}
	
public String convertiInStringa() {
	String studente = nome+" "+cognome;
	return studente;
}

}
