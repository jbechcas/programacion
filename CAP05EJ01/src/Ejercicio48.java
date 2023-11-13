import java.util.Scanner;

public class Ejercicio48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Introduzca un número entero: ");

        int num = sc.nextInt();

        System.out.print("Los digitos que aparecen son: ");

        int digito;
        int num2 = num;
        String almNum = num + "";
        int longNum = almNum.length();

        for(int i = 0;i <= 9;i ++){
            num = num2;
            for(int j = 1;j<=longNum;j++){
                digito = num%10;
                num = num/10;
                if(digito==i){
                    System.out.print(digito + " ");
                    j = longNum;
                }
            }
        }

        System.out.println(" ");
        System.out.print("Los digitos que no aparecen son: ");


        for(int i = 0;i <= 9;i ++){
            boolean valido = true;
            num = num2;
            for(int j = 1;j<=longNum;j++){
                digito = num%10;
                num = num/10;
                if(digito==i){
                    valido = false;
                }
            }
            if (valido){
                System.out.print(i + " ");
            }
        }
        

        sc.close();
    }
}
