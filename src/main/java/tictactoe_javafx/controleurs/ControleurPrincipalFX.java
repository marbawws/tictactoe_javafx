package tictactoe_javafx.controleurs;

import commun.debogage.DoitEtre;
import commun.debogage.J;
import commun.systeme.Systeme;
import commun_client.mvc.controleurs.FabriqueControleur;
import commun_client.mvc.controleurs.RecepteurCommandeMVC;
import commun_javafx.ChargeurDeVue;
import commun_javafx.DialogueModal;
import javafx.scene.Scene;
import javafx.stage.Screen;
import tictactoe.modeles.parametre.Parametres;
import tictactoe.modeles.parametre.PartieLocale;
import tictactoe_client.commandes.nouvellePartie.NouvellePartie;
import tictactoe_client.commandes.nouvellePartie.NouvellePartieRecue;
import tictactoe_client.commandes.ouvrirParametres.OuvrirParametres;
import tictactoe_client.commandes.ouvrirParametres.OuvrirParametresRecue;
import tictactoe_client.commandes.quitter.Quitter;
import tictactoe_client.commandes.quitter.QuitterRecue;
import tictactoe_javafx.afficheurs.AfficheurParametresFX;
import tictactoe_javafx.afficheurs.AfficheurPartieLocaleFX;
import tictactoe_javafx.vues.VueParametresFX;
import tictactoe_javafx.vues.VuePartieLocaleFX;
import tictactoe_client.controleurs.ControleurPrincipal;
import tictactoe_javafx.vues.VuePrincipalFX;

public class ControleurPrincipalFX extends ControleurPrincipal<VuePrincipalFX> {

	@Override
	protected void installerReceptionCommandes() {
		J.appel(this);

		installerRecepteurCommande(Quitter.class, new RecepteurCommandeMVC<QuitterRecue>() {
			@Override
			public void executerCommandeMVC(QuitterRecue commande) {
				J.appel(this);
				
				Systeme.quitter();
			}
		});

		installerRecepteurCommande(OuvrirParametres.class, new RecepteurCommandeMVC<OuvrirParametresRecue>() {
			@Override
			public void executerCommandeMVC(OuvrirParametresRecue commande) {
				J.appel(this);
				
				ouvrirParametres();

			}
		});

		installerRecepteurCommande(NouvellePartie.class, new RecepteurCommandeMVC<NouvellePartieRecue>() {
			@Override
			public void executerCommandeMVC(NouvellePartieRecue commande) {
				J.appel(this);

				nouvellePartieLocale();

			}
		});
	}

	private void nouvellePartieLocale() {
		J.appel(this);

		VuePartieLocaleFX vuePartieLocale = vue.creerVuePartieLocale();

		PartieLocale partie = new PartieLocale();

		AfficheurPartieLocaleFX afficheur = new AfficheurPartieLocaleFX();

		FabriqueControleur.creerControleur(ControleurPartieLocaleFX.class, partie, vuePartieLocale, afficheur);

	}

	private void ouvrirParametres() {
		J.appel(this);

		ChargeurDeVue<VueParametresFX> chargeur;
		chargeur = new ChargeurDeVue<VueParametresFX>("/fxml/parametre.xml", "traductions.chaines", "/css/parametre.css");
		VueParametresFX vue = chargeur.getVue();
		DoitEtre.nonNul(vue);
		Parametres parametres = new Parametres();
		AfficheurParametresFX afficheur = new AfficheurParametresFX();
		FabriqueControleur.creerControleur(ControleurParametresFX.class, parametres, vue, afficheur);

		Scene scene = chargeur.nouvelleScene(650, 570);

		// adaption au changement de résolution
		String cssTaillePolice = createCssTaillePolice();
		scene.getRoot().setStyle(cssTaillePolice);

		DoitEtre.nonNul(scene);
		
		DialogueModal.ouvrirDialogueModal(scene);

	}
	
	private String createCssTaillePolice() {
		J.appel(this);
		javafx.geometry.Rectangle2D tailleEcran = Screen.getPrimary().getVisualBounds();
		double largeur = tailleEcran.getWidth();
		double hauteur = tailleEcran.getHeight();

		// adaption au changement de résolution
		int taillePolice = (int) (largeur + hauteur) / 250;
		String cssTaillePolice = String.format("-fx-font-size: %dpx;", taillePolice);
		return cssTaillePolice;
	}

	@Override
	protected void demarrer() {
		J.appel(this);
		// TODO Auto-generated method stub

	}
}
