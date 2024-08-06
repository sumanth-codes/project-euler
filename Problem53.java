// Problem: https://projecteuler.net/problem=53

public class Problem53{
    public static long nCr(int n, int r){
        if(n-r < r) r = n-r;
        long product = 1;
        for(int i=n;i>n-r;i--){
            product *= i;
        }
        while(r>0){
            product /= r--;
        }
        return product;
    }
    public static void main(String[] args) {
        // when r = Math.floor(n/2), nCr is max
        // if n is even, r = n/2
        //    n is odd, r = n-1/2
        // for(int n = 23; n<=100; n+=2){}

        // for(int n = 24; n<=100; n+=2){}
        System.out.println(nCr(23, 11));
        System.out.println(nCr(23, 12));
        
    }
}