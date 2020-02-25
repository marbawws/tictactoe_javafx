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
		setstateCheckBoxAnimation(stateCheckBox);
	/*	imageTictactoeAnime1 = new ImageAjustableAnimee("");
		imageTictactoeAnime2 = new ImageAjustableAnimee("");
		imageTictactoeAnime3 = new ImageAjustableAnimee("");
		
		if (stateCheckBox) {
			imageTictactoeAnime1.startAnimation();
			imageTictactoeAnime2.startAnimation();
			imageTictactoeAnime3.startAnimation();
		} else {
			imageTictactoeAnime1.stopAnimation();
			imageTictactoeAnime2.stopAnimation();
			imageTictactoeAnime3.stopAnimation();
		}
*/
		/*if (stateCheckBox) {
			imageTictactoeAnime1.startAnimation();
			imageTictactoeAnime2.startAnimation();
			imageTictactoeAnime3.startAnimation();
		} else {

			imageTictactoeAnime1.stopAnimation();
			imageTictactoeAnime2.stopAnimation();
			imageTictactoeAnime3.stopAnimation();

		}*/

	}

	@Override
	public boolean getstateCheckBoxAnimation() {
		return stateCheckBoxAnimation;
	}

	@Override
	public void setstateCheckBoxAnimation(boolean stateCheckBoxAnimation) {
		this.stateCheckBoxAnimation = stateCheckBoxAnimation;
		
	}

}
