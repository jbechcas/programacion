import java.util.Scanner;

public class Ejercicio50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Introduzca la altura (5 como mínimo): ");

        int altura = sc.nextInt();
        boolean verificacion = false;

        while (!verificacion) {
            if(altura>=5){
                verificacion = true;
            }else{
                System.out.println("Altura incorrecta");
                System.out.print("Introduzca la altura (5 como mínimo): ");

                altura = sc.nextInt();
            }            
        }

        System.out.print("Introduzca el número de espacios entre los números (1 como mínimo): ");

        int espacios = sc.nextInt();
        verificacion = false;

        while (!verificacion) {
            if(espacios>=1){
                verificacion = true;
            }else{
                System.out.println("Espacios incorrectos");
                System.out.print("Introduzca el número de espacios entre los números (1 como mínimo): ");

                espacios = sc.nextInt();
            }            
        }

        sc.close();

        for(int i = 1;i<=altura;i++){
            if(i==1 || i==3 | i ==altura){
                System.out.print("*");
                for(int k = 1;k<=espacios;k++){
                    System.out.print(" ");
                }
                System.out.print("*****");
                for(int k = 1;k<=espacios;k++){
                    System.out.print(" ");
                }
                System.out.print("*****");
            }else{
                if(i==2){
                    System.out.print("*");
                    for(int k = 1;k<=espacios;k++){
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    for(int k = 1;k<=espacios+4;k++){
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    }else{
                        System.out.print("*");
                        for(int k = 1;k<=espacios+4;k++){
                            System.out.print(" ");
                        }
                        System.out.print("*");
                        for(int k = 1;k<=espacios+4;k++){
                            System.out.print(" ");
                        }
                        System.out.print("*");
                    }
                }
                System.out.println(" ");
            }
        }
}

