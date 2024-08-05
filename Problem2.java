// Problem: https://projecteuler.net/problem=2

// Fibonacci series: 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
// By observation we can say the terms of the form (3k - 1) are only the even numbers in the series, k = 1,2,3,...

public class Problem2{
    static long[][] matrixMul(long[][] a, long[][] b){
        long [][] result = new long[2][2];
        result[0][0] = a[0][0] * b[0][0] + a[0][1] * b[1][0];
        result[0][1] = a[0][0] * b[0][1] + a[0][1] * b[1][1];
        result[1][0] = a[1][0] * b[0][0] + a[1][1] * b[1][0];
        result[1][1] = a[1][0] * b[0][1] + a[1][1] * b[1][1];
        return result;
    }
    public static void main(String[] args) {
        long[][] matrix = {{1,1},{1,0}};
        long[][] matrixSquared = matrixMul(matrix, matrix);
        long[][] matrixCubed = matrixMul(matrixSquared, matrix);
        long[][] result = matrixSquared;
        long sum = 0;
        while(result[0][0] < 4_000_000){
            sum += result[0][0];
            result = matrixMul(result, matrixCubed);
        }
        System.out.println(sum);
    }
}