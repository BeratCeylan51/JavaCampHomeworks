package gameManagerProject.concretes;

import gameManagerProject.abstracts.GameService;
import gameManagerProject.abstracts.PlayerCheckService;
import gameManagerProject.entities.Player;

public class PlayerManager implements GameService 
{
	private PlayerCheckService playerCheckService;
	
	public PlayerManager(PlayerCheckService playerCheckService) {
		super();
		this.playerCheckService = playerCheckService;
	}

	public void add(Player player)
	{
		if(playerCheckService.checkIfRealPerson(player))
		{
			System.out.println(player.getFirstName() + " " + player.getLastName() + " Kullanýcýsý Eklendi");
		}
		else
		{
			System.out.println("Kullanýcý Bilgileri Hatalý");
		}
	}
	
	public void update(Player player)
	{
		if(playerCheckService.checkIfRealPerson(player))
		{
			System.out.println(player.getFirstName() + " " + player.getLastName() + " Kullanýcýsý Güncellendi");
		}
		else
		{
			System.out.println("Kullanýcý Bilgileri Hatalý");
		}
	}
	
	public void remove(Player player)
	{
		if(playerCheckService.checkIfRealPerson(player))
		{
			System.out.println(player.getFirstName() + " " + player.getLastName() + " Kullanýcýsý Silindi");
		}
		else
		{
			System.out.println("Kullanýcý Bilgileri Hatalý");
		}
	}
}
