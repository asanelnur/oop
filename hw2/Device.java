import java.math.BigDecimal;

public interface Device {
    public abstract void withdraw(Account account,BigDecimal amount);
    public abstract void deposit(Account account,BigDecimal amount);
    public abstract void getBalance();
    public abstract void getStatement();
}
