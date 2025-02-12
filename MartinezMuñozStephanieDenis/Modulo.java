import java.util.Scanner;
class Modulo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int a=sc.nextInt();
        System.out.println("Dame un segundo numero");
        int b=sc.nextInt();
    System.out.println(Modulo(a,b));
    }

    public static int Modulo(int a, int b) {
        return a % b;
    }
}