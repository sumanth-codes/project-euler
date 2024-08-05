// Problem: https://projecteuler.net/problem=10

import java.util.ArrayList;
import java.util.List;

public class Problem10{
    public static boolean[] primesBoolean(int n){
        boolean[] primes = new boolean[n+1];
        primes[0] = primes[1] = false;

        for(int i=2;i<=n;i++)
            primes[i] = true;

        for(int i=2;i*i<=n;i++)
            if(primes[i])
                for(int j=i*i;j<=n;j+=i)
                    primes[j] = false;
        
        return primes;
    }

    public static List<Integer> primesList(int n){
        List<Integer> primeNumbers = new ArrayList<>();
        boolean array[] = primesBoolean(n);
        for(int i=2;i<=n;i++)
            if(array[i])
                primeNumbers.add(i);
        return primeNumbers;
    }
    public static void main(String[] args) {
        long sum = 0;
        final int twoMillion = 2000000;
        List<Integer> primeNumbers = primesList(twoMillion);
        for(Integer i : primeNumbers)
            sum += i;

        System.out.println(sum);
    }
}