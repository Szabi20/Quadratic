import java.util.Scanner;
public class Quadratic { public static void main(String[] args){


    Scanner szam = new Scanner(System.in);
    System.out.println("Kérem az a értékét:");
    int a = szam.nextInt();
     Scanner szam2 = new Scanner(System.in);
    System.out.println("Kérem az b értékét:");
    int b = szam2.nextInt();
     Scanner szam3 = new Scanner(System.in);
    System.out.println("Kérem az c értékét:");
    int c = szam3.nextInt();

    int x=a;
    int szamit=(x*x)+(b*x)+(c*x);

    System.out.println(szamit);


}}
