package javaoopsnacks;

public class Main {
	public static void main(String[] args) {
		Studente studente= new Studente("jessica", "Brenga");
		Studente studenteq= new Studente("anna", "De Santis");
		Studente studenteqs= new Studente("Riccardino", "Fuffolo");
		
		
		RegistroStudenti registro = new RegistroStudenti();
	
	registro.aggiungiStudente(studente);
	registro.aggiungiStudente(studenteq);
	registro.aggiungiStudente(studenteqs);
	registro.stampaArray();
	}

}
