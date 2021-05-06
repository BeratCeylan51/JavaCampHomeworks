package interfaceAbstractDemo.abstracts;

import interfaceAbstractDemo.entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) {
		
		System.out.println("Veritaban�na eklendi : " + customer.getFirstName());
		
	}

}
