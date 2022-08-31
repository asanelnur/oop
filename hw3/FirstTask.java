import java.math.BigDecimal;

public class FirstTask {
    public static void main(String[] args) {
        Client client=new Client("Donny","+777777777777","001226678543");

        Account regAcc = new RegularAccount("4400********1110", client, new BigDecimal("10000.00"));
		Account premAcc = new PremiumAccount("4400********1110", client, new BigDecimal("10000.00"));
		Account goldenAcc = new GoldenAccount("4400********1110", client, new BigDecimal("10000.00"));

        ATM<RegularAccount> atm1=new ATM<>();
        atm1.withdraw(regAcc,new BigDecimal("100000"));

        ATM<RegularAccount> atm2=new ATM<>();
        atm2.deposit(premAcc,new BigDecimal("5000"));

        ATM<RegularAccount> atm3=new ATM<>();
        atm3.withdraw(goldenAcc,new BigDecimal("200000"));

        //ATM<Client> atm3=new ATM<>(); -> error: incompatible types: cannot infer type arguments for ATM<>;
        //It helps to enable errors to be detected at compile time rather at runtime.
    }
}

abstract class Account {
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

class ATM<T extends Account>{
    public void withdraw(Account T,BigDecimal amount){
        T.credit(amount);
    }
    public void deposit(Account T,BigDecimal amount){
        T.debit(amount);
    }
}

class Client {
    private String name;
	private String phone;
	private String ID;

	public Client(String name, String phone, String ID) {
		this.name = name;
		this.phone = phone;
		this.ID = ID;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}
    
	public String getId() {
		return ID;
	}
}


class GoldenAccount extends Account {
	public GoldenAccount(String number, Client owner, BigDecimal balance) {
		super(number, owner, balance);
	}

	@Override
	public void credit(BigDecimal amount){
		balance = balance.add(amount);
	}
	@Override
	public void debit(BigDecimal amount) {
		BigDecimal newBalance = balance.subtract(amount);

		if (newBalance.compareTo(BigDecimal.ZERO) < 0) {
			throw new IllegalArgumentException("balance can not be negative");
		}

		newBalance = newBalance.add(new BigDecimal("100.00"));

		balance = newBalance;
	}
}

class PremiumAccount extends Account {
	public PremiumAccount(String number, Client owner, BigDecimal balance) {
		super(number, owner, balance);
	}

	@Override
	public void credit(BigDecimal amount){
		balance = balance.add(amount);
	}

	@Override
	public void debit(BigDecimal amount) {
		BigDecimal newBalance = balance.subtract(amount);

		if (newBalance.compareTo(BigDecimal.ZERO) < 0) {
			throw new IllegalArgumentException("balance can not be negative");
		}

		newBalance = newBalance.add(new BigDecimal("150.00"));

		balance = newBalance;
	}
}

class RegularAccount extends Account {
	public RegularAccount(String number,Client owner, BigDecimal balance) {
		super(number, owner, balance);
	}

    @Override
	public void credit(BigDecimal amount){
		balance = balance.add(amount);
	}

	@Override
	public void debit(BigDecimal amount) {
		BigDecimal newBalance = balance.subtract(amount);

		if (newBalance.compareTo(BigDecimal.ZERO) < 0) {
			throw new IllegalArgumentException("balance can not be negative");
		}

		newBalance = newBalance.subtract(new BigDecimal("30.00"));

		if (newBalance.compareTo(BigDecimal.ZERO) < 0) {
			throw new IllegalArgumentException("balance can not be negative");
		}

		balance = newBalance;
	}
}