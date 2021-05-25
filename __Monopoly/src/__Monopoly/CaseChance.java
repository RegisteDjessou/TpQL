package __Monopoly;

public class CaseChance extends Case{

	public CaseChance() {
		super(12,"Chance");
	}
	
	public void actionCase(Joueur j) {
		j.ajoutArgent(300);
		CarteChance carte = new CarteChance();
		j.ajouterCarte(carte);
		
	}

	@Override
	public Joueur getProprietaire() {
		return null;
	}
	
	

}