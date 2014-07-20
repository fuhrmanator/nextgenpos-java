package admin;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.eclipse.persistence.jpa.PersistenceProvider;

import core.ventes.CodeArticle;
import core.ventes.DescriptionProduit;
import core.ventes.Monnaie;

public class DBAjouterDescriptionsProduit {

	private static final String PERSISTENCE_UNIT_NAME = "nextgenpos-java.tables.derby";
	private static EntityManagerFactory factory;

	public static void main(String[] args) {
				
	    factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
//	    factory = new PersistenceProvider().createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	    EntityManager em = factory.createEntityManager();
	    // read the existing entries and write to console
//	    Query q = em.createQuery("select dp from DescriptionProduit dp");
//	    List<DescriptionProduit> listeDescriptionProduit = q.getResultList();
//	    for (DescriptionProduit desc : listeDescriptionProduit) {
//	      System.out.println(desc);
//	    }
//	    System.out.println("Size: " + listeDescriptionProduit.size());

		String [][] tableau={
				{"100", "Beurre d'arachide", "3"},
				{"101", "Huile d'olive", "5.5"},
				{"102", "Banane", "0.8"},
				{"103", "Pomme", "1"},
				{"104", "Pain blé entier", "3.10"},
				{"105", "Lime", "0.25"},
				{"106", "Citron", "0.50"},
							 };
		DescriptionProduit desc = null;
		CodeArticle clé = null;
		Monnaie prix = null;

	    // crée nouvelle DescriptionProduit
	    em.getTransaction().begin();
		for (int i = 0; i < tableau.length; i++) {
			clé = new CodeArticle(Integer.parseInt(tableau[i][0]));
			prix = new Monnaie(Float.parseFloat(tableau[i][2]));
			desc = new DescriptionProduit(clé, prix, tableau[i][1]);
//		    em.persist(clé);
//		    em.persist(prix);
		    em.persist(desc);
		}
	    
	    em.getTransaction().commit();

	    em.close();

	}

}
