import java.math.BigDecimal;

public abstract class Account {
	protected String accountNumber;
	protected Client ownerName;
	protected BigDecimal balance;

	public Account(String accountNumber, Client owner, BigDecimal balance){
		this.accountNumber = accountNumber;
		this.ownerName = new Client(owner.getName(), owner.getPhone(), owner.getId());
		this.balance = balance;
	}
    
	public abstract void credit(BigDecimal amount);

	public abstract void debit(BigDecimal amount);	
}
