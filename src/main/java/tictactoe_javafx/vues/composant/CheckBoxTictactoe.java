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
				
				stopAnimationPourEnvoi.setStateCheckBox(stateCheckBox);
				stopAnimationPourEnvoi.envoyerCommande();
			}
		});

	}

	public void obtenirStopAnimationPourEnvoi() {
		J.appel(this);
		setStateCheckBox();
		stopAnimationPourEnvoi = FabriqueCommande.obtenirCommandePourEnvoi(StopAnimation.class);
		
	}
	
	public void setStateCheckBox() {
		this.stateCheckBox = this.isSelected();
	}
}
