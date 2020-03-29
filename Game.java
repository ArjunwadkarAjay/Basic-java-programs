import java.util.*;
class Player {
 String n;
 String c;
 Player(String a, String b) {
 n = new String(a);
 c = new String(b);
 }
 void display() {
 System.out.println("Player Name : " + n + "\nCountry : " + c);
 }
}
class Cricket extends Player {
 int runs;
 Cricket(String A, String b, int a) {
 super(A, b);
 runs = a;
 }
 void display() {
 super.display();
 System.out.println("Player Runs : " + runs);
 }
}
class FootBall extends Player {
 int goals;
 FootBall(String A, String b, int a) {
 super(A, b);
 goals = a;
 }
 void display() {
 super.display();
 System.out.println("Player Goals : " + goals);
 }
}
class Hockey extends Player {
 int goals;
 Hockey(String A, String b, int a) {
 super(A, b);
 goals = a;
 }
 void display() {
 super.display();
 System.out.println("Player Goals : " + goals);
 }
}
class Game {
static
 {
 System.out.println("Hitesh Bhalerao"+" "+"Divison:A"+" "+"Roll No:307");
 }
 public static void main(String args[]) {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the total number of Players : ");
 int n = sc.nextInt();
 Cricket C[] = new Cricket[n];
 FootBall F[] = new FootBall[n];
 Hockey H[] = new Hockey[n];
 for (int i = 0; i < n; i++) {
 System.out.println("Enter Name and Country : ");
 String s1 = new String(sc.next());
 String s2 = new String(sc.next());
 System.out.println("Enter runs of " + s1 + " in cricket : ");
 int r = sc.nextInt();
 C[i] = new Cricket(s1, s2, r);
 System.out.println("Enter goals of " + s1 + " in football : ");
 r = sc.nextInt();
 F[i] = new FootBall(s1, s2, r);
 System.out.println("Enter goals of " + s1 + " in Hockey : ");
 r = sc.nextInt();
 H[i] = new Hockey(s1, s2, r);
 }
 int c;
 do {
 System.out.println("Enter Your Choice (Scores)
:\n1.Cricket\n2.FootBall\n3.Hockey\n");
 c = sc.nextInt();
 switch (c) {
 case 1:
 System.out.println("Cricket Scores are :");
for (int i = 0; i < n; i++) {
 System.out.println("Player : " + C[i].n + " Country :
" + C[i].c + " Runs : " + C[i].runs);
 }
 break;
 case 2:
 System.out.println("FootBall Scores are :");
for (int i = 0; i < n; i++) {
 System.out.println("Player : " + F[i].n + " Country :
" + F[i].c + " Runs : " + F[i].goals);
 }
break;
 case 3:
 System.out.println("Hockey Scores are :");
for (int i = 0; i < n; i++) {
 System.out.println("Player : " + H[i].n + " Country :
" + H[i].c + " Runs : " + H[i].goals);
 }
break;
 }
 } while (c != 4);
 }
}