package __Monopoly;

public class CaseImpot extends Case {

	public CaseImpot() {
		super(20,"Impot");
	}
	
	public void actionCase(Joueur joueur) {
		joueur.ajoutArgent(-200);
	}

	@Override
	public Joueur getProprietaire() {
		return null;
	}
}