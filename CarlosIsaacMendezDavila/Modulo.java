import java.util.Scanner;

class Modulo {
   
    public static int modulo(int a) {
        return a % 2;     }
    
    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Introduce un número: ");
        int num = scanner.nextInt();
        
        
        int resultado = modulo(num);
        System.out.println("El módulo es: " + resultado);
        
      
    }
}
