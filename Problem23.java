// Problem: https://projecteuler.net/problem=23

import java.util.ArrayList;

class AbundantNumbers{
    public int number;

    public AbundantNumbers(int n) {
        number = n;
    }

    private ArrayList<Integer> factorsArray(){
        ArrayList<Integer> factors = new ArrayList<>();
        factors.add(1);

        for(int i=2; i<Math.sqrt(number);i++){
            if(number%i == 0){
                factors.add(number/i);
                factors.add(i);
            }
        }
        return factors;
    }

    private int sumFactors(){
        ArrayList<Integer> factors = factorsArray();
        int sum = 0;
        for(int i=0;i<factors.size();i++){
            sum += factors.get(i);
        }
        return sum;
    }
    public boolean isAbundant(){
        int sum = sumFactors();
        return sum > number;
    }
}
public class Problem23{

    public static void main(String[] args) {
        AbundantNumbers obj = new AbundantNumbers(28);
        System.out.println(obj.isAbundant());
    }
}