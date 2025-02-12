import java.util.Scanner;
class Division{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int a=sc.nextInt();
        System.out.println("Dame un segundo numero");
        int b=sc.nextInt();
    System.out.println(Division(a,b));
    }

    public static int Division(int a, int b) {
        return a / b;
    }
}   