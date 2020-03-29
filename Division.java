import MyPackage.College;
import java.util.Scanner;
package my;
public class Division extends College {
    static {
        System.out.println("Ajay Arjunwadkar"+" "+"Divison:A"+" "+"Roll No:305");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Division");
        char div = sc.nextLine().charAt(0);
        Division d = new Division();
        d.college();
        System.out.println("Division: " + div);
    }
}
