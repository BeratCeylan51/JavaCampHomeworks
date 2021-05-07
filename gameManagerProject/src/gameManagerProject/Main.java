package gameManagerProject;

import java.time.LocalDate;

import gameManagerProject.adapters.MernisServiceAdapter;
import gameManagerProject.concretes.CampaignManager;
import gameManagerProject.concretes.PlayerManager;
import gameManagerProject.concretes.SaleManager;
import gameManagerProject.entities.Campaign;
import gameManagerProject.entities.Player;
import gameManagerProject.entities.Sale;

public class Main {

	public static void main(String[] args) 
	{
		Player player = new Player(1, "Berat", "Ceylan", LocalDate.of(2001,10,26), "12345678910"); 
		
		PlayerManager playerManager = new PlayerManager(new MernisServiceAdapter());
		playerManager.add(player);
		
		Campaign campaign = new Campaign(1, "Yeni Üye ", 12, 2);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		
		Sale sale = new Sale(1, 70);
		
		SaleManager saleManager = new SaleManager();
		saleManager.sale(sale, campaign, player);
	}

}
