package __Monopoly;

import java.util.Random;

public class De {
    private int valeur ;
    De de1,de2;
    
    /**
	 * Définit le De avec sa valeur et deux des
	 * @param valeur int
	 * @param de1,de2 De
	 */

    public De(){
        this.valeur = 0;
    }


    public void setValeur(int valeur){
        this.valeur = valeur;
    };

    public int getValeur(){
        return this.valeur;
    };
    
    public int lanceDe(){
    	de1=new De();
    	de2=new De();
        this.de1.setValeur(getRandomNumberInRange(1,6));
        this.de2.setValeur(getRandomNumberInRange(1,6));
        valeur = this.de1.getValeur() + this.de2.getValeur();
        return valeur;

    }
    
    public int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
    
    public String toString() {
		return "De retourne [" + this.getValeur() + "]";
	}
}

