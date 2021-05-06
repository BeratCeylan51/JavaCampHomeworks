package interfaceAbstractDemo.adapters;

import java.rmi.RemoteException;

import interfaceAbstractDemo.abstracts.CustomerCheckService;
import interfaceAbstractDemo.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) 
	{
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try 
		{
			return client.TCKimlikNoDogrula(
			Long.parseLong(customer.getNationalityId()),
			customer.getFirstName().toUpperCase(),
			customer.getLastName().toUpperCase(),
			customer.getDateOfBirth().getYear()
			);
		} 
		
		catch (RemoteException e) 
		{
			e.printStackTrace();
		}
		
		return false;
	}

}
