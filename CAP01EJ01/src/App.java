import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    System.out.println("Escriba el valor de a: ");
    Scanner sc = new Scanner (System.in);
        int a;
        a=sc.nextInt();

    System.out.println("Escriba el valor de b: "); //Escribimos por pantalla
        int b=sc.nextInt(); //Leemos el valor que indicamos

        int c=a+b;
        if (a>b) //Se ponen llaves si hay mas de una condición
            System.out.print(a+"es mayor que "+b);

    System.out.println("La suma de a + b = "+c);
    sc.close();
    }
}