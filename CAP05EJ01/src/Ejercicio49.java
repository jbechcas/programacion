import java.util.Scanner;
public class Ejercicio49 {
    public static boolean NumeroPrimo(int num, boolean primo){
        primo = true;
        for(int i=2;i<num;i++){
            if(num%i==0){
                primo = false;
            }
        }
    return primo;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        boolean salida = false;
        System.out.println("Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un número primo:");
        int num = 0;
        int numMax = 0;
        int numMin = 0;
        boolean primo = false;
        int total = 0;
        int contador = 0;
        while (!salida){
            int antnum = num;
            num = sc.nextInt();
            primo = NumeroPrimo(num, primo);
            if(primo){
                salida = true;
            }else{
                if(num>=antnum){
                numMax = num;
                }
                if(num<=antnum || antnum==0){
                    numMin = num;
                }
                total = total + num;
                contador = contador + 1;
            }
            
        }
        System.out.println("Máximo: " + numMax);
        System.out.println("Mínimo: " + numMin);
        System.out.println("Total: " + ((double)total/(double)contador));
        sc.close();
    }
}
