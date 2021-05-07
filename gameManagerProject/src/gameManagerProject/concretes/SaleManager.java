package gameManagerProject.concretes;

import gameManagerProject.abstracts.SaleService;
import gameManagerProject.entities.Campaign;
import gameManagerProject.entities.Player;
import gameManagerProject.entities.Sale;

public class SaleManager implements SaleService
{
	public void sale(Sale sale, Campaign campaign, Player player)
	{
		double newSale = sale.getSalePrice() - (sale.getSalePrice() * (campaign.getDiscountAmount() / 100));
		System.out.println(
				player.getFirstName() 
				+ " Sana özel " 
				+ campaign.getCampaignName() + "Kampanyasý" 
				+ " Yeni Fiyatýyla Sadece " + newSale + "TL" );
	}
}
