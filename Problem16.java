// Problem: https://projecteuler.net/problem=16

// import java.math.BigInteger;
import java.util.ArrayList;

public class Problem16{
    static void multiply2(ArrayList<Integer> arr){
        int carry = 0;
        for(int j = 0; j < arr.size(); j++){
            int temp = 2*arr.get(j) + carry;
            carry = temp/10;
            arr.set(j, temp%10);
        }
        if(carry%2 == 1)
        arr.add(carry);
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        for(int i=0;i<1000;i++){
            multiply2(arr);
        }

        int sum = 0;
        for(int idx = 0; idx < arr.size();idx++){
            sum += arr.get(idx);
        }
        System.out.println(sum);

        /* 
        The straight forward solution: 

        BigInteger number = new BigInteger("2");
        number = number.pow(1000);
        String numStr = number.toString();
        int sum = 0;

        for(int i=0;i<numStr.length();i++){
            sum += Character.getNumericValue(numStr.charAt(i));
        }
        System.out.println(sum);        
        */
    }
}