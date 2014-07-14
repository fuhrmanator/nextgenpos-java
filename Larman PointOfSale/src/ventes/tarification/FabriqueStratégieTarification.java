package ventes.tarification;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * FabriqueStrat�gieTarification classe singleton, voir la Figure F23.12 de UML 2 et les design patterns de Larman
 * @author Cris
 *
 */
public class FabriqueStrat�gieTarification {
	
	private static FabriqueStrat�gieTarification instance;
	
	public synchronized static FabriqueStrat�gieTarification getInstance () {
		if (instance == null) {
			instance = new FabriqueStrat�gieTarification();
		}
		return instance;
	}
	
	public IStrat�gieTarification getStrat�gieTarification() {
		String nomClasse = System
				.getProperty("strategietarification.class.name");
		IStrat�gieTarification strat�gie = null;
		if (nomClasse != null) {
			System.out.println("Strat�gie de tarification trouv�e: " + nomClasse);
			try {
				// instancier une strat�gie avec pourcentage
				String pourcentage = System.getProperty("strategietarification.class.percentage");
				Class[] floatArgClass = new Class[] {float.class};
				if (pourcentage != null) {
					System.out.println("Pourcentage pour tarification: " + pourcentage);
					Class strat�gieClass = Class.forName(nomClasse);
					try {
						// puisque le constructeur est visible seulement dans le package, faut getDeclaredConstructor
						Constructor strat�gieConstructor = strat�gieClass.getDeclaredConstructor(floatArgClass);
						Object[] floatArg = new Object[] {Float.parseFloat(pourcentage)/100};
						try {
							strat�gie = (IStrat�gieTarification) strat�gieConstructor.newInstance(floatArg);
						} catch (IllegalArgumentException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (InvocationTargetException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					} catch (NoSuchMethodException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (SecurityException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				} else {
					strat�gie = (IStrat�gieTarification) Class.forName(nomClasse)
						.newInstance();
				}
			} catch (InstantiationException | IllegalAccessException
					| ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return strat�gie;
	}

}
