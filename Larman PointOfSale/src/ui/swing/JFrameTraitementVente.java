package ui.swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import core.util.Transformer;
import core.ventes.CodeArticle;
import core.ventes.Registre;

public class JFrameTraitementVente extends JFrame {
	// the window has a reference to the 'controller' domain object

	private Registre registre;

	// the window is passed the register, on creation
	public JFrameTraitementVente(Registre _registre) {
		registre = _registre;
		
		setLayout(new BorderLayout());
		
		JPanel panelTop = new JPanel();
		panelTop.add(getBTN_DEM_VENTE());
		panelTop.add(getBTN_TERM_VENTE());
		
		JLabel idLabel = new JLabel("Code article:");
		JPanel panelCenter = new JPanel();
		panelCenter.add(idLabel);
		panelCenter.add(getTXT_ID());
		panelCenter.add(new JLabel("Qté"));
		panelCenter.add(getTXT_QTE());		

		JPanel panelBottom = new JPanel();
		panelBottom.add(getBTN_ENTER_ITEM());
		add(panelTop, BorderLayout.NORTH);
		add(panelCenter, BorderLayout.CENTER);
		add(panelBottom, BorderLayout.SOUTH);
		setTitle("Traiter vente");
		pack();
		setLocationRelativeTo(null);
	}

	private JButton BTN_ENTER_ITEM, BTN_DEM_VENTE, BTN_TERM_VENTE;

	private JTextField TXT_ID, TXT_QTE;

	private JButton getBTN_DEM_VENTE() {
		if (BTN_DEM_VENTE != null)
			return BTN_DEM_VENTE;

		BTN_DEM_VENTE = new JButton();
		BTN_DEM_VENTE.setText("Démarrer Vente");

		BTN_DEM_VENTE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registre.créerNouvelleVente();  // opération système
			}
		}); 

		return BTN_DEM_VENTE;
	} 

	private JButton getBTN_TERM_VENTE() {
		if (BTN_TERM_VENTE != null)
			return BTN_TERM_VENTE;

		BTN_TERM_VENTE = new JButton();
		BTN_TERM_VENTE.setText("Terminer Vente");

		BTN_TERM_VENTE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registre.terminerVente(); // opération système
			}
		}); 

		return BTN_TERM_VENTE;
	}

	// voilà la méthode importante !
	// ici le message de la couche Présentation vers la couche Domaine
	private JButton getBTN_ENTER_ITEM() {
		if (BTN_ENTER_ITEM != null)
			return BTN_ENTER_ITEM;

		BTN_ENTER_ITEM = new JButton();
		BTN_ENTER_ITEM.setText("Saisir Article");

		// VOICI LA SECTION CLÉ !
		// voici comment on définit en Java un
		// auditeur d'événements pour un bouton
		BTN_ENTER_ITEM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Transformer is a utility class to
				// transform Strings to other data types
				// because the JTextField GUI widgets have Strings
				CodeArticle id = Transformer.toItemID(getTXT_ID().getText());
				int qte = Transformer.toInt(getTXT_QTE().getText());

				// ici nous traversons la frontière
				// entre la couche Présentation et la couche Domaine
				// pour déléger au 'contrôleur'
				// >>> VOICI L'INSTRUCTION CLÉ <<<
				registre.saisirArticle(id, qte);
			}
		});

		return BTN_ENTER_ITEM;
	}

	private JTextField getTXT_QTE() {
		if (TXT_QTE != null)
			return TXT_QTE;

		TXT_QTE = new JTextField(3);
		return this.TXT_QTE;
	}

	private JTextField getTXT_ID() {
		if (TXT_ID != null)
			return TXT_ID;

		TXT_ID = new JTextField(5);
		return this.TXT_ID;
	}

	// …

}
