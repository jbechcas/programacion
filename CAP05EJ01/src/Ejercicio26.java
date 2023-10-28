import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduce un número: ");
        int n = sc.nextInt();
        System.out.print("Introduce cual digito quieres ver por pantalla, para ello introduce la posición: ");
        int d = sc.nextInt();
        boolean salida = false;
        double p = n;
        while(salida == false){
            p = p/10;
            if (p < 1){
                salida = true;
            }
        }
        p = p * 10;
        for (int i = 1;i<d;i++){
                if(d == i){
                    break;
                }else{
                    p = p*10;
                }
            }
        p = (int)p;
        System.out.print((int)p%10);
        sc.close();
    }
}
