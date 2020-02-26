package tictactoe_client.afficheurs;

import commun.debogage.J;
import commun_client.mvc.Afficheur;
import tictactoe.modeles.parametre.PrincipalLectureSeule;
import tictactoe_client.vues.VuePrincipal;
import tictactoe_javafx.vues.VuePrincipalFX;

public abstract class AfficheurPrincipal<V extends VuePrincipal> extends Afficheur<PrincipalLectureSeule, V> {
	
	@Override
	public void initialiserAffichage(PrincipalLectureSeule modeleLectureSeule, V vue) {
		J.appel(this);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rafraichirAffichage(PrincipalLectureSeule modeleLectureSeule, V vue) {
		J.appel(this);
		// TODO Auto-generated method stub
		
	}

}
