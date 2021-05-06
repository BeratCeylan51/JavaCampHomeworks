package interfaceAbstractDemo.concretes;

import interfaceAbstractDemo.abstracts.BaseCustomerManager;
import interfaceAbstractDemo.abstracts.CustomerCheckService;
import interfaceAbstractDemo.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) { // initialize
		this.customerCheckService = customerCheckService;
	}
	
	public void save(Customer customer)
	{
		if(this.customerCheckService.checkIfRealPerson(customer))
		{
			super.save(customer);
		}
		else
		{
			System.out.println("Bilgiler Uyuþmuyor Hatalý Bilgi Girdiniz");
		}
		
	}
}
