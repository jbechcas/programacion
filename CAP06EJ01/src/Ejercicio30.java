import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
        int altura = sc.nextInt();
        boolean salida = false;
        while (!salida) {
            if(altura>=4){
                salida = true;
            }else{
                System.out.println("Dato erróneo");
                System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
                altura = sc.nextInt();
            }
        }
        salida = false;
        System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
        int anchura = sc.nextInt();
        while (!salida) {
            if(anchura>=4){
                salida = true;
            }else{
                System.out.println("Dato erróneo");
                System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
                anchura = sc.nextInt();
            }
        }
        //(max-desplazamiento+1)) + desplazamiento;
        int fila = (int)(Math.random()*(altura-1-2+1)+2);
        int columna = (int)(Math.random()*(anchura*2-3-1+1)+1);
        for(int i = 1;i<=altura;i++){
            if(i==1 || i==altura){
                for(int j = 1;j<=anchura;j++){
                System.out.print("* ");
                }
            }else{
                System.out.print("*");
                for(int j = 1;j<=anchura*2-3;j++){
                    if(i==fila && j == columna){
                        System.out.print("&");
                    }else{
                        System.out.print(" ");
                    }
                    
                }
                System.out.print("*");
            }
            System.out.println(" ");
            
        }
        System.out.println("Fila: " + fila);
        System.out.println("columna: " + columna);
        sc.close();
    }
}
