package __Monopoly;

import java.util.ArrayList;
public class Plateau {
	
     public De de = new De(); 
    public ArrayList<Case> cases ;
    
    /**
	 * Définit un Plateau avec le De et ses cases 
	 * @param de De
	 * @param cases ArrayList<Case>
	 */
    
    Plateau(){
        this.de.setValeur(0);
        
        
        this.cases = new ArrayList<Case>();
        	//Les cases de notre plateau
        CaseDepart caseDepart = new CaseDepart();
    	CaseAllerEnPrison allerEnPrison = new CaseAllerEnPrison();
    	CaseImpot caseImpot = new CaseImpot();
    	CasePrison casePrison = new CasePrison();
    	CaseChance caseChance = new CaseChance ();
    	CaseCaisseCommunaute caseCaisseCommunaute = new CaseCaisseCommunaute();
    	CaseGare caseGare = new CaseGare();
    	CaseTaxeLuxe caseLuxe = new CaseTaxeLuxe();
    	CaseTerrain caseTerrain = new CaseTerrain();
    	CaseServicePublic caseServicePublic = new CaseServicePublic();
    	
    	cases.add(caseDepart);
    	cases.add(caseCaisseCommunaute);
    	cases.add(caseGare);
    	cases.add(caseChance);
    	cases.add(caseImpot);
    	cases.add(allerEnPrison);
    	cases.add(casePrison);
    	cases.add(caseLuxe);
    	cases.add(caseTerrain);
    	cases.add(caseServicePublic);        

    }
       
}
