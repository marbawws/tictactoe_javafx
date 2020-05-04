package tictactoe_javafx.vues;

import java.net.URL;
import java.util.ResourceBundle;

import commun.debogage.DoitEtre;
import commun.debogage.J;
import javafx.fxml.Initializable;
import tictactoe_client.vues.VuePartieLocale;
import tictactoe_javafx.vues.composant.Case;
import javafx.fxml.FXML;

public class VuePartieLocaleFX implements VuePartieLocale, Initializable{
	
	@FXML
	private Case case1;
	@FXML
	private Case case2;
	@FXML
	private Case case3;
	@FXML
	private Case case4;
	@FXML
	private Case case5;
	@FXML
	private Case case6;
	@FXML
	private Case case7;
	@FXML
	private Case case8;
	@FXML
	private Case case9;
	
	private int tour = 0;
	@Override
	public void obtenirCommandesPourEnvoi() {
		// TODO Auto-generated method stub
		case1.obtenirJouerIciPourEnvoi();
		case2.obtenirJouerIciPourEnvoi();
		case3.obtenirJouerIciPourEnvoi();
		case4.obtenirJouerIciPourEnvoi();
		case5.obtenirJouerIciPourEnvoi();
		case6.obtenirJouerIciPourEnvoi();
		case7.obtenirJouerIciPourEnvoi();
		case8.obtenirJouerIciPourEnvoi();
		case9.obtenirJouerIciPourEnvoi();
	}

	@Override
	public void installerCapteursEvenementsUsager() {
		J.appel(this);
		case1.installerCapteurJouerIci();
		case2.installerCapteurJouerIci();
		case3.installerCapteurJouerIci();
		case4.installerCapteurJouerIci();
		case5.installerCapteurJouerIci();
		case6.installerCapteurJouerIci();
		case7.installerCapteurJouerIci();
		case8.installerCapteurJouerIci();
		case9.installerCapteurJouerIci();
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		J.appel(this);
		DoitEtre.nonNul(case1);
		DoitEtre.nonNul(case2);
		DoitEtre.nonNul(case3);
		DoitEtre.nonNul(case4);
		DoitEtre.nonNul(case5);
		DoitEtre.nonNul(case6);
		DoitEtre.nonNul(case7);
		DoitEtre.nonNul(case8);
		DoitEtre.nonNul(case9);
		case1.setNombreCase(1);
		case2.setNombreCase(2);
		case3.setNombreCase(3);
		case4.setNombreCase(4);
		case5.setNombreCase(5);
		case6.setNombreCase(6);
		case7.setNombreCase(7);
		case8.setNombreCase(8);
		case9.setNombreCase(9);
	}

	@Override
	public void changerSymboles(int nombreCase) {
		// TODO Auto-generated method stub
		J.appel(this);
		
		switch (nombreCase) {
		case 1:
			changerSymbole(case1);
			break;
		case 2:
			changerSymbole(case2);
			break;
		case 3:
			changerSymbole(case3);
			break;
		case 4:
			changerSymbole(case4);	
			break;
		case 5:
			changerSymbole(case5);		
			break;
		case 6:
			changerSymbole(case6);	
			break;
		case 7:
			changerSymbole(case7);
			break;
		case 8:
			changerSymbole(case8);
			break;
		case 9:
			changerSymbole(case9);
			break;			
		}
	}
	
	private void changerSymbole(Case LaCase) {
		if (LaCase.getText().isEmpty()) {
			LaCase.jouerIci(tour);
			tour++;
		}
	}

	@Override
	public void verifierCommandesPossibles() {
		// TODO Auto-generated method stub
		
	}

}
