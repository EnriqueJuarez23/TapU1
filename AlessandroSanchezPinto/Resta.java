import java.util.Scanner;
class Resta{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Dame un numero");
int num5=sc.nextInt();
System.out.println("Dame otro numero");
int num6=sc.nextInt();
System.out.println(restar(num5,num6));
}
public static int restar(int num5,int num6){
 return num5-num6;
}
}
