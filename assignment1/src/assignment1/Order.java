package assignment1;

public class Order {
	private String item;
	//private String address;
	private STATUS status;
	public String getItem() {
		return item;
	}
	Order(String item){
		this.item=item;
	}
	public void setItem(String item) {
		this.item = item;
	}
//	public String getAddress() {
//		return address;
//	}
//	public void setAddress(String address) {
//		this.address = address;
//	}
	public STATUS getStatus() {
		return status;
	}
	public void setStatus(STATUS status) {
		this.status = status;
	}
	

}
