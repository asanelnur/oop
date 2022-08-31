import java.math.BigDecimal;

public class TestFirstTask {
    public static void main(String[] args) {
        Client client=new Client("Donny","+777777777777","001226678543");

        Account regAcc = new RegularAccount("4400********1110", "1", client, new BigDecimal("10000.00"));
		Account premAcc = new PremiumAccount("4400********1110", "1", client, new BigDecimal("10000.00"));
		Account goldenAcc = new GoldenAccount("4400********1110", "1", client, new BigDecimal("10000.00"));

        Device device1=new ATM();
        device1.withdraw(regAcc,new BigDecimal("100000"));
        System.out.println(regAcc.getBalance());

        device1.deposit(premAcc,new BigDecimal("5000"));
        System.out.println(premAcc.getBalance());

        Device device2=new Smartphone();
        device2.withdraw(goldenAcc,new BigDecimal("200000"));
        System.out.println(goldenAcc.getBalance());
    }
}
