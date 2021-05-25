package __Monopoly;

import java.util.ArrayList;

public class Joueur {

    private String pseudo;
    private long solde;
    private int position;
    private boolean estPrison = false;
	private ArrayList<Case> terrains = new ArrayList<Case>();
	private ArrayList<Carte> cartes = new ArrayList<Carte>();
    
	/**
	 * Définit un Joueur avec un pseudo, un solde, une position, ses terrains et ses cartes
	 * @param pseudo String
	 * @param solde long
	 * @param position int
	 * @param estPrison boolean
	 * @param terrains ArrayList<Case>
	 * @param cartes ArrayList<Carte>
	 * 
	 */
	// constructeur
    Joueur(String pseudo){
        if(pseudo.length()>0){
            this.pseudo = pseudo;
            this.solde = 0;
            this.position = 0;
        }

    }

    //getter & setter Pseudo
    public String getPseudo(){
        return this.pseudo;
    }

  //getter & setter solde
    public long getSolde(){
        return this.solde;
    }

    public void setSolde(int ajout){
        this.solde = this.solde + ajout;
    }
    
	
	//getter & setter estPrison
	
	public boolean getEstPrison(){
		return this.estPrison;
	}

	public void setEstPrison(boolean prison){
		this.estPrison = prison;
	}
	
	//ajout de Case
	
	public void ajouterTerrain(Case terrain) {
		this.terrains.add(terrain);
	}
	
	//getter terrains
	
	public String getListeTerrains() {
		String ter = "";
		for(Case t:this.terrains) {
			ter+=(t.getNom()+",");
		}
		return ter;
	}
	
	
	//ajout de Carte
	public void ajouterCarte(Carte carte) {
		this.cartes.add(carte);
	}
	
	//getter cartes
	
	public String getListeCartes() {
		String carte = "";
		for(Carte c:this.cartes) {
			carte+=(c.getNom()+",");
		}
		return carte;
	}
	
	
	//getter & setter position 
    public int getPosition(){
            if (this.position == 0) {
                throw new IllegalArgumentException("Nouveau joueur");
            } else {
                return this.position; 
            }
    }

    public void setPosition(int pas){
        this.position =  pas;
    }
    
   
    
    public void seDeplacer(int pas) {
    	this.position =  this.position + pas;
    	
    }
    
    
    // ajout d'argent
    public void ajoutArgent(long money) {
    	long somme = this.solde + money;
        if (somme < 0) {
            throw new IllegalArgumentException("Impossible");
        }
        this.solde = somme;
    }
    
    //affichage des propriétes du joueur
    public String toString() {
		return "JoueurMonopoly [Position :" + this.getPosition() 
		+ ", argent=" + solde + ", estPrison=" + estPrison 
		+ ", \nterrains=[" + getListeTerrains() + "]"
		+ ", \ncartess=[" + getListeCartes() + "]";
    }

   




    
}
