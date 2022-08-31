import java.math.BigDecimal;
import java.math.*;
import java.util.ArrayList;

public class LargeNumbers {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<Number>();
        list.add(45555);
        list.add(3445.53);

        list.add(new BigInteger("343"));
        list.add(new BigDecimal("2.09090909098909093434333"));

        System.out.print("The latgest number is "+getLargestNumber(list));

    }
    public static Number getLargestNumber(ArrayList<Number> list){
        if(list==null || list.size()==0){
            return null;
        }

        Number number=list.get(0);
        for(int i=1;i<list.size();i++){
            if(number.doubleValue()<list.get(i).doubleValue()){
                number=list.get(i);
            }
        }

        return number;
    }
}

/* An Interface is a classlike construct that contains only constants and abstract methods.
   In many ways, an interface is similar to an abstract class, but the intent of an interface is to specify
common behavior for objects.

public interface InterFaceName{
    constant declarations;
    abstract method signatures;
}

Example:
public interface Edible{
    //Describe how to eat?
    public abstract String howToEat();
}
*/