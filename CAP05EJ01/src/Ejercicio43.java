import java.util.Scanner;

public class Ejercicio43 {
    public static int VoltearNumero(int num){
        boolean salida = true;
        int digito;
        String numeroalreves = "";
        while(salida){
            digito= num%10;
            num = num/10;
            numeroalreves =numeroalreves + digito;
            if(num<1){
                salida = false;
            }
        }
        num = Integer.parseInt(numeroalreves);
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduce un número positivo: ");
        int num = sc.nextInt();
        System.out.print("Introduce la posicion a partir de la cual quieres partir el numero: "); 
        int partir = sc.nextInt();
        sc.close();
        num = VoltearNumero(num);
        String num_string = num + "";
        int digito = num_string.length();
        System.out.print("Los números partidos son el ");
        for (int i = 1; i< partir; i++){
            int resto = num%10;
            num = num/10;
            System.out.print(resto);
        }
        System.out.print(" y el ");
        for (int i = 1; i<= digito + 1 - partir; i++){
            int resto = num%10;
            num = num/10;
            System.out.print(resto);
        }
    }
}