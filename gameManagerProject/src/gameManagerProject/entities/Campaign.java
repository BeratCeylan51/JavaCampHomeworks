package gameManagerProject.entities;

import gameManagerProject.abstracts.Entity;

public class Campaign implements Entity {

	private int id;
	private String campaignName;
	private int discountAmount;
	private int campaignDuration;
	
	public Campaign()
	{
		
	}

	public Campaign(int id, String campaignName, int discountAmount, int campaignDuration) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.discountAmount = discountAmount;
		this.campaignDuration = campaignDuration;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public int getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(int discountAmount) {
		this.discountAmount = discountAmount;
	}

	public int getCampaignDuration() {
		return campaignDuration;
	}

	public void setCampaignDuration(int campaignDuration) {
		this.campaignDuration = campaignDuration;
	}
	
	
	
}
