import java.util.*;
abstract class vol
{
double r;
abstract void volume(double r);
}
//+++++++++++++++++++++++++++++++++
class s extends vol
{
void volume(double r)
{
double vs = (4 * Math.PI * Math.pow(r,3))/3.0 ;
System.out.println("Volume is "+vs);
}
}
//+++++++++++++++++++++++++++++++++
class h extends vol
{
void volume(double r)
{
double vs = (2 * Math.PI * Math.pow(r,3))/3.0 ;
System.out.println("Volume is "+vs);
}
}
class Volume
{
static
 {
 System.out.println("Hitesh Bhalerao"+" "+"Divison:A"+" "+"Roll No:307");
 }
public static void main(String args[])
{
System.out.println("Enter radius :");
Scanner sc = new Scanner(System.in);
double ra = sc.nextDouble();
int c;
do
{
System.out.println("Enter Choice:\n1.Sphere\n2.Hemisphere");
c = sc.nextInt();
switch(c)
{
case 1:
s S = new s();
S.volume(ra);
break;
case 2:
h H = new h();
H.volume(ra);
break;
}
}while(c!=3);
}
}