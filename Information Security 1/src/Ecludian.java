import java.math.BigInteger;

public class Ecludian {
    public Ecludian(){

    }

    public BigInteger getEuclidianGCD(BigInteger num1,BigInteger num2){
        if(num2 == BigInteger.ZERO){
            return num2;
        } else if(num1 == BigInteger.ZERO){
            return num1;
        } else {
            if(num1.compareTo(num2)>0){
                return getEuclidianGCD(num2,num1.mod(num2));
            }else {
                return getEuclidianGCD(num1,num2.mod(num1));
            }
        }
    }
}
