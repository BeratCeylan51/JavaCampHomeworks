package gameManagerProject.concretes;

import gameManagerProject.abstracts.CampaignService;
import gameManagerProject.entities.Campaign;

public class CampaignManager implements CampaignService
{
	public void add(Campaign campaign)
	{
		System.out.println(campaign.getCampaignName() + " Kampanyasý Eklendi");
		System.out.println(
				campaign.getCampaignName() + " Kampanyasýndan %" 
				+ campaign.getDiscountAmount() + " Ýndirim ile " 
				+ campaign.getCampaignDuration() + " Gün boyunca Yararlanabilirsiniz"
				);
	}
	
	public void update(Campaign campaign)
	{
		System.out.println(campaign.getCampaignName() + " Kampanyasý Güncellendi");
		System.out.println(
				campaign.getCampaignName() + " Kampanyasýndan %" 
				+ campaign.getDiscountAmount() + " Ýndirim ile " 
				+ campaign.getCampaignDuration() + " Gün boyunca Yararlanabilirsiniz"
				);
	}
	
	public void remove(Campaign campaign)
	{
		System.out.println(campaign.getCampaignName() + " Kampanyasý Silindi");
	}
}
