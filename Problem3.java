// Problem: https://projecteuler.net/problem=9

import java.util.ArrayList;
import java.util.ListIterator;

public class Problem3{
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

    public static ArrayList<Integer> primesList(int n){
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        boolean array[] = primesBoolean(n);
        for(int i=2;i<=n;i++)
            if(array[i])
                primeNumbers.add(i);
        return primeNumbers;
    }
    public static void main(String[] args) {
        final long n = 600851475143L;
        ArrayList<Integer> primesTillSqrtN = primesList((int) Math.sqrt(n));
        ListIterator<Integer> itr = primesTillSqrtN.listIterator(primesTillSqrtN.size());
        long maxPrime = 0;
        while(itr.hasPrevious()){
            int prime = itr.previous();
            if(n%prime == 0){
                maxPrime = prime;
                break;
            }
        }
        System.out.println(maxPrime);
    }
}