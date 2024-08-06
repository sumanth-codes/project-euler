import java.util.ArrayList;

public class Problem50{

    // prime numbers using sieve of eratosthenes
    public static ArrayList<Integer> primeNumbers(int n){
        ArrayList<Integer> primeList = new ArrayList<>();
        boolean primes[] = new boolean[n+1];
        
        primes[0] = primes[1] = false;
        for(int i=2;i<=n;i++)
            primes[i] = true;
        
        for(int i=2;i*i<=n;i++){
            if(primes[i]){
                for(int j=i*i;j<=n;j+=i)
                    primes[j] = false;
            }
        }

        for(int i=2;i<=n;i++){
            if(primes[i])
                primeList.add(i);
        }
        return primeList;
    }

    public static void main(String[] args) {
        final int mil = 1000000;
        ArrayList<Integer> primesTillMillion = primeNumbers(mil);
        
        
    }
}