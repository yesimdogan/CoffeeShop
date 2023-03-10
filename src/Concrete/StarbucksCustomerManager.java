package Concrete;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{

	CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	
	public void Save(Customer customer)
	{
		
		if (customerCheckService.CheckIfRealPerson(customer)) 
		{
			super.Save(customer);
		}
		else 
		{
			System.out.println("Not a valid person!");
		}
		
	}
}
