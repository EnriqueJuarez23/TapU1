import java.util.Scanner;
class Suma{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.println("Dame un numero");
int num1=sc.nextInt();
System.out.println("Dame otro numero");
int num2=sc.nextInt();
System.out.println(sumar(num1,num2));
}
public static int sumar(int num1, int num2){
	return num1+num2;
}
}
