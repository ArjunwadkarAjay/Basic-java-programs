import java.util.*;
class multi
{
static
 {
 System.out.println("Ajay Arjunwadkar"+" "+"Divison:A"+" "+"Roll No:305");
 }
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the two Numbers : ");
try
{
int m = sc.nextInt();
int n = sc.nextInt();
if(m/n == 1)
System.out.println(m+" are " +n+" equal.");
else
System.out.println(m+" are not " +n+" equal.");
}
catch(ArithmeticException e)
{
System.out.println(e + "\0");
}
catch(NumberFormatException e)
{
System.out.println(e + "Entered Number is in String");
}
catch(InputMismatchException e)
{
System.out.println(e + "Entered Number is in char");
}
}
}