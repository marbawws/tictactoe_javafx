package tictactoe_client.afficheurs;

import commun.debogage.J;
import commun_client.mvc.Afficheur;
import tictactoe.modeles.parametre.ParametresLectureSeule;
import tictactoe_client.vues.VueParametres;
import tictactoe_javafx.vues.VueParametresFX;

public abstract class AfficheurParametres<V extends VueParametres> extends Afficheur<ParametresLectureSeule, V> {

	@Override
	public void initialiserAffichage(ParametresLectureSeule modeleLectureSeule, V vue) {
		J.appel(this);
		 boolean randomBooleanAnimations = modeleLectureSeule.getRandomBooleanAnimations();
		 boolean randomBooleanScore = modeleLectureSeule.getRandomBooleanAnimations();
		 boolean randomBooleanSauvegarderParametres = modeleLectureSeule.getRandomBooleanSauvegarderParametres();
		 vue.creerStateCheckBoxes(randomBooleanScore, randomBooleanAnimations, randomBooleanSauvegarderParametres);
	}
}
