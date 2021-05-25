package __Monopoly;

public class CaseCaisseCommunaute extends Case{

	public CaseCaisseCommunaute() {
		super(5,"Caisse de Communauté");
		
	}
	
	public void actionCase(Joueur j) {
		CarteCaisseCommunaute carte = new CarteCaisseCommunaute();
		j.ajouterCarte(carte);
	}

	@Override
	public Joueur getProprietaire() {
		return null;
	}
}