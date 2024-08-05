// Problem: https://projecteuler.net/problem=1

/**
 * the sum of all terms of an A.P(Arithmetic progression) = (a + l)*x/2
 *    where, a - first term
 *           l - last term
 *           x - total number of terms in the progression
 */

public class Problem1{
    static final int N = 1000;
    public static int sumAP(int a){
        int x = (N-1)/a;
        int l = x*a;
        return (a + l)*x/2;
    }
    public static void main(String[] args) {
        int answer = 0;
    
        // numbers divisible by 3
        answer += sumAP(3);

        // numbers divisible by 5
        answer += sumAP(5);

        // numbers divisible by 15
        // 3, 6, 9, 12, 15, ... , 990, ... , 999
        // 5, 10, 15, ... , 990, 995
        // subtract the numbers divisible by 15 from 'sum' because they appear both in 3 and 5's series
        answer -= sumAP(15);

        System.out.println(answer);
    }
}