package core.ventes;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Monnaie {
    public static final String DOLLAR_CANADIEN = "CD";
	private BigDecimal montant;
    private String devise;

    public Monnaie(BigDecimal montant, String devise) {
        this.montant = montant;
        this.devise = devise;
    }

    // constructeur simple
    public Monnaie(double d) {
    	this.montant = new BigDecimal(d);
    	this.montant = montant.setScale(2, RoundingMode.HALF_UP);
    	this.devise = Monnaie.DOLLAR_CANADIEN;
	}

	public BigDecimal getMontant() {
        return montant;
    }

    public String getDevise() {
        return devise;
    }

	public Monnaie add(Monnaie m) {
		BigDecimal bd = m.getMontant();
		return new Monnaie(this.montant.add(bd), this.getDevise());
	}

	public Monnaie multiply(int amount) {
		BigDecimal bd = new BigDecimal(amount);
		return new Monnaie(this.montant.multiply(bd), this.getDevise());
	}

	/**
	 * Note: amount is rounded up at 4 decimal places
	 * @param amount
	 * @return
	 */
	public Monnaie multiply(float amount) {
		BigDecimal bd = new BigDecimal(amount);
		bd = bd.setScale(4, RoundingMode.HALF_UP);
		return new Monnaie(this.montant.multiply(bd).setScale(2, RoundingMode.HALF_UP), this.getDevise());
	}


	// equal si les objets sont du même type ET les montants ET les devises sont égaux
	public boolean equals(Object otherObj) {
		if (!(otherObj instanceof Monnaie)) { return false;}
		Monnaie otherMonnaie = (Monnaie) otherObj;
		boolean montantsEgaux = this.getMontant().equals(otherMonnaie.getMontant());
		boolean devisesEgales = this.getDevise().equals(otherMonnaie.getDevise());
		return (montantsEgaux && devisesEgales);
	}

	public Monnaie minus(Monnaie m) {
		BigDecimal bd = m.getMontant();
		return new Monnaie(this.montant.subtract(bd), this.getDevise());
	}

	public String toString() {
		return this.montant + "(" + this.devise + ")";
	}
}
