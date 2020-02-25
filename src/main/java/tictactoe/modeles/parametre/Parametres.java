package tictactoe.modeles.parametre;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import commun.debogage.DoitEtre;
import commun.debogage.J;
import commun.modeles.Modele;
import javafx.fxml.FXML;
import tictactoe_javafx.afficheurs.AfficheurParametresFX;
import tictactoe_javafx.vues.composant.ImageAjustableAnimee;

public class Parametres extends Modele<ParametresLectureSeule> implements ParametresLectureSeule {
	private boolean randomBooleanScore = createRandomboolean();
	private boolean randomBooleanAnimations = createRandomboolean();
	private boolean randomBooleanSauvegarderParametres = createRandomboolean();
	private boolean stateCheckBoxAnimation;

	private boolean createRandomboolean() {
		J.appel(this);
		Random randomBoolean = new Random();
		return randomBoolean.nextBoolean();
	}

	@Override
	public boolean getRandomBooleanAnimations() {
		J.appel(this);
		return randomBooleanAnimations;
	}

	@Override
	public boolean getRandomBooleanScore() {
		J.appel(this);
		return randomBooleanScore;
	}

	@Override
	public boolean getRandomBooleanSauvegarderParametres() {
		J.appel(this);
		return randomBooleanSauvegarderParametres;
	}

	public void stopAnimation(boolean stateCheckBox) {
		J.appel(this);
		setStateCheckBoxAnimation(stateCheckBox);

	}

	@Override
	public boolean getstateCheckBoxAnimation() {
		J.appel(this);
		return stateCheckBoxAnimation;
	}

	@Override
	public void setStateCheckBoxAnimation(boolean stateCheckBoxAnimation) {
		J.appel(this);
		this.stateCheckBoxAnimation = stateCheckBoxAnimation;
		
	}

}
