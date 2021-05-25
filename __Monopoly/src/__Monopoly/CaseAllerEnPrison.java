package __Monopoly;

public class CaseAllerEnPrison extends Case {

	public CaseAllerEnPrison() {
		super(25,"Aller en Prison");
	}
	
	public void actionCase(Joueur j) {
		j.setEstPrison(true);
		j.setPosition(30);
	}

	@Override
	public Joueur getProprietaire() {
		return null;
	}

	

	
	
}