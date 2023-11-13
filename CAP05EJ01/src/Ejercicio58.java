import java.util.Scanner;

public class Ejercicio58 {
    public static double MediaDigitos(int num){
        String longitud = num + "";
        int suma = 0;
        int longitudnum = longitud.length();
        for(int i = 1;i<=longitudnum;i++ ){
            int digito = num%10;
            num = num/10;
            suma = suma + digito;
        }
        double media = (double)suma/((double)longitudnum);
        return media;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Introduzca un número: ");
        int num = sc.nextInt();
        double media = MediaDigitos(num);
        System.out.print(media);
        sc.close();
    }
}
