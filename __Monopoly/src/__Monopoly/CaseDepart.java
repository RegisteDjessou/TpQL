package __Monopoly;

public class CaseDepart extends Case{

	public CaseDepart() {
		super(0,"Depart");
		
	}
	
	public void actionCase(Joueur j) {
		j.ajoutArgent(1000);
	}

	@Override
	public Joueur getProprietaire() {
		return null;
	}
	
	
}