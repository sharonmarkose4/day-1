
public class InnerClassesDemo {
	public static void main(String[] args) {
		Account[] accounts=new Account[10];
//		for (int i = 0; i < accounts.length; i++) {
//			Account account=new Account(i);
//			accounts[i]=account;
//		}
		
	}

}
class Account{
	private int number;
//	private Address address;//one address
	private Address[] addresses;//multiple
	public Account() {
		this.addresses = new Address[3];
	}
	
	class Address{
		private String streetName;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Address[] getAddress() {
		return addresses;
	}
	public void setAddress(Address[] address) {
		this.addresses = address;
	}

}
