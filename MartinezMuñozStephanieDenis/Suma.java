import java.util.Scanner;
class Suma{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int a=sc.nextInt();
        System.out.println("Dame un segundo numero");
        int b=sc.nextInt();
    System.out.println(Suma(a,b));
    }

    public static int Suma(int a, int b) {
        return a + b;
    }
        
    }