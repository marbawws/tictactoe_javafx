package tictactoe_client.controleurs;

import commun.debogage.J;
import commun_client.mvc.controleurs.ControleurModeleVue;
import tictactoe.modeles.parametre.Parametres;
import tictactoe.modeles.parametre.ParametresLectureSeule;
import tictactoe_client.afficheurs.AfficheurParametres;
import tictactoe_client.vues.VueParametres;

public abstract class ControleurParametres<V extends VueParametres, A extends AfficheurParametres<V>>
			extends ControleurModeleVue<ParametresLectureSeule, Parametres, V, A>{

	@Override
	public void demarrer() {
		J.appel(this);
		
	}
}
