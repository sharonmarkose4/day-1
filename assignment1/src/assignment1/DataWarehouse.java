package assignment1;

public class DataWarehouse {
	public static void main(String[] args) {
		Customer customer=new Customer("Ramesh");
		//Order order=new Order("Table");
		for(int i=0;i<10;i++) {
			Order order=new Order("Table"+i);
		}
		System.out.println(customer.getName());
		customer.placeOrder();
		//System.out.println(order.getItem());	
	}
}
