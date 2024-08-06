import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Problem42{
    static int sumLetters(String word){
        int sum = 0;
        for(int i = 0;i<word.length();i++){
            sum += (int) (word.charAt(i)) - 64;
        }
        return sum;
    }
    static boolean nExists(int sum){
        int d = (int) (Math.sqrt(1+8*sum));
        return d*d == sum;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String line = Files.readString(Paths.get("resources/0042_words.txt"));
        String[] words = line.split(",");
        int count = 0;
        for(String word : words){
            int sum = sumLetters(word);
            
        }
        
    }
}