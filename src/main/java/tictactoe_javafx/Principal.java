
package tictactoe_javafx;

import commun.debogage.DoitEtre;
import commun.debogage.J;
import commun_javafx.ChargeurDeVue;
import commun_javafx.Initialisateur;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;


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

		ChargeurDeVue chargeur = new ChargeurDeVue("/fxml/principal.xml");

		Scene scene = chargeur.nouvelleScene(600, 400);

		DoitEtre.nonNul(scene);

		return scene;
	}
	
	private Scene creerSceneParametre() {
		J.appel(this);

		ChargeurDeVue chargeur = new ChargeurDeVue("/fxml/parametre.xml", "traductions.chaines", "/css/parametre.css" );
		
		javafx.geometry.Rectangle2D tailleEcran = Screen.getPrimary().getVisualBounds();
		double largeur = tailleEcran.getWidth();
		double hauteur = tailleEcran.getHeight();
		
		
		Scene scene = chargeur.nouvelleScene(300, 200);
		
		//adaption au changement de résolution
		int taillePolice = (int)(largeur + hauteur) / 250;
		String cssTaillePolice = String.format("-fx-font-size: %dpx;", taillePolice);
		scene.getRoot().setStyle(cssTaillePolice);
		
		DoitEtre.nonNul(scene);
		
		

		return scene;
	}
	
	@Override
	public void stop() {
		J.appel(this);
	}
}