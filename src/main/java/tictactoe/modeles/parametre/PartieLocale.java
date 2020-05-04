package tictactoe.modeles.parametre;

import commun.modeles.Modele;

public class PartieLocale extends Modele<PartieLocaleLectureSeule> implements PartieLocaleLectureSeule{
	
	private int nombreCaseAchanger;
	
	public void jouerIci(int nombreCase) {
		this.nombreCaseAchanger = nombreCase;
		
	}

	@Override
	public int getNombreCase() {
		// TODO Auto-generated method stub
		return nombreCaseAchanger;
	}

}
