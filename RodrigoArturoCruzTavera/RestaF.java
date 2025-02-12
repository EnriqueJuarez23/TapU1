import java.util.Scanner;

class RestaF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el primer numero: ");
        double a = sc.nextDouble();
        System.out.println("Ingresa el segundo numero: ");
        double b = sc.nextDouble();
        System.out.println("El resultado es: "+restar(a,b));
    }
        public static double restar(double a, double b){
            return a-b;

        }
    
}