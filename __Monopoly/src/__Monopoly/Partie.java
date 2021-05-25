package __Monopoly;


public class Partie {
    private int nbRound;
    Plateau plateau = new Plateau();  
    /**
	 * Définit une partie ave c le nombre de Round et un Plateau 
	 * @param nbRound int
	 * @param plateau Plateau
	 */
    
    

    public Partie(int round) {
        this.setNbRound(round); // Pour le nombre de round
        
    }
   
    
    public int getNbRound() {
		return nbRound;
	}

	public void setNbRound(int nbRound) {
		this.nbRound = nbRound;
	}
	
	public void action(Joueur j1) {
		switch(j1.getPosition()) {
		
		case 5 :
			this.plateau.cases.get(1).actionCase(j1);
			break;
		case 10 :
			this.plateau.cases.get(2).actionCase(j1);
			break;
		case 12 :
			this.plateau.cases.get(3).actionCase(j1);
			break;
		case 20 :
			this.plateau.cases.get(4).actionCase(j1);
			break;
		case 25 :
			this.plateau.cases.get(5).actionCase(j1);
			break;
		case 30 :
			this.plateau.cases.get(6).actionCase(j1);
			break;
		case 40 :
			this.plateau.cases.get(7).actionCase(j1);
			break;
		case 45 :
			this.plateau.cases.get(8).actionCase(j1);
			break;
		case 50 :
			this.plateau.cases.get(9).actionCase(j1);
			break;
		}
		
		
	}
    

    
    public void lancerPartie(Joueur j1, Joueur j2) {
    	int i = 0;
    	int lance = 0;
    	System.out.println("La partie commence : ");
    	this.plateau.cases.get(0).actionCase(j1);
    	this.plateau.cases.get(0).actionCase(j2);
    	while(i<=this.getNbRound()) {
    		if(!j1.getEstPrison()) {
	    		System.out.println(j1.getPseudo()+" lancer le de");
	    		lance = this.plateau.de.lanceDe();
	    		System.out.println(this.plateau.de + " pour le joueur 1");
	    		
	    		
	    		j1.seDeplacer(lance);
	    		this.action(j1);
	    		
	    		System.out.println(j1);
    		}else {
    			System.out.println("Le joueur est en prison.");
    			
    		}
    		
    		
    		
    	if(!j2.getEstPrison()) {
    		System.out.println(j2.getPseudo()+" lancer le de: ");
    		lance = this.plateau.de.lanceDe();
    		System.out.println(this.plateau.de + " pour le joueur 2");
    		j2.seDeplacer(lance);
    		this.action(j2);
    		System.out.println(j2);
		}else {
			System.out.println("Le joueur est en prison.");
		}
    	i = i + 1;
		
		
	}
    	
    } 	
    
}
