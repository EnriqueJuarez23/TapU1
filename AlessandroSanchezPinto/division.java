import java.util.Scanner;
class Divison{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Dame un numero");
int num7=sc.nextInt();
System.out.println("Dame otro numero");
int num8=sc.nextInt();
System.out.println(divison(num7,num8));
}
public static int division(int num7,int num8){
 return num7/num8;
}
}
