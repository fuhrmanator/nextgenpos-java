package core.ventes.tarification;

import core.ventes.Monnaie;
import core.ventes.Vente;

public interface IStratégieTarification {
	
	public Monnaie getTotal(Vente v);

}
