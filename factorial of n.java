import java.util.Scanner;
import java.util.InputMismatchException;
public class Main
 {
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the num");
int num =sc.nextInt();
long factorial = 1 ; 
try{
if (num>0)
{
for (int i = 1 ; i <= num; ++ i )
{
  factorial = factorial * i;
}
System.out.printf("Factorial of % d =%d" , num,factorial);
}
else 
    System.out.printf("Enter valid input");
}catch(InputMismatchException e){
System.out.println(e.getMessage());
}
}
}
