import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
//Realiza un programa que muestre al azar el nombre de una carta de la baraja
//francesa. Esta baraja está dividida en cuatro palos: picas, corazones, diamantes
//y tréboles. Cada palo está formado por 13 cartas, de las cuales 9 cartas son
//numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el
//1). Para convertir un número en una cadena de caracteres podemos usar
Scanner sc = new Scanner (System.in);
System.out.print("Introduce picas,corazones,diamantes o treboles: ");
int paloale = (int)(Math.random()*4)+1;
String palo = "";
switch (paloale) {
    case 1:
        palo = "Diamantes";
        break;
    case 2:
        palo = "Picas";
        break;
    case 3:
        palo = "Corazones";
        break;
    case 4:
        palo = "Treboles";
    default:
        System.out.println("Has introducido una opción incorrecta ");
        break;
}
int numerocarta = (int)(Math.random()*13+1);
switch (numerocarta) {
    case 2,3,4,5,6,7,8,9,10:
        System.out.print(palo + " " + numerocarta);
        break;
    case 1:
        System.out.print(palo + " " + "A");
        break;
    case 11:
        System.out.print(palo + " " + "J");
        break;
    case 12:
        System.out.print(palo + " " + "Q");
        break;
    case 13:
        System.out.print(palo + " " + "K" );
        break;

    default:
        break;
}

sc.close();
    }
}
