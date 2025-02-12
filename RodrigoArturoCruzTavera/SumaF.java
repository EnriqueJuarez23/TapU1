import java.util.Scanner;

class SumaF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el primer numero: ");
        double a = sc.nextDouble();
        System.out.println("Ingresa el segundo numero: ");
        double b = sc.nextDouble();
        System.out.println("El resultado es: "+sumar(a,b));
        public static int sumar(int a, int b){
            return a+b;

        }
    }
}