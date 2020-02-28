package tictactoe_client.commandes.ouvrirParametres;

import commun_client.commandes.Commande;
import tictactoe_client.commandes.ouvrirParametres.OuvrirParametresPourEnvoi;

public class OuvrirParametres extends Commande<OuvrirParametresPourEnvoi, 
                                               OuvrirParametresRecue>

							  implements OuvrirParametresPourEnvoi,
							             OuvrirParametresRecue {
}
