import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        boolean salida = false;
        int contador = 0;
        int contadorMedia=0;
        int numeroMedia = 0;
        int parMayor = 0;

        while(salida==false){
            System.out.print("Introduce un número: ");
            int numero = sc.nextInt();
            if (numero<0){
                salida = true;
            }else if(numero%2==0 && numero>parMayor){
                parMayor = numero;
            }else if(numero%2!=0){
                numeroMedia = numeroMedia + numero;
                contadorMedia=contadorMedia + 1;
            }
            contador = contador+1;
        }
        int media = (numeroMedia/contadorMedia);
        System.out.println("Has introducido " + contador + " números");
        System.out.println("El número par mayor es " + parMayor);
        System.out.print("La media de los numeros impares es " + (media));
        sc.close();
    }
}
