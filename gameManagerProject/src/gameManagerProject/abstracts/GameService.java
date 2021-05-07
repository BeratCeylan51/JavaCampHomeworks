package gameManagerProject.abstracts;

import gameManagerProject.entities.Player;

public interface GameService 
{
	void add(Player player);
	
	void update(Player player);
	
	void remove(Player player);
}
