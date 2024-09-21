package recursividade;
import java.util.Scanner;
public class Fibonacci{
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
    }
    public static int fibonacci(int n){
        if (n==0){
            return 0;
        }
        else if (n==1){
            return 1;
        }else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
}