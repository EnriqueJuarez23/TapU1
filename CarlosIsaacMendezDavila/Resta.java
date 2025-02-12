import java.util.Scanner;

class Resta {
    
public static int resta(int a, int b) {
  return a - b;
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();
        
        
  int resultado = resta(num1, num2);
  System.out.println("La resta es: " + resultado);
      
}
}
 
