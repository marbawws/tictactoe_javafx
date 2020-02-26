package tictactoe_client.controleurs;

import commun.debogage.J;
import commun_client.mvc.controleurs.ControleurModeleVue;
import tictactoe.modeles.parametre.Principal;
import tictactoe.modeles.parametre.PrincipalLectureSeule;
import tictactoe_client.afficheurs.AfficheurPrincipal;
import tictactoe_client.vues.VuePrincipal;

public abstract class ControleurPrincipal<V extends VuePrincipal, A extends AfficheurPrincipal<V>>
		extends ControleurModeleVue<PrincipalLectureSeule, Principal, V, A> {

	@Override
	protected void installerReceptionCommandes() {
		J.appel(this);
		// TODO Auto-generated method stub

	}

	@Override
	protected void demarrer() {
		J.appel(this);
		// TODO Auto-generated method stub

	}

}