import java.math.BigDecimal;
import java.util.ArrayList;

public abstract class Account {
	protected String number;
	protected String status;
	protected Client ownerName;
	protected BigDecimal balance;
	protected ArrayList<Operation> operations=new ArrayList<Operation>();

	public Account(String number, String status, Client owner, BigDecimal balance){
		this.number = number;
		if (status == null || !"1".equals(status) && !"2".equals(status)) {
			throw new IllegalArgumentException("Invalid status!");
		}
		this.status = status;
		this.ownerName = new Client(owner.getName(), owner.getPhone(), owner.getId());
		this.balance = balance;
	}

    public String getNumber() {
		return number;
	}

    public String getStatus() {
		return status;
	}

	public Client getOwner() {
		System.out.println("Inside bankaccount " + ownerName.getName());
		return new Client(ownerName.getName(), ownerName.getPhone(), ownerName.getId());
	}

	public void setStatus(String status) {
		if (status == null || !"1".equals(status) && !"2".equals(status)) {
			throw new IllegalArgumentException("Invalid status!");
		}
		this.status = status;
	}

	public String getBalance() {
		return balanceBuilder();
	}

	protected abstract String balanceBuilder();

	public abstract void credit(BigDecimal amount);

	public abstract void debit(BigDecimal amount);

	public abstract void paymentForService();

	public abstract void getStatement();
	
}


