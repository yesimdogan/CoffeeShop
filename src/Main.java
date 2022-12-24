import Adapters.MernisServiceAdapter;
import Concrete.BaseCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());		
			
		Customer customer = new Customer(1, "Yeşim", "Doğan", 2000, "Enter your Nationality Number");
		baseCustomerManager.Save(customer);
		
		
	}
}

