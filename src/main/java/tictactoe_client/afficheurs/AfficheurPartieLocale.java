package tictactoe_client.afficheurs;

import commun.debogage.J;
import commun_client.mvc.Afficheur;
import tictactoe.modeles.parametre.PartieLocaleLectureSeule;
import tictactoe_client.vues.VuePartieLocale;
import tictactoe_javafx.vues.VuePartieLocaleFX;

public abstract class AfficheurPartieLocale<V extends VuePartieLocale> extends Afficheur<PartieLocaleLectureSeule, V> {
	
	@Override
	public void initialiserAffichage(PartieLocaleLectureSeule modeleLectureSeule, V vue) {
		J.appel(this);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rafraichirAffichage(PartieLocaleLectureSeule modeleLectureSeule, V vue) {
		J.appel(this);
		
		vue.changerSymboles(modeleLectureSeule.getNombreCase());
		
	}

}
