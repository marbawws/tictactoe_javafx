package tictactoe_javafx.vues;

import java.net.URL;
import java.util.ResourceBundle;

import commun.debogage.J;
import commun_client.commandes.FabriqueCommande;
import commun_javafx.ChargeurDeVue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import tictactoe_javafx.vues.VuePartieLocaleFX;
import tictactoe_client.commandes.nouvellePartie.NouvellePartie;
import tictactoe_client.commandes.ouvrirParametres.OuvrirParametres;
import tictactoe_client.commandes.quitter.Quitter;
import tictactoe_client.commandes.nouvellePartie.NouvellePartiePourEnvoi;
import tictactoe_client.commandes.ouvrirParametres.OuvrirParametresPourEnvoi;
import tictactoe_client.commandes.quitter.QuitterPourEnvoi;
import tictactoe_client.vues.VuePrincipal;

public class VuePrincipalFX implements VuePrincipal, Initializable{

	
	@FXML
	MenuItem menuNouvellePartie, menuParametres, menuQuitter;
	
	@FXML
	VBox conteneurPartie;
	
	QuitterPourEnvoi quitterPourEnvoi;
	OuvrirParametresPourEnvoi ouvrirParametresPourEnvoi;
	NouvellePartiePourEnvoi nouvellePartiePourEnvoi;

	
	@Override
	public void obtenirCommandesPourEnvoi() {
		J.appel(this);
		// TODO Auto-generated method stub
		quitterPourEnvoi = FabriqueCommande.obtenirCommandePourEnvoi(Quitter.class);
		ouvrirParametresPourEnvoi = FabriqueCommande.obtenirCommandePourEnvoi(OuvrirParametres.class);
		nouvellePartiePourEnvoi = FabriqueCommande.obtenirCommandePourEnvoi(NouvellePartie.class);
	}

	@Override
	public void installerCapteursEvenementsUsager() {
		J.appel(this);
		
		menuQuitter.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				J.appel(this);
				quitterPourEnvoi.envoyerCommande();
			}
		});
		
		menuParametres.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				J.appel(this);
				
				ouvrirParametresPourEnvoi.envoyerCommande();
				
			}
		});
		
		menuNouvellePartie.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				J.appel(this);
				
				nouvellePartiePourEnvoi.envoyerCommande();
			}
		});
		
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		J.appel(this);
		// TODO Auto-generated method stub
		
	}
	
	public VuePartieLocaleFX creerVuePartieLocale() {
		J.appel(this);

		ChargeurDeVue<VuePartieLocaleFX> chargeur = new ChargeurDeVue<VuePartieLocaleFX>("/fxml/partieLocale.xml",
						"traductions.chaines",
						"/css/partieLocale.css");
		
	   VuePartieLocaleFX vuePartieLocale = chargeur.getVue();
	    
	   Parent parent = chargeur.getParent();
	    
	   conteneurPartie.getChildren().clear();
	   conteneurPartie.getChildren().add(parent);
	    
	    return vuePartieLocale;
	}

	@Override
	public void verifierCommandesPossibles() {
		// TODO Auto-generated method stub
		
	}

}
