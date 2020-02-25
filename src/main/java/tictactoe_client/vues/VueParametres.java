package tictactoe_client.vues;

import commun_client.mvc.Vue;

public interface VueParametres extends Vue {
	
	void creerStateCheckBoxes(boolean randomBooleanScore, boolean randomBooleanAnimations, boolean randomBooleanSauvegarderParametres);
	void startAnimation();
	void manageAnimation(boolean stateCheckBoxAnimation);
}
