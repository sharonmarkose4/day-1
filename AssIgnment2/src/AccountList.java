import java.util.ArrayList;
import java.util.List;

public class AccountList {
	public static void main(String[] args) {
		createArrayAccount();	
	}
	private static void createArrayAccount() {
		Account[] accounts=new Account[5];
		List<Account> listAccounts=new ArrayList<Account>();
		for (int i = 0; i < 5; i++) {
			Account account=new Account("Ram"+i);
			account.setBalance(100.0f);
			accounts[i]=account;
			listAccounts.add(accounts[i]);
			System.out.println(accounts[i]);
		}
		System.out.println(listAccounts);

		
	}	
}
	
//	
////		List<Account> listAccounts=new ArrayList<Account>();
//		for (int i = 0; i < 10; i++) {
////			Account listaccount=new Account("Ram"+i);
////			accounts[i]=account;
////			listAccounts.add(accounts[i]);
//		}
//		
//}	
//}
//
