
import java.util.HashMap;

// Problem: https://projecteuler.net/problem=39

/** 
 * Let a = x^2 - y^2
 *     b = 2xy
 *     c = x^2 + y^2, where x > y > 0
 * 
 * so, p = a+b+c
 *     p = 2x^2 + 2xy
 *     p/2 = x^2 + xy
 *     as, x^2 > xy
 * Hence, x^2 > p/4 and xy < p/4
 * 
 * */
public class Problem39{
    static HashMap<Integer, Integer> perimeterSolutions = new HashMap<>();
    static void  numSolutions(int perimeter){
        final int halfPerimeter = perimeter/2;
        int x = (int) (Math.sqrt(perimeter) / 2);
        x++;
        // x^2 should not exceed p/2
        // x^2 < p/2
        for(;x*x < halfPerimeter; x++){
            System.out.println(x);
            if((halfPerimeter - x*x)%x == 0){
                // found the one
                int y = (halfPerimeter - x*x)/x;
                int a = x*x - y*y;
                int b = 2*x*y;
                int c = x*x + y*y;
                if((a+b+c) == perimeter){
                    System.out.println("perimeter = "+perimeter + ", "+"a = "+a+", b = "+b+", c = "+c);
                }
            }
        }
    }
    public static void main(String[] args){
        // all the possible values of perimeter <= 1000
        // for(int perimeter = 2;perimeter<=1000;perimeter+=2){
            
            numSolutions(120);
        // }
    }
}