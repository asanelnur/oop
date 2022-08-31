import java.math.BigDecimal;

public class PremiumAccount extends Account {
	public PremiumAccount(String number, String status, Client owner, BigDecimal balance) {
		super(number, status, owner, balance);
	}

	@Override
	public void credit(BigDecimal amount){
		balance = balance.add(amount);
		operations.add(new Operation("Credit",amount));
	}

	@Override
	public void debit(BigDecimal amount) {
		BigDecimal newBalance = balance.subtract(amount);

		if (newBalance.compareTo(BigDecimal.ZERO) < 0) {
			throw new IllegalArgumentException("balance can not be negative");
		}

		newBalance = newBalance.add(new BigDecimal("150.00"));

		balance = newBalance;

		operations.add(new Operation("Debit",amount));
	}


	@Override
	public void paymentForService() {
		balance = balance.subtract(new BigDecimal("4000.00"));
	}

	@Override
	protected String balanceBuilder() {
		return "@@@@ Your premium account balance is " + balance.toString() + "@@@@";
	}

	@Override
	public void getStatement() {
		StringBuilder s = new StringBuilder();
		for (Operation operation : operations) {
			if (operation == null) {
				break;
			}
			s.append(operation).append("\n");
		}
		System.out.println(s);
	}
}