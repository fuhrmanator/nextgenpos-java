package ventes;

public class Registre {
	private Vente venteEnCours;
	private CatalogueProduits catalogueProduits;
	
	public Registre(CatalogueProduits catalogue) {
		this.catalogueProduits = catalogue;
	}
	
	public void cr�erNouvelleVente() {
		venteEnCours = new Vente();
		System.out.println("Nouvelle vente");
	}
	
	public void saisirArticle(int codeInt, int quantit�) {
		// op�ration syst�me contient des types primitifs, donc faut convertir le code
		CodeArticle code = new CodeArticle(codeInt);
		DescriptionProduit dp = catalogueProduits.getDescriptionProduit(code);
		if (dp == null) {
			System.out.println("Aucun produit correspondant au code : " + code);
		} else {
			venteEnCours.cr�erLigneArticles(dp, quantit�);
			System.out.println("saisirArticle: " + dp.getDescription() + " (@" + dp.getPrix() + "), quantit� = " + quantit� + " [sous total: "+ venteEnCours.getTotalAvantRemise() + "]" );
		}
	}

	public void terminerVente() {
		venteEnCours.terminer();
		System.out.println("fin de saisie d'articles");
		System.out.println("Total avant remise: " + venteEnCours.getTotalAvantRemise());
		System.out.println("Total avec remise : " + venteEnCours.getTotal());
		System.out.println("�conomie de       : " + venteEnCours.getTotalAvantRemise().minus(venteEnCours.getTotal()));
	}

	public void cr�erPaiement(double comptantRe�u) {
		Monnaie comptantRe�uMonnaie = new Monnaie(comptantRe�u);
		venteEnCours.cr�erPaiement(comptantRe�uMonnaie);
		System.out.println("Cr�er paiement: " + comptantRe�uMonnaie);
		System.out.println("Solde : " + venteEnCours.getSolde());
	}

}
