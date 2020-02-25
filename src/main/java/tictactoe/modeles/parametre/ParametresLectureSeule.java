package tictactoe.modeles.parametre;

import commun.modeles.ModeleLectureSeule;
import tictactoe_javafx.vues.composant.ImageAjustableAnimee;

public interface ParametresLectureSeule extends ModeleLectureSeule{
	
	boolean getRandomBooleanAnimations();
	boolean getRandomBooleanScore();
	boolean getRandomBooleanSauvegarderParametres();
	boolean getstateCheckBoxAnimation();
	void setStateCheckBoxAnimation(boolean stateCheckBoxAnimation);
}
