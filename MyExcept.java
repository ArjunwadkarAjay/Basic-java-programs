import java.util.*;
class My extends Exception
{
My(String m)
{
super(m);
}
}
class MyExcept
{
static
 {
System.out.println("Ajay Arjunwadkar"+" "+"Divison:A"+" "+"Roll No:305");
 }

public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("\nEnter the username : ");
String name=sc.next();
System.out.println("\nEnter the password : ");
String passwd = sc.next();
try
{
if(passwd.length()<=8)
throw new My(name +" Please note ,"+"The password should be minimum 8 characters long...");
else if(!p.equals(pass))
{
	throw new pass("Incorrect Password...");
}
else
{
	System.out.println("Successfull Login...");
}
}catch(My M)
{System.out.println(M.getMessage());}
}
}