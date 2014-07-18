package core.ventes;

public class LigneArticles {
	private int quantite;
	private DescriptionProduit description;
	
	public LigneArticles(DescriptionProduit desc, int quantite) {
		this.description = desc;
		this.quantite = quantite;
	}

	public Monnaie getSousTotal() {
		Monnaie prix = description.getPrix();
		return prix.multiply(quantite);
	}
	
}
