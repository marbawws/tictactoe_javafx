package tictactoe.modeles.parametre;

import java.util.Random;

import commun.debogage.J;
import commun.modeles.Modele;

public class Parametres extends Modele<ParametresLectureSeule> implements ParametresLectureSeule{
	private boolean randomBooleanScore = createRandomboolean();
	private boolean randomBooleanAnimations = createRandomboolean();
	private boolean randomBooleanSauvegarderParametres = createRandomboolean();
	private int hauteurGrille;
					
	private boolean createRandomboolean() {
		J.appel(this);
		Random randomBoolean = new Random();
		return randomBoolean.nextBoolean();
	}
	
	public boolean getRandomBooleanAnimations(){
		J.appel(this);
		return randomBooleanAnimations;
	}
	
	public boolean getRandomBooleanScore(){
		J.appel(this);
		return randomBooleanScore;
	}
	
	public boolean getRandomBooleanSauvegarderParametres(){
		J.appel(this);
		return randomBooleanSauvegarderParametres;
	}


	@Override
	public int getHauteurGrille() {
		J.appel(this);
		return hauteurGrille;
	}
}
