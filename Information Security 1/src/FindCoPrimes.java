import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class FindCoPrimes {
    public FindCoPrimes(){

    }

    public List<BigInteger> findCoPrimes(BigInteger num1){

        List<BigInteger> bigIntList = new ArrayList<>();
        FindPrimeNumbers findPrimeNumbers = new FindPrimeNumbers();

        for (BigInteger num2 = new BigInteger("2") ; num1.compareTo(num2)>0;num2 = num2.add(BigInteger.ONE)){
            if(findPrimeNumbers.isBigPrimeNumber(num1,num2)){
                bigIntList.add(num2);
            }

        }

        return bigIntList;
    }
}
