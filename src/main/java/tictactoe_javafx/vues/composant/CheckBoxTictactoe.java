package tictactoe_javafx.vues.composant;

import commun.debogage.J;
import commun_client.commandes.FabriqueCommande;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.CheckBox;
import tictactoe_client.commandes.stop_animations.StopAnimation;
import tictactoe_client.commandes.stop_animations.StopAnimationPourEnvoi;

public class CheckBoxTictactoe extends CheckBox {

	private StopAnimationPourEnvoi stopAnimationPourEnvoi;
	private boolean stateCheckBox;

	public void installerCapteursStopAnimation() {
		J.appel(this);

		this.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				J.appel(this);
				// inverse de staateCheckbox pcq le state vient de changer dans cette methode
				// (handle), donc il devient lopposer
				stopAnimationPourEnvoi.setStateCheckBox(!stateCheckBox);
				stopAnimationPourEnvoi.envoyerCommande();
			}
		});

	}

	public void obtenirStopAnimationPourEnvoi() {
		J.appel(this);

		stopAnimationPourEnvoi = FabriqueCommande.obtenirCommandePourEnvoi(StopAnimation.class);

	}

	public void setStateCheckBox() {
		J.appel(this);
		this.stateCheckBox = this.isSelected();
	}

	public void refresh() {
		J.appel(this);
		// TODO Auto-generated method stub
		setStateCheckBox();
	}
}
