import java.util.Scanner;

public class Ejercicio44 {
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
        System.out.print("Introduce la posicion en la que quieres insertar: "); 
        int partir = sc.nextInt();
        System.out.print("Introduce el digito que quieres insertar: "); 
        int insertar = sc.nextInt();
        sc.close();
        num = VoltearNumero(num);
        String num_string = num + "";
        int digito = num_string.length();
        System.out.print("El número resultante es ");
        for (int i = 1; i<= partir; i++){
            int resto = num%10;
            num = num/10;
            System.out.print(resto);
            if(i==partir){
                System.out.print(insertar);
            }
        }
        for (int i = 1; i<= digito - partir; i++){
            int resto = num%10;
            num = num/10;
            System.out.print(resto);
        }
    }
}
