package ventes;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class VenteTest {

	@Test
	public void testCreerLigneArticles() {
		Vente vente = new Vente();
		Monnaie total = new Monnaie(new BigDecimal(7.5), Monnaie.DOLLAR_CANADIEN);
		Monnaie prix = new Monnaie(new BigDecimal(2.5), Monnaie.DOLLAR_CANADIEN);
		CodeArticle code = new CodeArticle(1);
		DescriptionProduit desc = new DescriptionProduit(code, prix, "produit 1");
		
		vente.créerLigneArticles(desc, 1);
		vente.créerLigneArticles(desc, 2);
		assertTrue(vente.getTotal().equals(total));
	}

}
