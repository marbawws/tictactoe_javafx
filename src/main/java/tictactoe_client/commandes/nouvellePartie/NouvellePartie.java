package tictactoe_client.commandes.nouvellePartie;

import commun_client.commandes.Commande;
import tictactoe_client.commandes.nouvellePartie.NouvellePartiePourEnvoi;

public class NouvellePartie extends Commande<NouvellePartiePourEnvoi, 
                                             NouvellePartieRecue>

							implements NouvellePartiePourEnvoi, 
							           NouvellePartieRecue {
}
