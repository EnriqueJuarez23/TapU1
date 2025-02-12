import java.util.Scanner;
class Modulo{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Dame un numero");
int num9=sc.nextInt();
System.out.println("Dame otro numero");
int num10=sc.nextInt();
System.out.println(modulo(num9,num10));
}
public static int modulo(int num9,int num10){
 return num9%num10;
}
}
