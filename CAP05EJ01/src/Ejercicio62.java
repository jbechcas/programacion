import java.util.Scanner;

public class Ejercicio62 {
    public static boolean NumeroAfortunado(boolean afortunado,int num){
        String longnumstring = num + "";
        int numsuerte = 0;
        int nummalsuerte = 0;
        int longitudnum = longnumstring.length();
        for(int i = 1;i<=longitudnum;i++){
            int digito = num % 10;
            num = num/10;
            if (digito == 0 || digito == 1 || digito == 2 || digito == 4 || digito == 5 || digito == 6){
                nummalsuerte = nummalsuerte + 1;
            }else{
                afortunado = false;
                numsuerte = numsuerte + 1;
            }
        }
        if(numsuerte>nummalsuerte){
            afortunado = true;
        }
        return afortunado;
    }
    public static void main(String[] args) {
        boolean afortunado = false;
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduzca un número: ");
        int num = sc.nextInt();
        sc.close();
        afortunado = NumeroAfortunado(afortunado, num);
        if(afortunado){
            System.out.print("El " + num + " es un número afortunado.");
        }else{
            System.out.print("El " + num + " no es un número afortunado.");
        }
    }
}
