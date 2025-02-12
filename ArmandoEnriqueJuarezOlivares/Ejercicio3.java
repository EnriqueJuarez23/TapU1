import java.util.Scanner;
class Ejercicio3 {
    public static void main(String[] args) {
        Scanner op = new Scanner (System.in);
        System.out.println("Ingresa un numero:");
        int a = op.nextInt();
        System.out.println("Ingresa un numero:");
        int b = op.nextInt();
        System.out.println("-----------------------------------");
        System.out.println(+a+"*"+b+ "="+ multiplicar(a, b));
    }
    public static int multiplicar(int a, int b){
        return a*b;
    }
}