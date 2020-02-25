package tictactoe_client.commandes.stop_animations;

import commun.debogage.J;
import commun_client.commandes.Commande;

public class StopAnimation extends Commande<StopAnimationPourEnvoi, StopAnimationRecue>
		implements StopAnimationPourEnvoi, StopAnimationRecue {
	private boolean stateCheckBox;

	@Override
	public boolean getStateCheckBox() {
		J.appel(this);
		return this.stateCheckBox;
	}

	@Override
	public void setStateCheckBox(boolean stateCheckBox) {
		J.appel(this);
		this.stateCheckBox = stateCheckBox;
	}
	
}
