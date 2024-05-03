package javaoopsnacks;

import java.util.Arrays;

public class RegistroStudenti {
	private Studente[] arrayStudente;

	public RegistroStudenti() {
		this.arrayStudente = new Studente[0];

	}

	public void aggiungiStudente(Studente studente) {
		int nuovaDimensionenArray = arrayStudente.length + 1;

		Studente[] nuovoArrayStudente = Arrays.copyOf(arrayStudente, nuovaDimensionenArray);

		nuovoArrayStudente[nuovaDimensionenArray - 1] = studente;
		arrayStudente = nuovoArrayStudente;
	}
	
	
	
	public void stampaArray() {
		
		for(int i =0; i<arrayStudente.length; i++) {
			String a= arrayStudente[i].convertiInStringa();
			System.out.println(a); 
		}
	}
}
