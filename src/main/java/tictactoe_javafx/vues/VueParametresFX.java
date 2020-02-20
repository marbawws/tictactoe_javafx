package tictactoe_javafx.vues;

import java.net.URL;
import java.util.ResourceBundle;

import commun.debogage.DoitEtre;
import commun.debogage.J;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import tictactoe_client.vues.VueParametres;

public class VueParametresFX implements VueParametres, Initializable {

	@FXML
	private CheckBox checkBoxScore;
	@FXML
	private CheckBox checkBoxAnimations;
	@FXML
	private CheckBox checkBoxSauvegarderParametres;
	
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

}
