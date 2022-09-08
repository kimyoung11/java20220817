package ch10.lecture;



class Account{
	private long balance;
	
	public Account() {
		
	}
	
	public long getbalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	public void withdraw(int money) throws BalanceInsufficientException{
		
		if(money > balance) {
			throw new BalanceInsufficientException("잔고부족" + (money-balance)+"모자람");
		}
		balance -= money;
	}
}

class BalanceInsufficientException extends Exception{
	public BalanceInsufficientException() {
		
	}
	public BalanceInsufficientException(String str) {
		super(str);
	}
}

public class AccountExample {
	public static void main(String[] args) {
		
		Account account = new Account();
		account.deposit(10000);
		System.out.println("예금액" + account.getbalance());
		try {
			account.withdraw(30000);
		}catch(BalanceInsufficientException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
	}

}
