// Problem: https://projecteuler.net/problem=25

import java.math.BigInteger;

public class Problem25{
    static BigInteger[][] matrixMultiply(BigInteger[][] a, BigInteger[][] b){
        BigInteger[][] product = new BigInteger[2][2];
        product[0][0] = (a[0][0].multiply(b[0][0])).add(a[0][1].multiply(b[1][0]));
        product[0][1] = (a[0][0].multiply(b[0][1])).add(a[0][1].multiply(b[1][1]));
        product[1][0] = (a[1][0].multiply(b[0][0])).add(a[1][1].multiply(b[1][0]));
        product[1][1] = (a[1][0].multiply(b[0][1])).add(a[1][1].multiply(b[1][1]));
        return product;
    }
    public static void main(String[] args) {
        final BigInteger[][] matrix = {{BigInteger.ONE, BigInteger.ONE}, {BigInteger.ONE, BigInteger.ZERO}};
        BigInteger[][] result = matrix;
        int digits = 0;
        int count = 1;
        while(digits < 1000){
            result = matrixMultiply(result, matrix);
            digits = result[0][1].toString().length();
            count++;
        }
        System.out.println(count);
    }
}