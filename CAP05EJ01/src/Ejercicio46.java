import java.util.Scanner;

public class Ejercicio46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        boolean salida = true;
        int anchura = 0;
        while (salida){
            System.out.print("Introduce la anchura del rectángulo: ");
            anchura = sc.nextInt();
            if (anchura>=2){
                salida = false;
            }else{
                System.out.println("Lo siento, los datos introducidos no son correctos, el valor mínimo para la anchura y la altura es 2.");
            }
        }
        salida = true;
        int altura = 0;
        while (salida){
            System.out.print("Introduce la altura del rectángulo: ");
            altura = sc.nextInt();
            if (altura>=2){
                salida = false;
            }else{
                System.out.println("Lo siento, los datos introducidos no son correctos, el valor mínimo para la anchura y la altura es 2.");
            }
        }

        for(int i = 1;i<=altura;i++){
            
            if(i == 1 || i == altura){
                for(int j = 1;j<=anchura; j ++){
                    System.out.print("* ");
                }   
            }else{
                System.out.print("*");
                for(int j = 1;j<=anchura*2 -3; j ++){
                    System.out.print(" ");
                }
                System.out.print("*");   
            }
            System.out.println(" ");
        }

        sc.close();
    }
}
