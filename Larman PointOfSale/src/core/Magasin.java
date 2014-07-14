package core;

import ventes.CatalogueProduits;
import ventes.Registre;

public class Magasin {
    private CatalogueProduits catalogue = new CatalogueProduits();
    private Registre registre = new Registre(catalogue);
    
    public Registre getRegistre() {
    	return registre;
    }
    
    public static void main(String[] args) {
    	// initialisation
    	Magasin m = new Magasin();
    	Registre r = m.getRegistre();
    	
    	// initialiser la strat�gie de tarification
    	System.setProperty("strategietarification.class.name", "ventes.tarification.Strat�giePourcentageRemise");
    	System.setProperty("strategietarification.class.percentage", "90");
    	
    	// simuler un cas d'utilisation (DSS)
    	r.cr�erNouvelleVente();
    	r.saisirArticle(200, 1);
    	r.saisirArticle(100, 2);
    	r.terminerVente();
    	r.cr�erPaiement(100);
    }
}