import java.util.Scanner;
public class Methodoverloading {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("enter the three number.");
        int a= S.nextInt();
        int b= S.nextInt();
        int c= S.nextInt();
        System.out.println("sum of two numbers "+ add(a, b));
        System.out.println("sum of three numbers "+ add(a, b ,c));
    }
    public static int add(int a, int b){
        return a+b;
    }
    public static int add(int a, int b, int c){
        return a+b+c;
    }
    
}
