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
			System.out.println(player.getFirstName() + " " + player.getLastName() + " Kullan�c�s� Eklendi");
		}
		else
		{
			System.out.println("Kullan�c� Bilgileri Hatal�");
		}
	}
	
	public void update(Player player)
	{
		if(playerCheckService.checkIfRealPerson(player))
		{
			System.out.println(player.getFirstName() + " " + player.getLastName() + " Kullan�c�s� G�ncellendi");
		}
		else
		{
			System.out.println("Kullan�c� Bilgileri Hatal�");
		}
	}
	
	public void remove(Player player)
	{
		if(playerCheckService.checkIfRealPerson(player))
		{
			System.out.println(player.getFirstName() + " " + player.getLastName() + " Kullan�c�s� Silindi");
		}
		else
		{
			System.out.println("Kullan�c� Bilgileri Hatal�");
		}
	}
}
