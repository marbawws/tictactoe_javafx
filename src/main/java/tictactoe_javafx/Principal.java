package tictactoe_javafx;

import commun.debogage.DoitEtre;
import commun.debogage.J;
import commun_client.mvc.controleurs.FabriqueControleur;
import commun_javafx.ChargeurDeVue;
import commun_javafx.Initialisateur;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import tictactoe.modeles.parametre.Parametres;
import tictactoe_client.vues.VueParametres;
import tictactoe_javafx.afficheurs.AfficheurParametresFX;
import tictactoe_javafx.controleurs.ControleurParametresFX;
import tictactoe_javafx.vues.VueParametresFX;

public class Principal extends Application {

	static {
		J.appel(Principal.class);

		Initialisateur.initialiser();
	}

	public static void main(String[] args) {
		J.appel(Principal.class);

		launch(args);
	}

	@Override
	public void start(Stage fenetrePrincipale) throws Exception {
		J.appel(this);

		Scene scenePrincipale = creerScenePrincipale();

		Stage fenetreParametre = new Stage();

		Scene sceneParametre = creerSceneParametre();

		fenetrePrincipale.setScene(scenePrincipale);

		fenetrePrincipale.show();

		fenetreParametre.setScene(sceneParametre);

		fenetreParametre.show();

	}

	private Scene creerScenePrincipale() {
		J.appel(this);

		ChargeurDeVue chargeur = new ChargeurDeVue("/fxml/principal.xml", "traductions.chaines", "/css/parametre.css");

		Scene scene = chargeur.nouvelleScene(600, 400);

		DoitEtre.nonNul(scene);

		return scene;
	}

	private Scene creerSceneParametre() {
		J.appel(this);

		ChargeurDeVue<VueParametresFX> chargeur;
		chargeur = new ChargeurDeVue("/fxml/parametre.xml", "traductions.chaines", "/css/parametre.css");
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

		return scene;
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
	public void stop() {
		J.appel(this);
	}
}