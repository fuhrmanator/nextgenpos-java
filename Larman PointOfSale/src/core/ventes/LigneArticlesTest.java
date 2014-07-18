package core.ventes;

import static org.junit.Assert.*;

import org.junit.Test;

public class LigneArticlesTest {

	@Test
	public void testGetSousTotal() {
		LigneArticles la = new LigneArticles(
				new DescriptionProduit(
						new CodeArticle(1), new Monnaie (2.5), "produit 1"), 4);
		assertTrue(la.getSousTotal().equals(new Monnaie(10.0)));
	}

}
