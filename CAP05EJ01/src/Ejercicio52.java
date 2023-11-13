import java.util.Scanner;
public class Ejercicio52 {
    public static int DesplazarNumero(int num){
        String longitud = num + "";
        int longitudnum = longitud.length();
        for(int i = 1;i<=longitudnum-1;i++ ){
            int digito = num%10;
            num = num/10;
            String numstring = digito + "" + num;
            num = Integer.parseInt(numstring);
        }
    return num;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduzca un número:");
        int num = sc.nextInt();
        num = DesplazarNumero(num);
        System.out.print("El número resultado es " + num);
        sc.close();
    }
}
