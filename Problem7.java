// Problem: https://projecteuler.net/problem=7

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem7{
    static List<Integer> primeNumbers = new ArrayList<>(Arrays.asList(2));
    static boolean isPrime(int num){
        for(Integer i : primeNumbers){
            if(num % i == 0)
                return false;
            if((num / i) < i)
                return true;
        }
        return true;
    }
    static int nthPrime(int n){
        int count = 1; // since we already have 2 in primeNumbers list
        int i = 3;
        while(count < n){
            if(isPrime(i)){
                primeNumbers.add(i);
                count++;
            }
            i++;
        }
        return primeNumbers.get(n-1);
    }
    public static void main(String[] args) {
        final int N = 10001;
        int result = nthPrime(N);
        System.out.println(result);
    }
}