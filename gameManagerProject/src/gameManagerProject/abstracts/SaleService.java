package gameManagerProject.abstracts;

import gameManagerProject.entities.Campaign;
import gameManagerProject.entities.Player;
import gameManagerProject.entities.Sale;

public interface SaleService 
{
	void sale(Sale sale, Campaign campaign, Player player);
}
