package gameManagerProject.concretes;

import gameManagerProject.abstracts.CampaignService;
import gameManagerProject.entities.Campaign;

public class CampaignManager implements CampaignService
{
	public void add(Campaign campaign)
	{
		System.out.println(campaign.getCampaignName() + " Kampanyas� Eklendi");
		System.out.println(
				campaign.getCampaignName() + " Kampanyas�ndan %" 
				+ campaign.getDiscountAmount() + " �ndirim ile " 
				+ campaign.getCampaignDuration() + " G�n boyunca Yararlanabilirsiniz"
				);
	}
	
	public void update(Campaign campaign)
	{
		System.out.println(campaign.getCampaignName() + " Kampanyas� G�ncellendi");
		System.out.println(
				campaign.getCampaignName() + " Kampanyas�ndan %" 
				+ campaign.getDiscountAmount() + " �ndirim ile " 
				+ campaign.getCampaignDuration() + " G�n boyunca Yararlanabilirsiniz"
				);
	}
	
	public void remove(Campaign campaign)
	{
		System.out.println(campaign.getCampaignName() + " Kampanyas� Silindi");
	}
}
