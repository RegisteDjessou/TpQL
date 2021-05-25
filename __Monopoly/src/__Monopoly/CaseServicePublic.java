package __Monopoly;

import java.util.Scanner;

public class CaseServicePublic extends Case{
	private Joueur proprietaire;
	private int loyer;

	public CaseServicePublic() {
		super(50,"Service Public");
		this.loyer = 300;
		
	}
	
	public void actionCase(Joueur j) {
		if(this.getProprietaire() != null) {
			
			if(j != this.getProprietaire()) {
				System.out.println("Vous devez payer le loyer");
				j.ajoutArgent(-loyer);
			}
		}else {
				if(j.getSolde()>=this.loyer) {
					System.out.println("Voulez vous acheter le Service Public?: Entrez 1 si vous voulez");
					Scanner sc = new Scanner(System.in);
					int choix = sc.nextInt();
					if(choix == 1) {
						this.setProprietaire(j);
						j.ajouterTerrain(this);
						System.out.println("Félicitations vous venez d'acheter le Service Public");
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
