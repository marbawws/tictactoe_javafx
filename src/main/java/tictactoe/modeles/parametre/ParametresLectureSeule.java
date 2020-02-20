package tictactoe.modeles.parametre;

import commun.modeles.ModeleLectureSeule;

public interface ParametresLectureSeule extends ModeleLectureSeule{
	
	int getHauteurGrille();
	boolean getRandomBooleanAnimations();
	boolean getRandomBooleanScore();
	boolean getRandomBooleanSauvegarderParametres();
}
