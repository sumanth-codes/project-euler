// Problem: https://projecteuler.net/problem=5

/**
 * If a number is divisible by, say 16 - it is obviously divisible by 8,4,2,1
 */
public class Problem5{
    public static boolean[] primesTill(int n){
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
    public static void main(String[] args) {
        final int n = 20;
        boolean[] primes = primesTill(n);
        int result = 1;
        for(int i=2;i<primes.length;i++){
            if(primes[i]){
                double maxOccur = Math.log10(n) / Math.log10(i);
                result *= Math.pow(i, (int) maxOccur);
            }
        }
        System.out.println(result);
    }
}