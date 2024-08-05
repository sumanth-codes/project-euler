// Problem: https://projecteuler.net/problem=4

// 6-digit palindrome will be of kind abccba
// we can factorize it to, abccba = 11(9091*a + 910*b + 100*c) = xy
// where, 99 < x,y < 1000
public class Problem4{
    public static void main(String[] args) {
        // let the number be 'abccba' where a,b,c
        for(int a = 9 ; a>0 ; a--) {
            for(int b = 9; b>=0; b--){
                for(int c = 9; c>=0; c--){
                    int number = 9091*a + 910*b + c*100;
                    // let's consider x = 11*k and y = number/k
                    // we know, 100 <= x <= 999
                    //     hence, 10 <= k <= 90
                    for(int k = 90; k>=10; k--){
                        if(number % k == 0){
                            if((number / k) < 1000){ // as y = number/k should be a 3-digit number
                                System.out.println(number * 11);
                                return;
                            }
                        }
                    }
                }
            }
        }
    }
}