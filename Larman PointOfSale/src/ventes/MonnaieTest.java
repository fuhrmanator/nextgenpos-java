package ventes;

import static org.junit.Assert.*;

import org.junit.Test;

public class MonnaieTest {
	@Test
	public void testCreate() {
		// double and float
		Monnaie m1 = new Monnaie(1.1); 
		assertTrue (m1.equals(new Monnaie(1.1f)));
		assertTrue (m1.equals(new Monnaie(1.1)));
		assertTrue (m1.equals(new Monnaie(1.101)));
		// arrondissements
		assertTrue (m1.equals(new Monnaie(1.099)));  
		assertFalse (m1.equals(new Monnaie(1.095)));
		assertTrue (m1.equals(new Monnaie(1.096)));
		assertTrue (m1.equals(new Monnaie(1.0955555556)));
		// valeurs negatives
		Monnaie m2 = new Monnaie(-2);
		assertTrue (m2.equals(new Monnaie(-2)));		
		assertTrue (m2.equals(new Monnaie(-2.0)));		
	}

	@Test
	public void testMultiply() {
		Monnaie m1 = new Monnaie(1);
		assertTrue (m1.multiply(5).equals(new Monnaie(5)));
		assertTrue (m1.equals(new Monnaie(1)));  // immuable
		Monnaie m2 = new Monnaie(1.0);
		assertTrue (m2.multiply(5).equals(new Monnaie(5)));
		Monnaie m3 = new Monnaie(10);
		assertTrue (m3.multiply(0.2f).equals(new Monnaie(2)));
	}

	@Test
	public void testAdd() {
		Monnaie m1 = new Monnaie(1);
		assertTrue (m1.add(new Monnaie(5)).equals(new Monnaie(6)));
		Monnaie m2 = new Monnaie(1.0);
		assertTrue (m2.add(new Monnaie(5.0)).equals(new Monnaie(6.0)));
	}

	@Test
	public void testSubtract() {
		Monnaie m1 = new Monnaie(6);
		assertTrue (m1.minus(new Monnaie(5)).equals(new Monnaie(1)));
		Monnaie m2 = new Monnaie(1.0);
		assertTrue (m2.minus(new Monnaie(5.0)).equals(new Monnaie(-4.0)));
	}

	@Test
	public void testEquals() {
		Monnaie m1 = new Monnaie(1.0);
		Monnaie m2 = new Monnaie(1.0);
		assertTrue(m1.equals(m2));
		assertTrue(m2.equals(m1));
		// ...
	}

}
