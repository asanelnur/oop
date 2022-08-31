import java.math.BigDecimal;

public class ATM implements Device{
    @Override
    public void withdraw(Account account,BigDecimal amount){
        account.credit(amount);
    }
    @Override
    public void deposit(Account account,BigDecimal amount){
        account.debit(amount);
    }
    @Override
    public void getBalance(){
        getBalance();
    }
    @Override
    public void getStatement(){
        getStatement();
    }
}
