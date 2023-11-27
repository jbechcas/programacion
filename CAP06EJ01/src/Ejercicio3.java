import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
    //Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
    //de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as
    Scanner sc = new Scanner (System.in);
int paloale = (int)(Math.random()*4+1);
String palo = "";
switch (paloale) {
    case 1:
        palo = "Oro";
        break;
    case 2:
        palo = "Copa";
        break;
    case 3:
        palo = "Espada";
        break;
    case 4:
        palo = "Baston";
    default:
        System.out.println("Has introducido una opción incorrecta ");
        break;
}
int numerocarta = (int)(Math.random()*10+1);
switch (numerocarta) {
    case 2,3,4,5,6,7:
        System.out.print(palo + " " + numerocarta);
        break;
    case 1:
        System.out.print(palo + " " + "as");
        break;
    case 8:
        System.out.print(palo + " " + "sota");
        break;
    case 9:
        System.out.print(palo + " " + "caballo");
        break;
    case 10:
        System.out.print(palo + " " + "rey" );
        break;

    default:
        break;
}

sc.close();
    }
}
