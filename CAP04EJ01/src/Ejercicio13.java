import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        System.out.println("Este programa ordenar de mayor a menor");
        System.out.println("Introduce el número 1:");
        Scanner sc = new Scanner (System.in);
        int numero1 = sc.nextInt();
        System.out.println("Introduce el número 2:");
        int numero2 = sc.nextInt();
        System.out.println("Introduce el número 3:");
        int numero3 = sc.nextInt();
        sc.close();
        if(numero1==numero2 && numero1==numero3){
            System.out.print(numero1 + ">" + numero2 + ">" + numero3);
        }else{
            if(numero1>=numero2 && numero1>=numero3){
                if(numero2>=numero3){
                    System.out.print(numero1 + ">" + numero2 + ">" + numero3);
                }else{
                    System.out.print(numero1 + ">" + numero3 + ">" + numero2);
                }
            }
            if(numero2>=numero1 && numero2>=numero3){
                if(numero3>=numero1){
                    System.out.print(numero2 + ">" + numero3 + ">" + numero1);
                }else{
                    System.out.print(numero2 + ">" + numero1 + ">" + numero3);
                }
            }
            if(numero3>=numero2 && numero3>=numero1){
                if(numero2>=numero1){
                    System.out.print(numero3 + ">" + numero2 + ">" + numero1);
                }else{
                    System.out.print(numero3 + ">" + numero1 + ">" + numero3);
                }
            }
        }
    }
}
