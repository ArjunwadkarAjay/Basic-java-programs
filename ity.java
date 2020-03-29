import java.util.*;
interface Uni
{
int code = 524;
public void display();
}
class Clg
{
String cname;
Clg(String a)
{
cname = a;
}
public void display()
{
System.out.println("\nName of College : "+cname);
}
}
class Std extends Clg implements Uni
{
String sname;
Std(String a ,String b)
{
super(a);
sname = b;
}
public void display()
{
super.display();
System.out.println("University Code : "+code+"\nName of Student : "+sname);
}
}
//---
class inter
{
static
 {
 System.out.println("Name : Arun Addagatla\nRoll.No : 302\nBatch : A1");
 }
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of Students : \n");
int n = sc.nextInt();
Std S[] = new Std[n];
for(int i=0;i<n;i++)
{
System.out.println("\nEnter the name and college of student : \n");
String s1 = new String(sc.next());
String s2 = new String(sc.next());
S[i] = new Std(s2,s1);
}
for(int i=0;i<n;i++)
{
System.out.println("\nDetails : ");
S[i].display();
}
}
}