package core;

import java.awt.EventQueue;

import javax.swing.JFrame;

import ui.swing.JFrameTraitementVente;
import core.util.Transformer;
import core.ventes.CatalogueProduits;
import core.ventes.Registre;

public class Magasin {
    private CatalogueProduits catalogue = new CatalogueProduits();
    private Registre registre = new Registre(catalogue);
    
    public Registre getRegistre() {
    	return registre;
    }
    
    public static void main(String[] args) {
    	// initialisation
    	Magasin m = new Magasin();
    	final Registre r = m.getRegistre();
    	
    	// initialiser la stratégie de tarification
    	System.setProperty("strategietarification.class.name", "core.ventes.tarification.StratégiePourcentageRemise");
    	System.setProperty("strategietarification.class.percentage", "90");  // 90% est un rabais de 10%

        EventQueue.invokeLater(new Runnable()
        {
           public void run()
           {
        	  JFrame frame = new JFrameTraitementVente(r);
              frame.setSize(300, 300); 
              frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
              frame.setVisible(true);
           }
        });
    	
    	// simuler un cas d'utilisation (DSS)
//    	r.créerNouvelleVente();
//    	r.saisirArticle(Transformer.toItemID(101), 1);
//    	r.saisirArticle(Transformer.toItemID(100), 2);
//    	r.saisirArticle(Transformer.toItemID(102), 4);
//    	r.saisirArticle(Transformer.toItemID(103), 1);
//    	r.saisirArticle(Transformer.toItemID(105), 6);
//    	r.saisirArticle(Transformer.toItemID(104), 1);
//    	r.terminerVente();
//    	r.créerPaiement(100);
    }
}
