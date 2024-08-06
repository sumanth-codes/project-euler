// Problem: https://projecteuler.net/problem=12

public class Problem12{
    static int numDivisors(int n){
        if(n==1) return 1;
        int count = 2;
        for(int i=2;i<Math.sqrt(n);i++)
            if(n%i == 0){
                System.out.println(n/i+" "+ i);
                count += 2;
            }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numDivisors(125250));
    }
}