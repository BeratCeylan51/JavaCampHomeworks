package interfaceAbstractDemo;

import java.time.LocalDate;

import interfaceAbstractDemo.abstracts.BaseCustomerManager;
import interfaceAbstractDemo.adapters.MernisServiceAdapter;
//import interfaceAbstractDemo.concretes.NeroCustomerManager;
import interfaceAbstractDemo.concretes.StarbucksCustomerManager;
import interfaceAbstractDemo.entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1, "Berat", "Ceylan", LocalDate.of(2001,10,26), "20456580932"));

	}

}
