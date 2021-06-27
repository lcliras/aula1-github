package entities;

public class Conta {
	private int cta;
	private String holder;
	private double balance;
	
	public Conta(int cta,  String holder) {
		this.cta = cta;
		this.holder = holder;
	}
	
	public Conta(int cta, String holder, double initialDeposit) {
		this.cta = cta;
		this.holder = holder;
		deposit(initialDeposit);
	}
			
	public int getCta() {
		return cta;
	}
	
	public String getHolder() {
		return holder;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}	
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
		
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}	
	
	public String toString() {
		return "Account data: "
				+ cta
				+ ", Holder: "
				+ holder
				+ ", Balance:  $ "
				+ String.format("%.2f", balance);
	}
	
	
	
}
