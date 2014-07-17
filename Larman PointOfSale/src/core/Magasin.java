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
    	
    	// initialiser la stratégie de tarification
    	System.setProperty("strategietarification.class.name", "ventes.tarification.StratégiePourcentageRemise");
    	System.setProperty("strategietarification.class.percentage", "90");  // 90% est un rabais de 10%
    	
    	// simuler un cas d'utilisation (DSS)
    	r.créerNouvelleVente();
    	r.saisirArticle(101, 1);
    	r.saisirArticle(100, 2);
    	r.saisirArticle(102, 4);
    	r.saisirArticle(103, 1);
    	r.saisirArticle(105, 6);
    	r.saisirArticle(104, 1);
    	r.terminerVente();
    	r.créerPaiement(100);
    }
}
