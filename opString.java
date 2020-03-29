import java.util.*;
class opString
{
int freq(String a ,char s)
{
  char az[]=a.toCharArray();
  int c=0;
  for(int i=0;i<az.length;i++)
  {
     if(az[i]==s)
     {
         c++;
     }
    
  }
return c;}
static
	{
		System.out.println("Ajay Arjunwadkar"+" "+"Divison:A"+" "+"Roll No:305");
    }   
public static void main(String arg[])
{
Scanner sc =new Scanner (System.in);
opString b=new opString();
int choice,ch=0;
char temp;
do{
    System.out.println("Enter the choice");
    System.out.println("1.Display the first unique non repeating character  ");
    System.out.println("2.display the freq. of all characters");
    System.out.println("3.entered string is palindrome or not");
    System.out.println("4.check for anagram");
    System.out.println("5.exit");
    choice=sc.nextInt();
    switch(choice)
    {
       case 1:System.out.printf("Enter the String:");
              String s1=sc.next();
              x:for(int i=0;i<s1.length();i++)
              {
                if(b.freq(s1,s1.charAt(i))==1)
                {
                 System.out.println(s1.charAt(i)+" " +"is the first unique character");
                 break x;
                }
              }               
              break;
       case 2:System.out.printf("Enter the String:");
              String s2=sc.next();
              
              char a[]=s2.toCharArray();
              for(int i=0;i<s2.length();i++)
              {
                  for(int j=0;j<s2.length();j++)
                  {
                    if(a[j]==a[i]&& i!=j)
                    {
                      a[j]='*';}
                      
                  }
                  if(a[i]!='*')
                  {
                    System.out.println(a[i]+" "+"has frequency"+" "+b.freq(s2,a[i]));                  
                    continue ;
                  }
                 
                
                }
              
              break;
       case 3:System.out.printf("Enter the String:");
              String s3=sc.next();
              char sr3[]=s3.toCharArray();
              char srr[]=new char[sr3.length];
              for(int i=s3.length()-1, j=0;i>=0&&j<s3.length();i--,j++)
              {
                srr[i]=sr3[j];
              }
              String s =new String(srr);
              for(int i=0;i<srr.length;i++)
              {
                   if(!s3.equalsIgnoreCase(s)){ch=1;}
              }   
              if(ch==1)
              {System.out.println("not palindrome");}
              else
              {System.out.println(" is palindrome");}                
              break;
       case 4:System.out.printf("Enter the 1st String:");
              String a1=sc.next();
              System.out.printf("Enter the 2nd String:");
              String a2=sc.next();
              if(a1.length()!=a2.length())
              {System.out.println("entered strings are not anagram");}
              else
              {
                  char ar1[]=(a1.toLowerCase()).toCharArray();
                  char ar2[]=(a2.toLowerCase()).toCharArray();
                  for(int i=0;i<ar1.length;i++)
                 {
                   for(int j=0;j<ar1.length-1;j++)
                   {
                    if(ar1[j]>ar1[j+1]){temp=ar1[j];ar1[j]=ar1[j+1];ar1[j+1]=temp;}    
                    if(ar2[j]>ar2[j+1]){temp=ar2[j];ar2[j]=ar2[j+1];ar2[j+1]=temp;} 
                   }  
 
                 } 
                 for(int i=0;i<ar1.length;i++)
                 {
                   if(ar1[i]!=ar2[i]){ch=1;}
                 }   
                 if(ch==1)
                {System.out.println("not anagram");}
                else
                {System.out.println(" is Anagram");}  
                break;
             } 
       
    }
    
   
}while(choice!=5);




}
}

