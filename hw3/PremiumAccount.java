import java.math.BigDecimal;

public class PremiumAccount extends Account {
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