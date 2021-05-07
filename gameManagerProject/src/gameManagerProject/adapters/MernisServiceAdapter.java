package gameManagerProject.adapters;

import java.rmi.RemoteException;

import gameManagerProject.abstracts.PlayerCheckService;
import gameManagerProject.entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PlayerCheckService
{

	@Override
	public boolean checkIfRealPerson(Player player) 
	{
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try 
		{
			return client.TCKimlikNoDogrula(
					Long.parseLong(player.getNationalityId()) , 
					player.getFirstName().toUpperCase(), 
					player.getLastName().toUpperCase(), 
					player.getDateOfBirth().getYear()
					);
			
		} catch (RemoteException e) 
		{
			e.printStackTrace();
		}
		
		return false;
	}
	
}
