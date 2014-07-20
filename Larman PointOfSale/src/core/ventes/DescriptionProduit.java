package core.ventes;

// JPA with Derby
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;

import core.ventes.CodeArticleToIntegerConverter;
import core.ventes.MonnaieToStringConverter;

@Entity
public class DescriptionProduit {
	@Id
	@Convert(converter = CodeArticleToIntegerConverter.class)	
	private CodeArticle code;
	@Convert(converter = MonnaieToStringConverter.class)	
	private Monnaie prix;
	private String description;
	
	public DescriptionProduit() {
		// needed by JPA
	}
	
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
	
	@Override
	public String toString() {
		return "DescriptionProduit [code=" + code + ", description=" + description + ", prix=" + prix + "]";
	}

}
