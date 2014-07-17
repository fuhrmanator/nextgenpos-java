package ventes;

import java.util.HashMap;
import java.util.Map;

public class CatalogueProduits {

	private Map<CodeArticle, DescriptionProduit> descriptions = null;

	public CatalogueProduits() {
		descriptions = initCatalogue();
//		// initialiser avec données pour tester
//		CodeArticle code1 = new CodeArticle(100);
//		CodeArticle code2 = new CodeArticle(200);
//		Monnaie prix1 = new Monnaie(3);
//		Monnaie prix2 = new Monnaie(5.5);
//
//		DescriptionProduit desc;
//		desc = new DescriptionProduit(code1, prix1, "Beurre d'arachide");
//		descriptions.put(code1, desc);
//		desc = new DescriptionProduit(code2, prix2, "Huile d'olive");
//		descriptions.put(code2, desc);
	}
	
	public DescriptionProduit getDescriptionProduit(CodeArticle code) {
		return descriptions.get(code);
	}
	
	private Map<CodeArticle, DescriptionProduit> initCatalogue() {
		Map<CodeArticle, DescriptionProduit> catalogue = new HashMap<CodeArticle, DescriptionProduit>();
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

		for (int i = 0; i < tableau.length; i++) {
			CodeArticle clé = new CodeArticle(Integer.parseInt(tableau[i][0]));
			desc = new DescriptionProduit(clé, new Monnaie(Float.parseFloat(tableau[i][2])), tableau[i][1]);
			catalogue.put(clé, desc);
		}
		return catalogue;
	}
	
}
