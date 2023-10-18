import java.util.Scanner;

public class Ejercicio20 {

  public static void main(String[] args) {
    
try {
System.out.print("Introduce un número para ver si es capicua: ");
Scanner sc = new Scanner (System.in);
   int n = sc.nextInt();
    if (n < 10) {
     System.out.println("El número introducido es capicúa.");
    }
    else if ((n >= 10) && (n < 100)) {
      if(n % 11 ==0) {
        System.out.println("El número introducido es capicúa.");
      }else{
        System.out.println("El número no es capicúa.");
      }
    }

    else if ((n >= 100) && (n < 1000)) {
      if ((n / 100) == (n % 10)) {
        System.out.println("El número introducido es capicúa.");
      }else{
        System.out.println("El número no es capicúa.");
      }
    }

    else if ((n >= 1000) && (n < 10000)) {
      if (((n / 1000) == (n % 10)) && ((( n / 100 ) % 10)== (( n / 10) % 10))) {
        System.out.println("El número introducido es capicúa.");
      }else{
        System.out.println("El número no es capicúa.");
      }
    }
    
    else if (n >= 10000) {
      if (((n / 10000) == (n % 10) ) && ((((n / 1000) % 10)) == ((n / 10) % 10))) {
        System.out.println("El número introducido es capicúa.");
      }else{
        System.out.println("El número no es capicúa.");
      }
    }
    sc.close();
} catch (Exception e) {
    System.out.println("Has introducido un dato erroneo, vuelve a ejecutar el programa");
}
  }
}