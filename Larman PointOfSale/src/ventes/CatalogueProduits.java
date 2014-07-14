package ventes;

import java.util.HashMap;
import java.util.Map;

public class CatalogueProduits {

	private Map<CodeArticle, DescriptionProduit> descriptions = new HashMap<CodeArticle, DescriptionProduit>();

	public CatalogueProduits() {
		// initialiser avec données pour tester
		CodeArticle code1 = new CodeArticle(100);
		CodeArticle code2 = new CodeArticle(200);
		Monnaie prix1 = new Monnaie(3);
		Monnaie prix2 = new Monnaie(5.5);

		DescriptionProduit desc;
		desc = new DescriptionProduit(code1, prix1, "Yourt");
		descriptions.put(code1, desc);
		desc = new DescriptionProduit(code2, prix2, "Huile d'olive");
		descriptions.put(code2, desc);
	}
	
	public DescriptionProduit getDescriptionProduit(CodeArticle code) {
		return descriptions.get(code);
	}
	
}
