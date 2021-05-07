package gameManagerProject.abstracts;

import gameManagerProject.entities.Campaign;

public interface CampaignService 
{
	void add(Campaign campaign);
	
	void update(Campaign campaign);
	
	void remove(Campaign campaign);
}
