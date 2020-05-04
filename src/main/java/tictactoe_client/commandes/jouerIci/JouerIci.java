package tictactoe_client.commandes.jouerIci;

import commun.debogage.J;
import commun_client.commandes.Commande;

public class JouerIci extends Commande<JouerIciPourEnvoi, JouerIciRecue> implements JouerIciPourEnvoi, JouerIciRecue {
	private int laCase;

	@Override
	public void setLaCase(int laCase) {
		J.appel(this);
		
		this.laCase = laCase;
	}

	@Override
	public int getLaCase() {
		J.appel(this);
		
		return this.laCase;
	}
}
