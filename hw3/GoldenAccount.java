import java.math.BigDecimal;

public class GoldenAccount extends Account {
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