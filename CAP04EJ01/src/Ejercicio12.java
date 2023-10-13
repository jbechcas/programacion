import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        System.out.println("1)¿Html es un lengauje de programación?");
        System.out.println("1 Lenguaje de Marca");
        System.out.println("2 Si, es un lenguaje de programación");
        System.out.println("3 ninguna de las anteriores");
        Scanner sc = new Scanner (System.in);
        int opcion = sc.nextInt();
        int contador = 0;
        switch (opcion) {
            case 1:
                contador = contador + 1;
                break;
        
            default:
                System.out.print("Opción incorrecta");
                break;
        }
        System.out.println("2)¿Que te permite git?");
        System.out.println("1 Git no existe");
        System.out.println("2 Te permite subir tus repostiorios a la nube");
        System.out.println("3 Es un IDE");
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                break;
            case 2:
                contador = contador + 1;
                break;
            case 3:
                break;
        
            default:
                System.out.print("Opción incorrecta");
                break;
        }
        System.out.println("3)¿Que es Visual Code?");
        System.out.println("1 Un entorno de desarrollo");
        System.out.println("2 Un lenguaje de programación");
        System.out.println("3 Todas las anteriores son falsas");
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                contador = contador + 1;
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.print("Opción incorrecta");
                break;
        }
        System.out.println("4)Python es un lenguaje de...");
        System.out.println("1 Bajo nivel");
        System.out.println("2 Intermedio");
        System.out.println("3 Alto nivel");
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                contador = contador + 1;
                break;
        
            default:
                System.out.print("Opción incorrecta");
                break;
        }
        System.out.println("5)Java es un lenguaje de ...");
        System.out.println("1 Bajo nivel");
        System.out.println("2 Nivel intermedio");
        System.out.println("3 Alto nivel");
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                contador = contador + 1;
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.print("Opción incorrecta");
                break;
        }
        System.out.println("6)¿Cual de todas las opciones nos permite comentar en java?");
        System.out.println("1 ++");
        System.out.println("2 ////");
        System.out.println("3 //");
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                contador = contador + 1;
                break;
            default:
                System.out.print("Opción incorrecta");
                break;
        }
        System.out.println("7)¿Que tipo de variable tenemos que utilizar para guardar una cadena de caracteres?");
        System.out.println("1 String");
        System.out.println("2 Double");
        System.out.println("3 Int");
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                contador = contador + 1;
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.print("Opción incorrecta");
                break;
        }
        System.out.println("8)¿Cual de los siguientes es un lenguaje de marca?");
        System.out.println("1 xml");
        System.out.println("2 html");
        System.out.println("3 Todos los anteriores");
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                contador = contador + 1;
                break;
            default:
                System.out.print("Opción incorrecta");
                break;
        }
        System.out.println("9)¿Con que podemos establecer una condicion?");
        System.out.println("1 for");
        System.out.println("2 if");
        System.out.println("3 switch");
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                break;
            case 2:
                contador = contador + 1;
                break;
            case 3:
                break;
            default:
                System.out.print("Opción incorrecta");
                break;
        }
        System.out.println("10) ¿Cual lenguaje es mas facil de aprender?");
        System.out.println("1 java");
        System.out.println("2 C++");
        System.out.println("3 python");
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                contador = contador + 1;
                break;
            default:
                System.out.print("Opción incorrecta");
                break;
        }
        System.out.print("Has sacado un " + contador);
        sc.close();
    }
}
