package tictactoe.modeles.parametre;

import commun.modeles.ModeleLectureSeule;

public interface PartieLocaleLectureSeule extends ModeleLectureSeule{
	void jouerIci(int nombreCase);
	int getNombreCase();
}
