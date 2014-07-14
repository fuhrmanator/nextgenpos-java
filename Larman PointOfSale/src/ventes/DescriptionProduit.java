package ventes;

public class DescriptionProduit {
	private CodeArticle code;
	private Monnaie prix;
	private String description;
	
	public DescriptionProduit(CodeArticle code, Monnaie prix, String description) {
		this.code = code;
		this.prix = prix;
		this.description = description;
	}

	public CodeArticle getCode() {
		return code;
	}

	public Monnaie getPrix() {
		return prix;
	}

	public String getDescription() {
		return description;
	}
	

}
