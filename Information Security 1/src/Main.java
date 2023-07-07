import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        FindPrimeNumbers findPrimeNumbers = new FindPrimeNumbers();
        FindCoPrimes findCoPrimes = new FindCoPrimes();
        BigInteger num1 = new BigInteger("23");
        BigInteger num2 = new BigInteger("13");

        System.out.println(findCoPrimes.findCoPrimes(num1)+" Count is " );
    }
}