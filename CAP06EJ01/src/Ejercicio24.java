import java.util.Scanner;

public class Ejercicio24 {
    public static void DigitoAleatorio(int num){
        String longnumstr = num + "";
        int longitud = longnumstr.length();
        int digitoAleatorio = (int)(Math.random()*longitud)+1;
        for(int i = 1;i<=longitud;i++){
            int ditigito = num%10;
            num = num/10;
            if (digitoAleatorio == i) {
                System.out.print(ditigito);
                i = longitud + 1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Por favor, introduzca un número entero positivo: ");
        int num = sc.nextInt();
        DigitoAleatorio(num);
        sc.close();
    }
}
