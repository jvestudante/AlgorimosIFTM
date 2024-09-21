import java.util.Scanner;
public class Media_notas{
    static Scanner s = new Scanner(System.in);
    public static double nota1(double x){
        System.out.println("Por favor digite a primeira nota:");
        return s.nextDouble();
    }
    public static double nota2(double y){
        System.out.println("Por favor digite a segunda nota:");
        return s.nextDouble();
    }
    public static double media(double x, double y){
        return (x+y)/2;
    }
    public static void main(String[] args){
        double x = 0;
        double y = 0;
        x = nota1(x);
        y = nota2(y);
        System.out.println("A maior nota é "+media(x,y)+".");
    }
}