
public class BankAccount {
	private String id;
	private double fee = 0;
	private double balance = 0;
	private int transactions = 0;
	
	/*
	 * @Constructor: id
	 * */
	public BankAccount(String id)
	{
		this.id = id;
	}
	
	/*
	 * @Method will be returned of value.
	 * @Getter: return balanced, id, transactions
	 * */
	public double getBalance()
	{
		return this.balance;
	}
	
	public String getID()
	{
		return this.id;
	}
	
	public double getTransactions()
	{
		/*
		 * @Formula by geometric series
		 * to find result of n + 2n + 3n + ... Cn
		 * */	
		double sumFee = this.sumTransactions();
		double money = this.getBalance() - sumFee;
		
		if(money > 0) {
			this.balance -= sumFee;
			System.out.println("Your orders are successfully.");
			System.out.println("Your transaction is " + sumFee + " bath.");
			System.out.println("Your balance contains " + this.getBalance() + " bath. ");
			return 1;
		}
		
		System.out.println("Your orders aren't success.");
		return 0;
	}
	
	/*
	 * @Setter: Add money
	 * @Transactions: Add one time 
	 * */
	public void deposit(double amount)
	{
		if(amount > 0 && amount <= 500) {
			this.balance += amount;
			++this.transactions;
		} else {
			System.out.println("Your order not successfully");
		}
	}
	
	/*
	 * @Setter: Withdraw money
	 * @Transactions: Add one time 
	 * */
	public void withdraw(double amount)
	{
		if(this.balance - amount > 0) {
			this.balance -= amount;
			++this.transactions;
		} else {
			System.out.println("Your money not enough");
		}
	}
	
	/*
	 * @Setter: save value of Fee
	 * */
	public void transactionFee(double fee)
	{
		this.fee = fee;
	}
	
	/*
	 * @Private Method
	 * */
	private double sumTransactions()
	{
		return (double) ((this.transactions / 2) * ((2 * this.fee) + (this.transactions - 1) * this.fee));
	}
	
	public static void main(String[] args)
	{
		BankAccount savings = new BankAccount("Kopkap");
		savings.transactionFee(10.00);
		
		savings.deposit(10.00);
		savings.deposit(50.00);
		savings.deposit(10.00);
		savings.deposit(70.00);
		
		System.out.println("Your balance is " + savings.getBalance());
		System.out.println(savings.getTransactions());
	}
	
}
