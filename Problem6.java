// Problem: https://projecteuler.net/problem=6

public class Problem6{
    public static void main(String[] args) {
        // the square of sum of first n natural numbers = n^2((n+1)^2)/2
        // the sum of squares of first n natural numbers = n^2(n+1)(2n+1)/6
        // difference between above is = (3n^2 + 2n)(n^2-1)/12
        int n = 100;
        int result = (3*n*n + 2*n)*(n*n - 1)/12;
        System.out.println(result);
    }
}