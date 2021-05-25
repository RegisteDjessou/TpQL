package __Monopoly;

import java.util.Scanner;

public class CaseTerrain extends Case{
	private Joueur proprietaire;
	private int loyer;
	
	public CaseTerrain() {
		super(45,"Terrain");
		this.loyer = 200;
	}
	
	
	public void actionCase(Joueur j) {
		if(this.getProprietaire() != null) {
			
			if(j != this.getProprietaire()) {
				System.out.println("Vous devez payer le loyer");
				j.ajoutArgent(-loyer);
			}
		}else {
				if(j.getSolde()>=this.loyer) {
					System.out.println("Voulez vous acheter le Terrain?: Entrez 1 si vous voulez");
					Scanner sc = new Scanner(System.in);
					int choix = sc.nextInt();
					if(choix == 1) {
						this.setProprietaire(j);
						j.ajouterTerrain(this);
						System.out.println("Félicitations vous venez d'acheter le Terrain");
					}
					sc.close();
		}
		}
		
	}
	
	public void setProprietaire(Joueur j) {
		this.proprietaire= j;
	}
	
	
	@Override
	public Joueur getProprietaire() {
		return proprietaire;
	}
}
