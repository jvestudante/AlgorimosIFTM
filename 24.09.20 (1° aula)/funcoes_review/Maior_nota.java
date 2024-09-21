import java.util.Scanner;
public class Maior_nota{
    static Scanner s = new Scanner(System.in);
    public static double nota1(double x){
        System.out.println("Por favor digite a primeira nota:");
        x = s.nextDouble();
        return x;
    }
    public static double nota2(double y){
        System.out.println("Por favor digite a segunda nota:");
        y = s.nextDouble();
        return y;
    }
    public static double retorno(double x, double y){
        if (x>y){
            return x;
        }else {
            return y;
        }
    }
    public static void main(String[] args){
        double x = 0;
        double y = 0;
        x = nota1(x);
        y = nota2(y);
        System.out.println("A maior nota é "+retorno(x,y)+".");
    }
}