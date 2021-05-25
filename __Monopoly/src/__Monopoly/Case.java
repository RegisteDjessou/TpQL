package __Monopoly;

public abstract class Case {
	private int idCase;
    private String nom;
    
    /**
	 * Définit une case avec un id et un nom
	 * @param idCase int
	 * @param nom String
	 */
    
    public Case(int idCase,String nom) {
    	this.idCase = idCase;
        this.nom = nom;
    }
    
    public int getId() {
        return this.idCase;
    }
    
    public String getNom() {
        return this.nom;
    }
   
   
    
    public abstract Joueur getProprietaire();
    
    @Override
	public String toString() {
		return "Case [nom=" + nom + "]";
	}

	protected abstract void actionCase(Joueur j1);
    
}
