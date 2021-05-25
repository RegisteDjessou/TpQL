package __Monopoly;

public abstract class Carte {
    private String nom;
    
    /**
	 * Définit une carte un nom
	 * @param nom String
	 */
    
    public Carte(String nom) {
        this.nom = nom;
    }
    
    public String getNom() {
        return nom;
    }
    
    
    @Override
	public String toString() {
		return "Carte [titre=" + nom + "]";
	}
    
}
