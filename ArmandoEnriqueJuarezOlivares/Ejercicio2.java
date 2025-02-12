import java.util.Scanner;
class Ejercicio2 {
    public static void main(String[] args) {
        Scanner op = new Scanner (System.in);
        System.out.println("Ingresa un numero:");
        int a = op.nextInt();
        System.out.println("Ingresa un numero:");
        int b = op.nextInt();
        System.out.println("-----------------------------------");
        System.out.println(+a+"-"+b+ "="+ Restar(a, b));
    }
    public static int Restar(int a, int b){
        return a-b;
    }
}