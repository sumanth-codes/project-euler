// Problem: https://projecteuler.net/problem=9

/**
 * Problem: https://projecteuler.net/problem=9
 * 
 * Let, a = x^2 - y^2
 *      b = 2xy
 *      c = x^2 + y^2
 *    where, x>y>0
 *  Hence, a + b + c = 1000
 *         2x^2 + 2xy = 1000
 *         x^2 + xy = 500
 *         y = (500 - x^2)/x, where y should be an integer
 *       observations:
 *              x > y, so x^2 > xy
 *              Hence, we can say x^2 > 250, which implies x >= 16
 *                     And also x^2 < 500, which implies x < 23
 *              As, y < x, so, 0 < y < 16
 */
public class Problem9{
    public static void main(String[] args) {
        for(int x = 16; x<23;x++){
            if((500 - x*x)%x == 0){ // check if y is integer
                int y = (500 - x*x)/x;
                // calculate product abc
                // abc = (x^2 - y^2)2xy(x^2 + y^2)
                // abc = (x^4 - y^4)2xy
                System.out.println((x*x*x*x - y*y*y*y)*2*x*y);
                break;
            }
        }
    }
}