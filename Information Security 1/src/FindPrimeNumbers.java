import java.math.BigInteger;

public class FindPrimeNumbers {
    public FindPrimeNumbers(){

    }

    private boolean isPrimeNumberCal(int num){
        boolean condition = true;
        for(int i = num;i<num/2;i--){
            if(num%i==0){
                condition = false;
                break;
            }
        }
        return condition;
    }

    public boolean isPrimeNumber(int num){
        if(num==1){
            return true;
        }else{
            return isPrimeNumberCal(num);
        }
    }

    public boolean isBigPrimeNumber(BigInteger num1,BigInteger num2){
        BigInteger value =  num1.gcd(num2);
        BigInteger one = new BigInteger("1");
        if(value.equals(one)){
            return true;
        }else {
            return false;
        }
    }
}
