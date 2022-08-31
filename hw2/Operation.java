import java.math.*;

public class Operation {
    private String operationType;
    private BigDecimal amount;
    private java.util.Date time;

    public Operation(String operationType,BigDecimal amount){
        this.operationType=operationType;
        this.amount=amount;
        time=new java.util.Date();
    }

    public String toString(){
        return "Operation type: "+operationType+"\namount: "+amount+"and created on: "+time;
    }
}
