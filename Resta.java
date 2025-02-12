import java.util.Scanner;
class Resta{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Dame un numero");
int num3=sc.nextInt();
System.out.println("Dame otro numero");
int num4=sc.nextInt();
System.out.println(resta(num3,num4));
}
public static int resta(int num3,int num4){
 return num3-num4;
}
}
