import java.util.Scanner;

class MultiplicacionF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el primer numero: ");
        double a = sc.nextDouble();
        System.out.println("Ingresa el segundo numero: ");
        double b = sc.nextDouble();
        System.out.println("El resultado es: "+multiplicar(a,b));
    }
        public static double multiplicar(double a, double b){
            return a*b;

        }
    
}