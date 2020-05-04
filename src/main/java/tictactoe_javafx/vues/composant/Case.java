package tictactoe_javafx.vues.composant;

import commun.debogage.J;
import commun_client.commandes.FabriqueCommande;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import tictactoe_client.commandes.jouerIci.JouerIci;
import tictactoe_client.commandes.jouerIci.JouerIciPourEnvoi;

public class Case extends Button {

	private JouerIciPourEnvoi jouerIciPourEnvoi;
	private int nombreCase;

	public void installerCapteurJouerIci() {
		J.appel(this);

		this.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				J.appel(this);

				jouerIciPourEnvoi.setLaCase(nombreCase);
				jouerIciPourEnvoi.envoyerCommande();
			}
		});

	}

	public void obtenirJouerIciPourEnvoi() {
		J.appel(this);

		jouerIciPourEnvoi = FabriqueCommande.obtenirCommandePourEnvoi(JouerIci.class);
	}

	public void setNombreCase(int nombreCase) {
		J.appel(this);
		this.nombreCase = nombreCase;

	}

	public void jouerIci(int tour) {
		J.appel(this);

		if (tour % 2 == 0) {
			this.setText("X");
		} else {
			this.setText("O");
		}
	}

}
