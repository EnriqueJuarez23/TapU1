import java.util.Scanner;
class Ejercicio5 {
    public static void main(String[] args) {
        Scanner op = new Scanner (System.in);
        System.out.println("Ingresa un numero:");
        double a = op.nextDouble();
        System.out.println("Ingresa un numero:");
        double b = op.nextDouble();
if(a==0){
System.out.println("El residuo es 0");
}
        System.out.println("-----------------------------------");
        System.out.println(+a+"%"+b+ "="+ modular(a, b));
    }
    public static double modular(double a, double b){
        return a%b;
    }
}
