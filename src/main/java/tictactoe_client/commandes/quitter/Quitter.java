package tictactoe_client.commandes.quitter;

import commun_client.commandes.Commande;
import tictactoe_client.commandes.quitter.QuitterPourEnvoi;

public class Quitter extends Commande<QuitterPourEnvoi, 
                                      QuitterRecue> 

					 implements QuitterPourEnvoi,
					            QuitterRecue {
}
