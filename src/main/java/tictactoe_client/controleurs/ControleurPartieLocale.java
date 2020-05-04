package tictactoe_client.controleurs;

import commun.debogage.J;
import commun_client.mvc.controleurs.ControleurModeleVue;
import commun_client.mvc.controleurs.RecepteurCommandeMVC;
import tictactoe.modeles.parametre.PartieLocale;
import tictactoe.modeles.parametre.PartieLocaleLectureSeule;
import tictactoe_client.afficheurs.AfficheurPartieLocale;
import tictactoe_client.commandes.jouerIci.JouerIci;
import tictactoe_client.commandes.jouerIci.JouerIciRecue;
import tictactoe_client.vues.VuePartieLocale;

public abstract class ControleurPartieLocale<V extends VuePartieLocale, A extends AfficheurPartieLocale<V>>
		extends ControleurModeleVue<PartieLocaleLectureSeule, PartieLocale, V, A> {

	@Override
	protected void installerReceptionCommandes() {
		J.appel(this);
		installerRecepteurCommande(JouerIci.class, 
                new RecepteurCommandeMVC<JouerIciRecue>() {

			@Override
			public void executerCommandeMVC(JouerIciRecue commande) {
			J.appel(this);

				int nombreCase = commande.getLaCase();
				modele.jouerIci(nombreCase);
			}
		});

	}

	@Override
	protected void demarrer() {
		J.appel(this);
		// TODO Auto-generated method stub

	}

}