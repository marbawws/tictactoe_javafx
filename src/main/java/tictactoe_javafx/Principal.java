package tictactoe_javafx;

import commun.debogage.DoitEtre;
import commun.debogage.J;
import commun_client.mvc.controleurs.FabriqueControleur;
import commun_javafx.ChargeurDeVue;
import commun_javafx.DialogueModal;
import commun_javafx.Initialisateur;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import tictactoe.modeles.parametre.Parametres;
import tictactoe_client.vues.VueParametres;
import tictactoe_javafx.afficheurs.AfficheurParametresFX;
import tictactoe_javafx.controleurs.ControleurParametresFX;
import tictactoe_javafx.controleurs.ControleurPartieLocaleFX;
import tictactoe_javafx.controleurs.ControleurPrincipalFX;
import tictactoe_javafx.vues.VueParametresFX;
import tictactoe_javafx.vues.VuePartieLocaleFX;
import tictactoe_javafx.vues.VuePrincipalFX;

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
		
		DialogueModal.enregistreFenetrePrincipale(fenetrePrincipale);
		
		ChargeurDeVue<VuePrincipalFX> chargeur;
	    chargeur = new ChargeurDeVue<VuePrincipalFX>("/fxml/principal.xml",
	                                                  "traductios.chaines",
	                                                  "/css/principal.css");
	    
	    Scene scene = chargeur.nouvelleScene(800, 600);
	    
	    fenetrePrincipale.setScene(scene);

	    fenetrePrincipale.show();
	    
	    VuePrincipalFX vue = chargeur.getVue();
	    
	    DoitEtre.nonNul(vue);
	    
	    FabriqueControleur.creerControleur(ControleurPrincipalFX.class, 
                vue);


		//Scene scenePrincipale = creerScenePrincipale();

		//Stage fenetreParametre = new Stage();

		//Scene sceneParametre = creerSceneParametre();

		//fenetrePrincipale.setScene(scenePrincipale);

		//fenetrePrincipale.show();

		/*fenetreParametre.setScene(sceneParametre);

		fenetreParametre.show();*/

	}

	/*private Scene creerScenePrincipale() {
		J.appel(this);

		ChargeurDeVue chargeur = new ChargeurDeVue<VuePrincipalFX>("/fxml/principal.xml", "traductions.chaines", "/css/parametre.css");

		Scene scene = chargeur.nouvelleScene(600, 400);

		DoitEtre.nonNul(scene);

		return scene;
	}*/

	/*private Scene creerSceneParametre() {
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

		return scene;
	}*/
	
	/*private String createCssTaillePolice() {
		J.appel(this);
		javafx.geometry.Rectangle2D tailleEcran = Screen.getPrimary().getVisualBounds();
		double largeur = tailleEcran.getWidth();
		double hauteur = tailleEcran.getHeight();

		// adaption au changement de résolution
		int taillePolice = (int) (largeur + hauteur) / 250;
		String cssTaillePolice = String.format("-fx-font-size: %dpx;", taillePolice);
		return cssTaillePolice;
	}*/

	@Override
	public void stop() {
		J.appel(this);
	}
}