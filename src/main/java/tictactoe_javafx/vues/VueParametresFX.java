package tictactoe_javafx.vues;

import java.net.URL;
import java.util.ResourceBundle;

import commun.debogage.DoitEtre;
import commun.debogage.J;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import tictactoe_client.vues.VueParametres;
import tictactoe_javafx.vues.composant.CheckBoxTictactoe;
import tictactoe_javafx.vues.composant.ImageAjustableAnimee;

public class VueParametresFX implements VueParametres, Initializable {

	@FXML
	private CheckBoxTictactoe checkBoxScore;
	@FXML
	private CheckBoxTictactoe checkBoxAnimations;
	@FXML
	private CheckBoxTictactoe checkBoxSauvegarderParametres;
	@FXML
	private ImageAjustableAnimee imageTictactoeAnime1;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		J.appel(this);
		
		DoitEtre.nonNul(checkBoxAnimations);
		DoitEtre.nonNul(checkBoxSauvegarderParametres);
		DoitEtre.nonNul(checkBoxScore);
		
	}

	@Override
	public void creerStateCheckBoxes(boolean randomBooleanScore, boolean randomBooleanAnimations, boolean randomBooleanSauvegarderParametres ) {
		J.appel(this);
		checkBoxAnimations.setSelected(randomBooleanAnimations);
		checkBoxSauvegarderParametres.setSelected(randomBooleanSauvegarderParametres);
		checkBoxScore.setSelected(randomBooleanScore);
		
	}

	@Override
	public void obtenirCommandesPourEnvoi() {
		J.appel(this);
		// TODO Auto-generated method stub
		this.checkBoxAnimations.obtenirStopAnimationPourEnvoi();
	}

	@Override
	public void installerCapteursEvenementsUsager() {
		J.appel(this);
		// TODO Auto-generated method stub
		this.checkBoxAnimations.installerCapteursStopAnimation();
	}
	
	@Override
	public void startAnimation() {
		J.appel(this);
		
		imageTictactoeAnime1.startAnimation();
	}

	@Override
	public void manageAnimation(boolean stateCheckBoxAnimation) {
		// TODO Auto-generated method stub
		if (stateCheckBoxAnimation) {
			imageTictactoeAnime1.startAnimation();
		} else {
			imageTictactoeAnime1.stopAnimation();
		}
	}
}
