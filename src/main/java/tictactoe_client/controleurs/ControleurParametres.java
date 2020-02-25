package tictactoe_client.controleurs;

import commun.debogage.J;
import commun_client.mvc.controleurs.ControleurModeleVue;
import commun_client.mvc.controleurs.RecepteurCommandeMVC;
import tictactoe.modeles.parametre.Parametres;
import tictactoe.modeles.parametre.ParametresLectureSeule;
import tictactoe_client.afficheurs.AfficheurParametres;
import tictactoe_client.commandes.stop_animations.StopAnimation;
import tictactoe_client.commandes.stop_animations.StopAnimationRecue;
import tictactoe_client.vues.VueParametres;

public abstract class ControleurParametres<V extends VueParametres, A extends AfficheurParametres<V>>
			extends ControleurModeleVue<ParametresLectureSeule, Parametres, V, A>{

	@Override
	public void demarrer() {
		J.appel(this);
		
	}
	
	@Override
	protected void installerReceptionCommandes() {
	    J.appel(this);
	    
	    installerRecepteurCommande(StopAnimation.class, 
	                               new RecepteurCommandeMVC<StopAnimationRecue>() {

			@Override
			public void executerCommandeMVC(StopAnimationRecue commande) {
				J.appel(this);
				
				modele.stopAnimation(commande.getStateCheckBox());

			}
	    });
	} 
}
